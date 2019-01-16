package com.mydvdstore.introduction;


import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan({"com.mydvdstore.model.tables"})
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class PesistenceContextIntegrationTest {

    @Autowired
    private Environment environment;


    @Bean
    public DataSource dataSource()
    {
        PGSimpleDataSource ds = new PGSimpleDataSource();

        ds.setURL(environment.getRequiredProperty("db_url"));
        ds.setUser(environment.getRequiredProperty("db_username"));
        ds.setPassword(environment.getRequiredProperty("db_password"));

        return dataSource();
    }


    @Bean
    public TransactionAwareDataSourceProxy transactionAwareDataSourceProxy()
    {
        return new TransactionAwareDataSourceProxy(dataSource());
    }

    @Bean
    public DataSourceTransactionManager transactionManager()
    {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public DataSourceConnectionProvider connectionProvider()
    {
        return new DataSourceConnectionProvider(transactionAwareDataSourceProxy());
    }

    @Bean
    public ExceptionTranslator exceptionTranslator()
    {
        return new ExceptionTranslator();
    }

    @Bean
    public DefaultDSLContext dsl()
    {
        return new DefaultDSLContext(configuration());
    }

    @Bean
    public DefaultConfiguration configuration()
    {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(new DefaultExecuteListenerProvider(exceptionTranslator()));

        String sqlDialectName = environment.getRequiredProperty("jooq.sql.dialect");
        SQLDialect dialect = SQLDialect.valueOf(sqlDialectName);
        jooqConfiguration.set(dialect);

        return jooqConfiguration;
    }
}

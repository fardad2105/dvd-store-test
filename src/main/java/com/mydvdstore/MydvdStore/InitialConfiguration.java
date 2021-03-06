package com.mydvdstore.MydvdStore;


import com.mydvdstore.introduction.ExceptionTranslator;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

@Configuration
public class InitialConfiguration {

    private DataSource dataSource;

    public DataSourceConnectionProvider connectionProvider(){
        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource));
    }

    public DefaultDSLContext dsl()
    {
        return new DefaultDSLContext(configuration());
    }

    public DefaultConfiguration configuration()
    {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();

        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(new DefaultExecuteListenerProvider(new ExceptionTranslator()));

        return jooqConfiguration;
    }
}

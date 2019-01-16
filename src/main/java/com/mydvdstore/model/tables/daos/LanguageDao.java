/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables.daos;


import com.mydvdstore.model.tables.Language;
import com.mydvdstore.model.tables.records.LanguageRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguageDao extends DAOImpl<LanguageRecord, com.mydvdstore.model.tables.pojos.Language, Integer> {

    /**
     * Create a new LanguageDao without any configuration
     */
    public LanguageDao() {
        super(Language.LANGUAGE, com.mydvdstore.model.tables.pojos.Language.class);
    }

    /**
     * Create a new LanguageDao with an attached configuration
     */
    public LanguageDao(Configuration configuration) {
        super(Language.LANGUAGE, com.mydvdstore.model.tables.pojos.Language.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.mydvdstore.model.tables.pojos.Language object) {
        return object.getLanguageId();
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<com.mydvdstore.model.tables.pojos.Language> fetchByLanguageId(Integer... values) {
        return fetch(Language.LANGUAGE.LANGUAGE_ID, values);
    }

    /**
     * Fetch a unique record that has <code>language_id = value</code>
     */
    public com.mydvdstore.model.tables.pojos.Language fetchOneByLanguageId(Integer value) {
        return fetchOne(Language.LANGUAGE.LANGUAGE_ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.mydvdstore.model.tables.pojos.Language> fetchByName(String... values) {
        return fetch(Language.LANGUAGE.NAME, values);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<com.mydvdstore.model.tables.pojos.Language> fetchByLastUpdate(Timestamp... values) {
        return fetch(Language.LANGUAGE.LAST_UPDATE, values);
    }
}

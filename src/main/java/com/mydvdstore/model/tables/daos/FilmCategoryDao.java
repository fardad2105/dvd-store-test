/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables.daos;


import com.mydvdstore.model.tables.FilmCategory;
import com.mydvdstore.model.tables.records.FilmCategoryRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
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
public class FilmCategoryDao extends DAOImpl<FilmCategoryRecord, com.mydvdstore.model.tables.pojos.FilmCategory, Record2<Short, Short>> {

    /**
     * Create a new FilmCategoryDao without any configuration
     */
    public FilmCategoryDao() {
        super(FilmCategory.FILM_CATEGORY, com.mydvdstore.model.tables.pojos.FilmCategory.class);
    }

    /**
     * Create a new FilmCategoryDao with an attached configuration
     */
    public FilmCategoryDao(Configuration configuration) {
        super(FilmCategory.FILM_CATEGORY, com.mydvdstore.model.tables.pojos.FilmCategory.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Short, Short> getId(com.mydvdstore.model.tables.pojos.FilmCategory object) {
        return compositeKeyRecord(object.getFilmId(), object.getCategoryId());
    }

    /**
     * Fetch records that have <code>film_id IN (values)</code>
     */
    public List<com.mydvdstore.model.tables.pojos.FilmCategory> fetchByFilmId(Short... values) {
        return fetch(FilmCategory.FILM_CATEGORY.FILM_ID, values);
    }

    /**
     * Fetch records that have <code>category_id IN (values)</code>
     */
    public List<com.mydvdstore.model.tables.pojos.FilmCategory> fetchByCategoryId(Short... values) {
        return fetch(FilmCategory.FILM_CATEGORY.CATEGORY_ID, values);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<com.mydvdstore.model.tables.pojos.FilmCategory> fetchByLastUpdate(Timestamp... values) {
        return fetch(FilmCategory.FILM_CATEGORY.LAST_UPDATE, values);
    }
}

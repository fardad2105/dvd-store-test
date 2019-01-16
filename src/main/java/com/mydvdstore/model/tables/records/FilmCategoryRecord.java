/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables.records;


import com.mydvdstore.model.tables.FilmCategory;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FilmCategoryRecord extends UpdatableRecordImpl<FilmCategoryRecord> implements Record3<Short, Short, Timestamp> {

    private static final long serialVersionUID = 1631234176;

    /**
     * Setter for <code>public.film_category.film_id</code>.
     */
    public void setFilmId(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_category.film_id</code>.
     */
    public Short getFilmId() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>public.film_category.category_id</code>.
     */
    public void setCategoryId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_category.category_id</code>.
     */
    public Short getCategoryId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>public.film_category.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_category.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Short, Short> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Short, Short, Timestamp> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Short, Short, Timestamp> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return FilmCategory.FILM_CATEGORY.FILM_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return FilmCategory.FILM_CATEGORY.CATEGORY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return FilmCategory.FILM_CATEGORY.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component1() {
        return getFilmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getFilmId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getCategoryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord value1(Short value) {
        setFilmId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord value2(Short value) {
        setCategoryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord value3(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmCategoryRecord values(Short value1, Short value2, Timestamp value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmCategoryRecord
     */
    public FilmCategoryRecord() {
        super(FilmCategory.FILM_CATEGORY);
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    public FilmCategoryRecord(Short filmId, Short categoryId, Timestamp lastUpdate) {
        super(FilmCategory.FILM_CATEGORY);

        set(0, filmId);
        set(1, categoryId);
        set(2, lastUpdate);
    }
}

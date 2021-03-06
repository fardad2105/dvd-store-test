/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables;


import com.mydvdstore.model.Public;
import com.mydvdstore.model.enums.MpaaRating;
import com.mydvdstore.model.tables.records.NicerButSlowerFilmListRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class NicerButSlowerFilmList extends TableImpl<NicerButSlowerFilmListRecord> {

    private static final long serialVersionUID = 2117941400;

    /**
     * The reference instance of <code>public.nicer_but_slower_film_list</code>
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = new NicerButSlowerFilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<NicerButSlowerFilmListRecord> getRecordType() {
        return NicerButSlowerFilmListRecord.class;
    }

    /**
     * The column <code>public.nicer_but_slower_film_list.fid</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, Integer> FID = createField("fid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.title</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.description</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.category</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.price</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, BigDecimal> PRICE = createField("price", org.jooq.impl.SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.length</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, Short> LENGTH = createField("length", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.rating</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, MpaaRating> RATING = createField("rating", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.mydvdstore.model.enums.MpaaRating.class), this, "");

    /**
     * The column <code>public.nicer_but_slower_film_list.actors</code>.
     */
    public final TableField<NicerButSlowerFilmListRecord, String> ACTORS = createField("actors", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList() {
        this(DSL.name("nicer_but_slower_film_list"), null);
    }

    /**
     * Create an aliased <code>public.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList(String alias) {
        this(DSL.name(alias), NICER_BUT_SLOWER_FILM_LIST);
    }

    /**
     * Create an aliased <code>public.nicer_but_slower_film_list</code> table reference
     */
    public NicerButSlowerFilmList(Name alias) {
        this(alias, NICER_BUT_SLOWER_FILM_LIST);
    }

    private NicerButSlowerFilmList(Name alias, Table<NicerButSlowerFilmListRecord> aliased) {
        this(alias, aliased, null);
    }

    private NicerButSlowerFilmList(Name alias, Table<NicerButSlowerFilmListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NicerButSlowerFilmList as(String alias) {
        return new NicerButSlowerFilmList(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NicerButSlowerFilmList as(Name alias) {
        return new NicerButSlowerFilmList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(String name) {
        return new NicerButSlowerFilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public NicerButSlowerFilmList rename(Name name) {
        return new NicerButSlowerFilmList(name, null);
    }
}

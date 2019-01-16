/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables;


import com.mydvdstore.model.Indexes;
import com.mydvdstore.model.Keys;
import com.mydvdstore.model.Public;
import com.mydvdstore.model.tables.records.StoreRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Store extends TableImpl<StoreRecord> {

    private static final long serialVersionUID = 687313390;

    /**
     * The reference instance of <code>public.store</code>
     */
    public static final Store STORE = new Store();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StoreRecord> getRecordType() {
        return StoreRecord.class;
    }

    /**
     * The column <code>public.store.store_id</code>.
     */
    public final TableField<StoreRecord, Integer> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('store_store_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.store.manager_staff_id</code>.
     */
    public final TableField<StoreRecord, Short> MANAGER_STAFF_ID = createField("manager_staff_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.store.address_id</code>.
     */
    public final TableField<StoreRecord, Short> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.store.last_update</code>.
     */
    public final TableField<StoreRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.store</code> table reference
     */
    public Store() {
        this(DSL.name("store"), null);
    }

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    public Store(String alias) {
        this(DSL.name(alias), STORE);
    }

    /**
     * Create an aliased <code>public.store</code> table reference
     */
    public Store(Name alias) {
        this(alias, STORE);
    }

    private Store(Name alias, Table<StoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private Store(Name alias, Table<StoreRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IDX_UNQ_MANAGER_STAFF_ID, Indexes.STORE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StoreRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<StoreRecord> getPrimaryKey() {
        return Keys.STORE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StoreRecord>> getKeys() {
        return Arrays.<UniqueKey<StoreRecord>>asList(Keys.STORE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<StoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<StoreRecord, ?>>asList(Keys.STORE__STORE_MANAGER_STAFF_ID_FKEY, Keys.STORE__STORE_ADDRESS_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Store as(String alias) {
        return new Store(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Store as(Name alias) {
        return new Store(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(String name) {
        return new Store(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Store rename(Name name) {
        return new Store(name, null);
    }
}

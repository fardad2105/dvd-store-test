/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model;


import com.mydvdstore.model.tables.Actor;
import com.mydvdstore.model.tables.ActorInfo;
import com.mydvdstore.model.tables.Address;
import com.mydvdstore.model.tables.Category;
import com.mydvdstore.model.tables.City;
import com.mydvdstore.model.tables.Country;
import com.mydvdstore.model.tables.Customer;
import com.mydvdstore.model.tables.CustomerList;
import com.mydvdstore.model.tables.Film;
import com.mydvdstore.model.tables.FilmActor;
import com.mydvdstore.model.tables.FilmCategory;
import com.mydvdstore.model.tables.FilmInStock;
import com.mydvdstore.model.tables.FilmList;
import com.mydvdstore.model.tables.FilmNotInStock;
import com.mydvdstore.model.tables.Inventory;
import com.mydvdstore.model.tables.Language;
import com.mydvdstore.model.tables.NicerButSlowerFilmList;
import com.mydvdstore.model.tables.Payment;
import com.mydvdstore.model.tables.Rental;
import com.mydvdstore.model.tables.RewardsReport;
import com.mydvdstore.model.tables.SalesByFilmCategory;
import com.mydvdstore.model.tables.SalesByStore;
import com.mydvdstore.model.tables.Staff;
import com.mydvdstore.model.tables.StaffList;
import com.mydvdstore.model.tables.Store;
import com.mydvdstore.model.tables.records.FilmInStockRecord;
import com.mydvdstore.model.tables.records.FilmNotInStockRecord;
import com.mydvdstore.model.tables.records.RewardsReportRecord;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.impl.DSL;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.actor</code>.
     */
    public static final Actor ACTOR = com.mydvdstore.model.tables.Actor.ACTOR;

    /**
     * The table <code>public.actor_info</code>.
     */
    public static final ActorInfo ACTOR_INFO = com.mydvdstore.model.tables.ActorInfo.ACTOR_INFO;

    /**
     * The table <code>public.address</code>.
     */
    public static final Address ADDRESS = com.mydvdstore.model.tables.Address.ADDRESS;

    /**
     * The table <code>public.category</code>.
     */
    public static final Category CATEGORY = com.mydvdstore.model.tables.Category.CATEGORY;

    /**
     * The table <code>public.city</code>.
     */
    public static final City CITY = com.mydvdstore.model.tables.City.CITY;

    /**
     * The table <code>public.country</code>.
     */
    public static final Country COUNTRY = com.mydvdstore.model.tables.Country.COUNTRY;

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = com.mydvdstore.model.tables.Customer.CUSTOMER;

    /**
     * The table <code>public.customer_list</code>.
     */
    public static final CustomerList CUSTOMER_LIST = com.mydvdstore.model.tables.CustomerList.CUSTOMER_LIST;

    /**
     * The table <code>public.film</code>.
     */
    public static final Film FILM = com.mydvdstore.model.tables.Film.FILM;

    /**
     * The table <code>public.film_actor</code>.
     */
    public static final FilmActor FILM_ACTOR = com.mydvdstore.model.tables.FilmActor.FILM_ACTOR;

    /**
     * The table <code>public.film_category</code>.
     */
    public static final FilmCategory FILM_CATEGORY = com.mydvdstore.model.tables.FilmCategory.FILM_CATEGORY;

    /**
     * The table <code>public.film_in_stock</code>.
     */
    public static final FilmInStock FILM_IN_STOCK = com.mydvdstore.model.tables.FilmInStock.FILM_IN_STOCK;

    /**
     * Call <code>public.film_in_stock</code>.
     */
    public static Result<FilmInStockRecord> FILM_IN_STOCK(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        return DSL.using(configuration).selectFrom(com.mydvdstore.model.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId)).fetch();
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(Integer pFilmId, Integer pStoreId) {
        return com.mydvdstore.model.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * Get <code>public.film_in_stock</code> as a table.
     */
    public static FilmInStock FILM_IN_STOCK(Field<Integer> pFilmId, Field<Integer> pStoreId) {
        return com.mydvdstore.model.tables.FilmInStock.FILM_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * The table <code>public.film_list</code>.
     */
    public static final FilmList FILM_LIST = com.mydvdstore.model.tables.FilmList.FILM_LIST;

    /**
     * The table <code>public.film_not_in_stock</code>.
     */
    public static final FilmNotInStock FILM_NOT_IN_STOCK = com.mydvdstore.model.tables.FilmNotInStock.FILM_NOT_IN_STOCK;

    /**
     * Call <code>public.film_not_in_stock</code>.
     */
    public static Result<FilmNotInStockRecord> FILM_NOT_IN_STOCK(Configuration configuration, Integer pFilmId, Integer pStoreId) {
        return DSL.using(configuration).selectFrom(com.mydvdstore.model.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId)).fetch();
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(Integer pFilmId, Integer pStoreId) {
        return com.mydvdstore.model.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * Get <code>public.film_not_in_stock</code> as a table.
     */
    public static FilmNotInStock FILM_NOT_IN_STOCK(Field<Integer> pFilmId, Field<Integer> pStoreId) {
        return com.mydvdstore.model.tables.FilmNotInStock.FILM_NOT_IN_STOCK.call(pFilmId, pStoreId);
    }

    /**
     * The table <code>public.inventory</code>.
     */
    public static final Inventory INVENTORY = com.mydvdstore.model.tables.Inventory.INVENTORY;

    /**
     * The table <code>public.language</code>.
     */
    public static final Language LANGUAGE = com.mydvdstore.model.tables.Language.LANGUAGE;

    /**
     * The table <code>public.nicer_but_slower_film_list</code>.
     */
    public static final NicerButSlowerFilmList NICER_BUT_SLOWER_FILM_LIST = com.mydvdstore.model.tables.NicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST;

    /**
     * The table <code>public.payment</code>.
     */
    public static final Payment PAYMENT = com.mydvdstore.model.tables.Payment.PAYMENT;

    /**
     * The table <code>public.rental</code>.
     */
    public static final Rental RENTAL = com.mydvdstore.model.tables.Rental.RENTAL;

    /**
     * The table <code>public.rewards_report</code>.
     */
    public static final RewardsReport REWARDS_REPORT = com.mydvdstore.model.tables.RewardsReport.REWARDS_REPORT;

    /**
     * Call <code>public.rewards_report</code>.
     */
    public static Result<RewardsReportRecord> REWARDS_REPORT(Configuration configuration, Integer minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        return DSL.using(configuration).selectFrom(com.mydvdstore.model.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased)).fetch();
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(Integer minMonthlyPurchases, BigDecimal minDollarAmountPurchased) {
        return com.mydvdstore.model.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased);
    }

    /**
     * Get <code>public.rewards_report</code> as a table.
     */
    public static RewardsReport REWARDS_REPORT(Field<Integer> minMonthlyPurchases, Field<BigDecimal> minDollarAmountPurchased) {
        return com.mydvdstore.model.tables.RewardsReport.REWARDS_REPORT.call(minMonthlyPurchases, minDollarAmountPurchased);
    }

    /**
     * The table <code>public.sales_by_film_category</code>.
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = com.mydvdstore.model.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY;

    /**
     * The table <code>public.sales_by_store</code>.
     */
    public static final SalesByStore SALES_BY_STORE = com.mydvdstore.model.tables.SalesByStore.SALES_BY_STORE;

    /**
     * The table <code>public.staff</code>.
     */
    public static final Staff STAFF = com.mydvdstore.model.tables.Staff.STAFF;

    /**
     * The table <code>public.staff_list</code>.
     */
    public static final StaffList STAFF_LIST = com.mydvdstore.model.tables.StaffList.STAFF_LIST;

    /**
     * The table <code>public.store</code>.
     */
    public static final Store STORE = com.mydvdstore.model.tables.Store.STORE;
}

/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables.pojos;


import com.mydvdstore.model.enums.MpaaRating;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


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
public class Film implements Serializable {

    private static final long serialVersionUID = 1195800611;

    private Integer    filmId;
    private String     title;
    private String     description;
    private Integer    releaseYear;
    private Short      languageId;
    private Short      rentalDuration;
    private BigDecimal rentalRate;
    private Short      length;
    private BigDecimal replacementCost;
    private MpaaRating rating;
    private Timestamp  lastUpdate;
    private String[]   specialFeatures;
    private Object     fulltext;

    public Film() {}

    public Film(Film value) {
        this.filmId = value.filmId;
        this.title = value.title;
        this.description = value.description;
        this.releaseYear = value.releaseYear;
        this.languageId = value.languageId;
        this.rentalDuration = value.rentalDuration;
        this.rentalRate = value.rentalRate;
        this.length = value.length;
        this.replacementCost = value.replacementCost;
        this.rating = value.rating;
        this.lastUpdate = value.lastUpdate;
        this.specialFeatures = value.specialFeatures;
        this.fulltext = value.fulltext;
    }

    public Film(
        Integer    filmId,
        String     title,
        String     description,
        Integer    releaseYear,
        Short      languageId,
        Short      rentalDuration,
        BigDecimal rentalRate,
        Short      length,
        BigDecimal replacementCost,
        MpaaRating rating,
        Timestamp  lastUpdate,
        String[]   specialFeatures,
        Object     fulltext
    ) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.lastUpdate = lastUpdate;
        this.specialFeatures = specialFeatures;
        this.fulltext = fulltext;
    }

    public Integer getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Short getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Short languageId) {
        this.languageId = languageId;
    }

    public Short getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(Short rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Short getLength() {
        return this.length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public MpaaRating getRating() {
        return this.rating;
    }

    public void setRating(MpaaRating rating) {
        this.rating = rating;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String[] getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setSpecialFeatures(String... specialFeatures) {
        this.specialFeatures = specialFeatures;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getFulltext() {
        return this.fulltext;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setFulltext(Object fulltext) {
        this.fulltext = fulltext;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Film (");

        sb.append(filmId);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(releaseYear);
        sb.append(", ").append(languageId);
        sb.append(", ").append(rentalDuration);
        sb.append(", ").append(rentalRate);
        sb.append(", ").append(length);
        sb.append(", ").append(replacementCost);
        sb.append(", ").append(rating);
        sb.append(", ").append(lastUpdate);
        sb.append(", ").append(Arrays.toString(specialFeatures));
        sb.append(", ").append(fulltext);

        sb.append(")");
        return sb.toString();
    }
}

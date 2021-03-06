/*
 * This file is generated by jOOQ.
*/
package com.mydvdstore.model.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

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
public class RewardsReport implements Serializable {

    private static final long serialVersionUID = -788887602;

    private Integer   customerId;
    private Short     storeId;
    private String    firstName;
    private String    lastName;
    private String    email;
    private Short     addressId;
    private Boolean   activebool;
    private Date      createDate;
    private Timestamp lastUpdate;
    private Integer   active;

    public RewardsReport() {}

    public RewardsReport(RewardsReport value) {
        this.customerId = value.customerId;
        this.storeId = value.storeId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.email = value.email;
        this.addressId = value.addressId;
        this.activebool = value.activebool;
        this.createDate = value.createDate;
        this.lastUpdate = value.lastUpdate;
        this.active = value.active;
    }

    public RewardsReport(
        Integer   customerId,
        Short     storeId,
        String    firstName,
        String    lastName,
        String    email,
        Short     addressId,
        Boolean   activebool,
        Date      createDate,
        Timestamp lastUpdate,
        Integer   active
    ) {
        this.customerId = customerId;
        this.storeId = storeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.addressId = addressId;
        this.activebool = activebool;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
        this.active = active;
    }

    public Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Short getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Short storeId) {
        this.storeId = storeId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Short addressId) {
        this.addressId = addressId;
    }

    public Boolean getActivebool() {
        return this.activebool;
    }

    public void setActivebool(Boolean activebool) {
        this.activebool = activebool;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getActive() {
        return this.active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RewardsReport (");

        sb.append(customerId);
        sb.append(", ").append(storeId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(email);
        sb.append(", ").append(addressId);
        sb.append(", ").append(activebool);
        sb.append(", ").append(createDate);
        sb.append(", ").append(lastUpdate);
        sb.append(", ").append(active);

        sb.append(")");
        return sb.toString();
    }
}

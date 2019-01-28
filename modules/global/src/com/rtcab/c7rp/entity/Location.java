package com.rtcab.c7rp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "C7RP_LOCATION")
@Entity(name = "c7rp_Location")
public class Location extends StandardEntity {
    private static final long serialVersionUID = -283507016516052011L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "STREET")
    protected String street;

    @Column(name = "POSTCODE")
    protected String postcode;

    @Column(name = "CITY")
    protected String city;

    @NotNull
    @Column(name = "SIZE_", nullable = false)
    protected String size;

    public void setSize(LocationSize size) {
        this.size = size == null ? null : size.getId();
    }

    public LocationSize getSize() {
        return size == null ? null : LocationSize.fromId(size);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }


}
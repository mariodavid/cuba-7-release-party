package com.rtcab.c7rp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum LocationSize implements EnumClass<String> {

    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE");

    private String id;

    LocationSize(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static LocationSize fromId(String id) {
        for (LocationSize at : LocationSize.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
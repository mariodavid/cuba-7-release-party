package com.rtcab.c7rp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Theme implements EnumClass<String> {

    MONSTER("MONSTER"),
    STAR_WARS("STAR_WARS"),
    HIPPIE("HIPPIE"),
    CELEBRETY("CELEBRETY");

    private String id;

    Theme(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Theme fromId(String id) {
        for (Theme at : Theme.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
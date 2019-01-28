package com.rtcab.c7rp.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum InvitationStatus implements EnumClass<String> {

    SEND_OUT("SEND_OUT"),
    TO_BE_DECIDED("TO_BE_DECIDED"),
    ACKNOWLEDGED("ACKNOWLEDGED"),
    REJECTED("REJECTED");

    private String id;

    InvitationStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static InvitationStatus fromId(String id) {
        for (InvitationStatus at : InvitationStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
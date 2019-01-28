package com.rtcab.c7rp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|party,person")
@Table(name = "C7RP_INVITATION")
@Entity(name = "c7rp$Invitation")
public class Invitation extends StandardEntity {
    private static final long serialVersionUID = -1735676348544459611L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PERSON_ID")
    protected Person person;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARTY_ID")
    protected Party party;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "INVITED_AT", nullable = false)
    protected Date invitedAt;

    @NotNull
    @Column(name = "STATUS", nullable = false)
    protected String status;

    public void setStatus(InvitationStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public InvitationStatus getStatus() {
        return status == null ? null : InvitationStatus.fromId(status);
    }


    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Party getParty() {
        return party;
    }

    public void setInvitedAt(Date invitedAt) {
        this.invitedAt = invitedAt;
    }

    public Date getInvitedAt() {
        return invitedAt;
    }


}
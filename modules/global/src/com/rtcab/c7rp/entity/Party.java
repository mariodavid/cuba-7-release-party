package com.rtcab.c7rp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamePattern("%s|title")
@Table(name = "C7RP_PARTY")
@Entity(name = "c7rp_Party")
public class Party extends StandardEntity {
    private static final long serialVersionUID = 8882237167685029763L;

    @NotNull
    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "STARTS_AT")
    protected Date startsAt;

    @Column(name = "THEME")
    protected String theme;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATION_ID")
    protected Location location;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "party")
    protected List<Invitation> invitations;

    public void setStartsAt(Date startsAt) {
        this.startsAt = startsAt;
    }

    public Date getStartsAt() {
        return startsAt;
    }


    public void setInvitations(List<Invitation> invitations) {
        this.invitations = invitations;
    }

    public List<Invitation> getInvitations() {
        return invitations;
    }


    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }


    public void setTheme(Theme theme) {
        this.theme = theme == null ? null : theme.getId();
    }

    public Theme getTheme() {
        return theme == null ? null : Theme.fromId(theme);
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
package com.rtcab.c7rp.web.party;

import com.haulmont.cuba.core.global.Messages;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.Frame;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Party;

import javax.inject.Inject;

@UiController("c7rp_Party.browse")
@UiDescriptor("party-browse.xml")
@LookupComponent("partiesTable")
@LoadDataBeforeShow
public class PartyBrowse extends StandardLookup<Party> {


    @Inject
    protected GroupTable<Party> partiesTable;

    @Inject
    protected Messages messages;

    @Inject
    protected MessageBundle messageBundle;

    @Inject
    protected Notifications notifications;

    @Subscribe("partiesTable.startParty")
    protected void startParty(Action.ActionPerformedEvent event) {
        Party partyToStart = partiesTable.getSingleSelected();
        String themeName = messages.getMessage(partyToStart.getTheme());
        String startPartyMessage = messageBundle.formatMessage("startPartyMessage", partyToStart.getTitle(), themeName);

        notifications.create(Notifications.NotificationType.WARNING)
                .withCaption(startPartyMessage)
                .show();
    }
    
    
}
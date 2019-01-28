package com.rtcab.c7rp.web.party;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.GroupTable;
import com.rtcab.c7rp.entity.Party;
import javax.inject.Inject;

public class PartyBrowse extends AbstractLookup {

  @Inject
  protected GroupTable<Party> partiesTable;


  public void startParty() {

    Party partyToStart = partiesTable.getSingleSelected();
    String themeName = messages.getMessage(partyToStart.getTheme());
    String startPartyMessage = formatMessage("startPartyMessage", partyToStart.getTitle(),
        themeName);

    showNotification(startPartyMessage, NotificationType.WARNING);
  }
}
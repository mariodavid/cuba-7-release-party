package com.rtcab.c7rp.web.party;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Party;

@UiController("c7rp_Party.browse")
@UiDescriptor("party-browse.xml")
@LookupComponent("partiesTable")
@LoadDataBeforeShow
public class PartyBrowse extends StandardLookup<Party> {
}
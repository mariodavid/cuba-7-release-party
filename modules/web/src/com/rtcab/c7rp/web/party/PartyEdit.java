package com.rtcab.c7rp.web.party;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Party;

@UiController("c7rp_Party.edit")
@UiDescriptor("party-edit.xml")
@EditedEntityContainer("partyDc")
@LoadDataBeforeShow
public class PartyEdit extends StandardEditor<Party> {
}
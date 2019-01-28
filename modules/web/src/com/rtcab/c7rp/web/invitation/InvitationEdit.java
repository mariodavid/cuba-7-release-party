package com.rtcab.c7rp.web.invitation;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Invitation;

@UiController("c7rp_Invitation.edit")
@UiDescriptor("invitation-edit.xml")
@EditedEntityContainer("invitationDc")
@LoadDataBeforeShow
public class InvitationEdit extends StandardEditor<Invitation> {
}
package com.rtcab.c7rp.web.location;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Location;

@UiController("c7rp_Location.edit")
@UiDescriptor("location-edit.xml")
@EditedEntityContainer("locationDc")
@LoadDataBeforeShow
public class LocationEdit extends StandardEditor<Location> {
}
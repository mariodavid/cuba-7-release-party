package com.rtcab.c7rp.web.location;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Location;

@UiController("c7rp_Location.browse")
@UiDescriptor("location-browse.xml")
@LookupComponent("locationsTable")
@LoadDataBeforeShow
public class LocationBrowse extends StandardLookup<Location> {
}
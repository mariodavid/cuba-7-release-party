package com.rtcab.c7rp.web.person;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Person;

@UiController("c7rp_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {
}
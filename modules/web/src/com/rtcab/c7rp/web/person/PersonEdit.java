package com.rtcab.c7rp.web.person;

import com.haulmont.cuba.gui.screen.*;
import com.rtcab.c7rp.entity.Person;

@UiController("c7rp_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}
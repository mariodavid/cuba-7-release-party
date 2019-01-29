package com.rtcab.c7rp.web;

import com.haulmont.cuba.gui.components.AbstractMainWindow;
import com.haulmont.cuba.gui.components.Image;
import com.haulmont.cuba.gui.components.mainwindow.FtsField;
import com.haulmont.cuba.gui.components.mainwindow.SideMenu;

import javax.inject.Inject;
import java.util.Map;


public class ExtAppMainWindow extends AbstractMainWindow {
    @Inject
    private FtsField ftsField;

    @Inject
    private Image logoImage;

    @Inject
    private SideMenu sideMenu;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        sideMenu.requestFocus();

        initLayoutAnalyzerContextMenu(logoImage);
        initLogoImage(logoImage);
        initFtsField(ftsField);
    }
}
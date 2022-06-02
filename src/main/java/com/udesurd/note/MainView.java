package com.udesurd.note;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


import java.awt.*;

@Route("")
public class MainView extends VerticalLayout {

    public MainView(){
        var button = new Button("Click me!");
        add(new com.vaadin.flow.component.button.Button());
    }
}

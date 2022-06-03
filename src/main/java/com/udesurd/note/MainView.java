package com.udesurd.note;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.awt.*;


@Route("")
public class MainView extends VerticalLayout {
    public MainView() {
        Button button = new Button("Click me!");
        Button button1 = new Button("Clear");
        TextField textField = new TextField();

        add(new HorizontalLayout(button, textField, button1));

        button.addClickListener(e -> {
            add(new Paragraph("Hello" + textField.getValue()));
            textField.clear();
        });

        button1.addClickListener(e -> {
            
        });
    }
}

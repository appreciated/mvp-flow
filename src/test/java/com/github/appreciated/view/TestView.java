package com.github.appreciated.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class TestView extends VerticalLayout {
    private final Button button1;
    private final Button button2;
    private final Button button3;
    private final Button button4;

    public TestView() {
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        add(button1, button2, button3, button4);
    }

    public Button getButton1() {
        return button1;
    }

    public Button getButton2() {
        return button2;
    }

    public Button getButton3() {
        return button3;
    }

    public Button getButton4() {
        return button4;
    }
}

package com.github.appreciated;

import com.github.appreciated.model.TestModel;
import com.github.appreciated.mvp.Presenter;
import com.github.appreciated.view.TestView;
import com.vaadin.flow.router.Route;

@Route("test")
public class TestPresenter2 extends Presenter<TestModel, TestView> {

    public TestPresenter2() {
        super(new TestModel());
        String[] descriptions = getModel().getDescriptions();
        getContent().getButton1().setText(descriptions[0]);
        getContent().getButton2().setText(descriptions[1]);
        getContent().getButton3().setText(descriptions[2]);
        getContent().getButton4().setText(descriptions[3]);
    }
}

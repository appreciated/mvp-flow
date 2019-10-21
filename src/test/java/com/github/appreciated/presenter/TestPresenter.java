package com.github.appreciated.presenter;

import com.github.appreciated.model.TestModel;
import com.github.appreciated.mvp.Presenter;
import com.github.appreciated.view.TestView;
import com.vaadin.flow.router.Route;

@Route("")
public class TestPresenter extends Presenter<TestModel, TestView> {

    public TestPresenter() {
        String[] descriptions = getModel().getDescriptions();
        getContent().getButton1().setText(descriptions[0]);
        getContent().getButton2().setText(descriptions[1]);
        getContent().getButton3().setText(descriptions[2]);
        getContent().getButton4().setText(descriptions[3]);
    }
}

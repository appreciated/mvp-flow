package com.github.appreciated.model;

import com.github.appreciated.mvp.Model;

public class TestModel implements Model<TestModel> {
    public String[] getDescriptions() {
        return new String[]{"Button1", "Button2", "Button3", "Button4"};
    }
}

package com.bjw.myapplication;

import android.app.Application;

/**
 * Created by Administrator on 2016/7/3 0003.
 */
public class App extends Application {
    private String s = "haha";

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

}

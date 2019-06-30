package com.example.myapplication;

import android.app.Application;

import com.billy.cc.core.component.CC;

public class userApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 默认是false: 关闭状态
        CC.enableVerboseLog(true);
        CC.enableDebug(true);
        CC.enableRemoteCC(true);

    }
}

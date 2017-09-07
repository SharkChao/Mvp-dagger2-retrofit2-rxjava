package com.linxi.administrator.dagger2demo.app;

import android.app.Application;

import com.linxi.administrator.dagger2demo.di.component.AppComponent;
import com.linxi.administrator.dagger2demo.di.component.DaggerAppComponent;
import com.linxi.administrator.dagger2demo.di.module.AppModule;

/**
 * Created by SharkChao on 2017-09-07.
 */

public class MyApplication extends Application{
    AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}

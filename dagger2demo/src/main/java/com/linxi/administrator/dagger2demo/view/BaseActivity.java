package com.linxi.administrator.dagger2demo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.linxi.administrator.dagger2demo.app.MyApplication;
import com.linxi.administrator.dagger2demo.di.component.AppComponent;

/**
 * Created by SharkChao on 2017-09-07.
 */

public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initData();
        initEvent();
    }
    public AppComponent getAppcomponent(){
        return ((MyApplication)getApplicationContext()).getAppComponent();
    }
    public abstract void initView();
    public abstract void initData();
    public abstract void initEvent();
}

package com.linxi.administrator.dagger2demo.di.component;

import android.content.Context;

import com.linxi.administrator.dagger2demo.di.module.AppModule;
import com.linxi.administrator.dagger2demo.util.CommonUtil;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SharkChao on 2017-09-07.
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getContext();
    CommonUtil getComminUtil();
}

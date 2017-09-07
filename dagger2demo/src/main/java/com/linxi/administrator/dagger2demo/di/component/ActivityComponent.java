package com.linxi.administrator.dagger2demo.di.component;

import android.app.Activity;

import com.linxi.administrator.dagger2demo.di.module.ActivityModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by SharkChao on 2017-09-07.
 */
@Singleton
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
}

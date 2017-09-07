package com.linxi.administrator.dagger2demo.di.component;

import com.linxi.administrator.dagger2demo.di.module.ActivityModule;
import com.linxi.administrator.dagger2demo.di.module.MainModule;
import com.linxi.administrator.dagger2demo.di.scope.PerActivity;
import com.linxi.administrator.dagger2demo.view.MainActivity;

import dagger.Component;

/**
 * Created by SharkChao on 2017-09-07.
 */
@PerActivity
@Component(dependencies = AppComponent.class,modules = {MainModule.class, ActivityModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}

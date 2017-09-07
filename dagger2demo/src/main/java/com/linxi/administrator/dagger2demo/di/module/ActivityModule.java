package com.linxi.administrator.dagger2demo.di.module;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SharkChao on 2017-09-07.
 */
@Module
public class ActivityModule {
    private Activity mActivity;
    public ActivityModule(Activity activity){
        mActivity = activity;
    }
    @Provides @Singleton
    public Activity providerActivity(){
        return mActivity;
    }
}

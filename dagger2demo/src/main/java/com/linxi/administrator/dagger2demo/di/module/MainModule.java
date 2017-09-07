package com.linxi.administrator.dagger2demo.di.module;

import com.linxi.administrator.dagger2demo.data.GetUserData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SharkChao on 2017-09-07.
 */
@Module
public class MainModule {
    @Provides
    public GetUserData getUserData(){
        return  new GetUserData();
    }
}

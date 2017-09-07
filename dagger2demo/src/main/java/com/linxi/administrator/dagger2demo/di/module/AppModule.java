package com.linxi.administrator.dagger2demo.di.module;

import android.content.Context;

import com.linxi.administrator.dagger2demo.util.CommonUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by SharkChao on 2017-09-07.
 */
@Module
public class AppModule {
    private Context mContext;
    public AppModule(Context context){
        mContext = context;
    }
    @Provides @Singleton
    public Context provideContext(){
        return mContext;
    }
    @Provides @Singleton
    public CommonUtil providerCommonUtil(){
        return new CommonUtil(mContext);
    }
}

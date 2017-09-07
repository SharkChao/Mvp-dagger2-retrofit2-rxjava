package com.linxi.administrator.dagger2demo.view;

import android.widget.TextView;

import com.linxi.administrator.dagger2demo.R;
import com.linxi.administrator.dagger2demo.data.GetUserData;
import com.linxi.administrator.dagger2demo.di.component.DaggerMainComponent;
import com.linxi.administrator.dagger2demo.di.module.ActivityModule;
import com.linxi.administrator.dagger2demo.di.module.MainModule;

import javax.inject.Inject;

/**
 * Created by SharkChao on 2017-09-07.
 */

public class MainActivity extends BaseActivity{

    @Inject
    GetUserData mGetUserData;
    private TextView mTvTitle;

    @Override
    public void initView() {
        setContentView(R.layout.activity_main);
        mTvTitle = (TextView) findViewById(R.id.tvTitle);
        DaggerMainComponent daggerMainComponent = (DaggerMainComponent) DaggerMainComponent.builder().appComponent(getAppcomponent())
                .activityModule(new ActivityModule(this))
                .mainModule(new MainModule()).build();
        daggerMainComponent.inject(this);
    }

    @Override
    public void initData() {
        mTvTitle.setText(mGetUserData.getUser().mUserName.toString());
    }

    @Override
    public void initEvent() {

    }
}

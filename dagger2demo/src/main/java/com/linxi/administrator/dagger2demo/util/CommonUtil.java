package com.linxi.administrator.dagger2demo.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by SharkChao on 2017-09-07.
 */

public class CommonUtil {
    private Context mContext;
    public CommonUtil(Context context){
        mContext = context;
    }
    public void showToast(String message){
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}

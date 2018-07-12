package com.dou.demo.aidl_demo.config;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Author: dou
 * Time: 18-7-12  下午3:56
 * Decription:
 */

public class ConfigService extends Service {

    public IConfigInterface.Stub mConfig;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mConfig;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mConfig = new MyConfig(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mConfig != null){
            mConfig = null;
        }
    }
}

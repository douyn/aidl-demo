package com.dou.demo.aidl_demo.config;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

/**
 * Author: dou
 * Time: 18-7-12  下午4:30
 * Decription:
 */

public class ConfigShadow implements ServiceConnection {

    IConfigInterface iConfigInterface;

    public ConfigShadow(Context context) {

        Intent intent = new Intent(context, ConfigService.class);

        context.bindService(intent, this, Context.BIND_AUTO_CREATE);
    }

    @Override
    public void onServiceConnected(ComponentName name, IBinder service) {
        iConfigInterface = IConfigInterface.Stub.asInterface(service);
    }

    @Override
    public void onServiceDisconnected(ComponentName name) {
        iConfigInterface = null;
    }

    public void setValue(String key, String value){
        try {
            iConfigInterface.setVaule(key, value);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public String getValue(String key) {
        try {
            return iConfigInterface.getValue(key);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return null;
    }
}

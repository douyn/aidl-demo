package com.dou.demo.aidl_demo.config;

import android.app.Service;
import android.os.RemoteException;

import java.util.TreeMap;

/**
 * Author: dou
 * Time: 18-7-12  下午3:58
 * Decription:
 */

public class MyConfig extends IConfigInterface.Stub  {

    TreeMap<String, String> configs;

    public MyConfig(Service service) {
        configs = new TreeMap<>();
    }

    @Override
    public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

    }

    @Override
    public String getValue(String key) throws RemoteException {
        return configs.get(key);
    }

    @Override
    public void setVaule(String key, String value) throws RemoteException {
        configs.put(key, value);
    }
}

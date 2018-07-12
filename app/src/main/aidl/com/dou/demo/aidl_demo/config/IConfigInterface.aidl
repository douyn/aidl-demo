// ITestInterface.aidl
package com.dou.demo.aidl_demo.config;

// Declare any non-default types here with import statements

interface IConfigInterface {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat,
            double aDouble, String aString);

    String getValue(in String key);

    void setVaule(in String key, in String value);
}

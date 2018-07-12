package com.dou.demo.aidl_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.dou.demo.aidl_demo.config.ConfigShadow;

public class MainActivity extends AppCompatActivity {

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConfigShadow shadow = new ConfigShadow(this);

        findViewById(R.id.get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = shadow.getValue("a");
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.set).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shadow.setValue("a", "a" + (index++));
            }
        });
    }
}

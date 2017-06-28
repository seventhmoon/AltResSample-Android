package com.androidfung.altrestest;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.support.v4.os.LocaleListCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, LocaleListCompat.getDefault().toString());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            Log.d(TAG, LocaleList.getDefault().toString());
//        }else{
//
//        }
//        Log.d(TAG, Locale.getDefault().toString());
        Log.d(TAG, getString(R.string.locale_used));
    }
}

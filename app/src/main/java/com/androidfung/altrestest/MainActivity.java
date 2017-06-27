package com.androidfung.altrestest;

import android.os.Build;
import android.os.LocaleList;
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


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Log.d(TAG, LocaleList.getDefault().toString());
            Log.d(TAG, String.valueOf(LocaleList.getDefault().getFirstMatch(new String[]{"zh-hans-tw"})));
            Log.d(TAG, Locale.TRADITIONAL_CHINESE.toLanguageTag());
        }
    }
}

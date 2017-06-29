package com.androidfung.altrestest;


import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.os.LocaleList;
import android.support.v4.os.LocaleListCompat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private ObservableArrayMap<String, Object> mResultMap = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        mResultMap.put("locale", LocaleListCompat.getDefault().toLanguageTags().replace(",","\n"));


        Log.d(TAG, LocaleListCompat.getDefault().toString());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
//            Log.d(TAG, LocaleList.getDefault().toString());
//        }else{
//
//        }
//        Log.d(TAG, Locale.getDefault().toString());
        Log.d(TAG, getString(R.string.locale_used));

        binding.setVariable(com.androidfung.altrestest.BR.bindingData, mResultMap);
    }
}

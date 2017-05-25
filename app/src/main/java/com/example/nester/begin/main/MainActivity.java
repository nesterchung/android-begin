package com.example.nester.begin.main;

import android.app.Activity;
import android.os.Bundle;

import com.example.nester.begin.R;

public class MainActivity extends Activity {

    private static final String MAIN_FRAGMENT = "MAIN_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment fragment = (MainFragment) getFragmentManager().findFragmentByTag(MAIN_FRAGMENT);
        if (fragment == null) {
            fragment = new MainFragment();
        }
    }
}

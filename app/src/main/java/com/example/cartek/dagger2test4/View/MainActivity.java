package com.example.cartek.dagger2test4.View;

import android.os.Bundle;

import com.example.cartek.dagger2test4.Module.Car;
import com.example.cartek.dagger2test4.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.example.cartek.dagger2test4;

import com.example.cartek.dagger2test4.Module.CarModule;
import com.example.cartek.dagger2test4.View.MainActivityModule;
import com.example.cartek.dagger2test4.View.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = {MainActivityModule.class, CarModule.class})
    abstract MainActivity bindMainActivity();
}

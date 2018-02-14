package com.example.cartek.dagger2test4;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by CarTek on 2018/2/14.
 */

public class MainApp extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        MainAppComponent mainAppComponent = DaggerMainAppComponent.builder().application(this).build();
        mainAppComponent.inject(this);
        return mainAppComponent;
//        return null;
    }
}

package com.example.cartek.dagger2test4;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class MainAppModule {

    @Binds
    abstract Context bindContext(Application application);
}

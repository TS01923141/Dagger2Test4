package com.example.cartek.dagger2test4;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by CarTek on 2018/2/14.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        MainAppModule.class,
        ActivityBuilder.class
})
public interface MainAppComponent extends AndroidInjector<DaggerApplication> {

    void inject(MainApp mainApp);

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder application(Application application);
        MainAppComponent build();
    }
}

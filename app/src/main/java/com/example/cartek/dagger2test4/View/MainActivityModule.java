package com.example.cartek.dagger2test4.View;

import com.example.cartek.dagger2test4.Module.Car;
import com.example.cartek.dagger2test4.Module.CarModules.Engine;
import com.example.cartek.dagger2test4.Module.CarModules.Seat;
import com.example.cartek.dagger2test4.Module.CarModules.Wheel;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CarTek on 2018/2/14.
 */
@Module
public abstract class MainActivityModule {

//    @Binds
//    abstract Car bindContext(Car car);

    @Provides
    static Car provideCar(Engine engine, Seat seat, Wheel wheel){
        return new Car(engine, seat, wheel);
    }
}

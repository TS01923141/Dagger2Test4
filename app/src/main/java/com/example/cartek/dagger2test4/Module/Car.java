package com.example.cartek.dagger2test4.Module;

import android.util.Log;

import com.example.cartek.dagger2test4.Module.CarModules.Engine;
import com.example.cartek.dagger2test4.Module.CarModules.Seat;
import com.example.cartek.dagger2test4.Module.CarModules.Wheel;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

/**
 * Created by CarTek on 2018/2/14.
 */

public class Car {
    Engine engine;
    Seat seat;
    Wheel wheel;

    @Inject
    public Car(Engine engine, Seat seat, Wheel wheel){
        this.engine = engine;
        this.seat = seat;
        this.wheel = wheel;

        Log.e(TAG, "new Car()");
    }
}

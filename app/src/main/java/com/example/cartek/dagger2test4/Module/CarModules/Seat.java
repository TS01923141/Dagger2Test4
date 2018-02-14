package com.example.cartek.dagger2test4.Module.CarModules;

import android.util.Log;

import com.example.cartek.dagger2test4.Module.Config;
import com.example.cartek.dagger2test4.Module.Leather;

/**
 * Created by CarTek on 2018/2/9.
 */

public class Seat {
    private Leather leather;
    public Seat(){
        Log.e(Config.TAG, "new Seat()");
    }
    public Seat(Leather leather){
        this.leather = leather;
        Log.e(Config.TAG,"new Seat(Leather)");
    }
}

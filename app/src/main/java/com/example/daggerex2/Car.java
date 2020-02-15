package com.example.daggerex2;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    void drive(){
        Log.d(TAG, "Driving ... !!");
    }


}

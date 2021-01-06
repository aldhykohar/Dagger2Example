package com.stimednp.dagger2example.dagger;

import com.stimednp.dagger2example.MainActivity;
import com.stimednp.dagger2example.car.Car;

import dagger.Component;

@Component (modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}

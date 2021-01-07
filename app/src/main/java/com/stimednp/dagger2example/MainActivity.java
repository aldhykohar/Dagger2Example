package com.stimednp.dagger2example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.stimednp.dagger2example.car.Car;
import com.stimednp.dagger2example.dagger.CarComponent;
import com.stimednp.dagger2example.dagger.DaggerCarComponent;
import com.stimednp.dagger2example.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(14000)
                .build();

        component.inject(this);

        car.drive();
    }
}
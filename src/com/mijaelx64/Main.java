package com.mijaelx64;

import com.mijaelx64.observer_pattern.CurrentConditionDisplay;
import com.mijaelx64.observer_pattern.WeatherData;
import com.mijaelx64.strategy_pattern.Duck;
import com.mijaelx64.strategy_pattern.MallardDuck;
import com.mijaelx64.strategy_pattern.ModelDuck;
import com.mijaelx64.strategy_pattern.behaviors.fly_behaviors.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {

        // Strategy Pattern
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

        // Strategy Pattern - Dynamic Change

        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        // Observer Pattern

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements((float)5.5,4,2);
        weatherData.setMeasurements(7,8,3);
        weatherData.setMeasurements(2,1,6);

    }
}

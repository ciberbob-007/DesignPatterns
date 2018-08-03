package com.mijaelx64.observer_pattern_java_api;

import com.mijaelx64.observer_pattern.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    @Override
    public void display() {
        System.out.println("Current condition: Fº" + temperature + " H-" + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof WeatherData){

            WeatherData weatherData = (WeatherData) o;

            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            display();
        }
    }

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

}

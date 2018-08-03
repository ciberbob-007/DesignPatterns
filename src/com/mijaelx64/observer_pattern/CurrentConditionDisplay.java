package com.mijaelx64.observer_pattern;

public class CurrentConditionDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;

        this.weatherData.registerObservers(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: Fº" + temperature + " H-" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pression) {

        this.temperature = temp;
        this.humidity = humidity;

        display();
    }

}

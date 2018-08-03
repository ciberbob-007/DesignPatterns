package com.mijaelx64.observer_pattern;

public interface Subject {

    void registerObservers(Observer o);
    void removeObservers(Observer o);
    void notifyObservers();

}

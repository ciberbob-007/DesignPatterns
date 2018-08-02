package com.mijaelx64.strategy_pattern.behaviors.fly_behaviors;

import com.mijaelx64.strategy_pattern.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly.. oh god !!!");
    }
}

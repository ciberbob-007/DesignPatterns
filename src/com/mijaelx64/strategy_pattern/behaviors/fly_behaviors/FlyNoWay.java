package com.mijaelx64.strategy_pattern.behaviors.fly_behaviors;

import com.mijaelx64.strategy_pattern.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly, but I used to believe.");
    }
}

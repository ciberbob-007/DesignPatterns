package com.mijaelx64.strategy_pattern.behaviors.fly_behaviors;

import com.mijaelx64.strategy_pattern.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying with a rocket");
    }
}

package com.mijaelx64.strategy_pattern.behaviors.quack_behaviors;

import com.mijaelx64.strategy_pattern.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("SQUEAK");
    }
}

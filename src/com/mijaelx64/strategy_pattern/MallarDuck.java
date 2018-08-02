package com.mijaelx64.strategy_pattern;

import com.mijaelx64.strategy_pattern.behaviors.fly_behaviors.FlyWithWings;
import com.mijaelx64.strategy_pattern.behaviors.quack_behaviors.Quack;
import com.mijaelx64.strategy_pattern.behaviors.quack_behaviors.Squeak;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a mallard Duck, for real");
    }
}

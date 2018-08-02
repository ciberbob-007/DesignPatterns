package com.mijaelx64;

import com.mijaelx64.strategy_pattern.Duck;
import com.mijaelx64.strategy_pattern.MallardDuck;

public class Main {

    public static void main(String[] args) {

        // Strategy Pattern
        Duck mallardDuck = new MallardDuck();

        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.display();

    }
}

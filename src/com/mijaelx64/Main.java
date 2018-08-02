package com.mijaelx64;

import com.mijaelx64.strategy_pattern.Duck;
import com.mijaelx64.strategy_pattern.MallarDuck;

public class Main {

    public static void main(String[] args) {

        // Strategy Pattern
        Duck mallarDuck = new MallarDuck();

        mallarDuck.performFly();
        mallarDuck.performQuack();
        mallarDuck.display();

    }
}

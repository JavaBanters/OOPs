package com.implementation;

import com.abstraction.Car;
import com.interfaces.Machine;

// Annotation are additional
public class Toyota extends Car implements Machine {
    @Override
    public void start() {
        System.out.println("ingition...");
        System.out.println("Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("engine stopped");
    }

    @Override
    public void acclerate() {
        System.out.println("the toyota is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("toyota brake applied");
    }

}

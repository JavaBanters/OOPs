package com.abstraction;

/* So , if a class wants to use this abstract class it will have to use the extends keyword
 * all the method needs to be abstract in nature
 * it can help you achieve partial abstraction.
 */
public abstract class Car {

    //default
     void clutch() {
        System.out.println("the clutch has been pressed");
    }
     public abstract void acclerate();

     public abstract void brake();
}

package com.interfaces;

/* Abstraction hides certain details.
 * It provides complete abstraction
 * a class will implement(s) an interface , and it can implement any number of interface.
 * an interface will extend another interface.
 */
public interface Machine {

    public static final int serialNumber = 12345;
    void start();
    void stop();


}

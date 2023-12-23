package com.implementation;

import com.abstraction.Mobile;
import com.interfaces.Machine;
import com.interfaces.Wifi;


/* protected can be accessed by the subclass , and class in the same package
 *
 *
 */
public class Samsung extends Mobile implements Machine, Wifi {
    @Override
    protected void camera() {
        System.out.println("5 Mp Camera");
    }

    @Override
    protected void touchScreen() {
        System.out.println("6 inch touch screen display");
    }

    @Override
    public void start() {
        System.out.println("Samsung mobile is switched on");
        this.camera();
    }

    @Override
    public void stop() {
        System.out.println("Samsung mobile is switched off");
    }

    @Override
    public void connect() {
        System.out.println("samsung connected to wifi");
    }

    @Override
    public void disconnect() {
        System.out.println("samsung disconnected from wifi");
    }

}

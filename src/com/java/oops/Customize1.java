package com.java.oops;

public class Customize1 extends CustomizeCar {
    @Override
    public void changeColor() {

    }

    @Override
    public void engine() {
        super.engine();
        System.out.println("5HP");
    }
}

package com.java.oops;

public class CarTest {
    public static void main(String[] args) {
        Car maruti800 = new Maruti800(); ///LHS Ref & RHS IMplemnation
        Car fortuner = new Fortuner();

        CustomizeCar customizeCar =new Customize1();

        System.out.println(maruti800.getType());
        System.out.println(fortuner.getType());
        customizeCar.engine();
//        System.out.println(customizeCar.engine());
    }
}

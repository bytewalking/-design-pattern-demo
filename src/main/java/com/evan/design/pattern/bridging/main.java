package com.evan.design.pattern.bridging;

public class main {
    public static void main(String[] args) {
        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();
    }
}

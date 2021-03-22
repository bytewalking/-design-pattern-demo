package com.evan.design.pattern.bridging;

public abstract class RefinedCar extends Car{
    public RefinedCar(Engine engine) {
        super(engine);
    }

    public void drive(){
        this.engine.start();
        System.out.println("Drive " + getBrand() + " car...");
    }

    public abstract String getBrand();
}

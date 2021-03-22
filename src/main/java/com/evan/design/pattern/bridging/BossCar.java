package com.evan.design.pattern.bridging;

public class BossCar extends RefinedCar{
    public BossCar(Engine engine) {
        super(engine);
    }

    public String getBrand() {
        return "Boss";
    }
}

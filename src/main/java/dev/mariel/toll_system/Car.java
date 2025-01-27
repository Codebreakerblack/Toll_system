package dev.mariel.toll_system;

public class Car extends Vehicle {
    public Car(String plate) {
        super(plate);
    }

    @Override
    public double calculateToll() {
        return 100.0;
    }
}

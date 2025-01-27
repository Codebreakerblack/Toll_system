package dev.mariel.toll_system;

public class Truck extends Vehicle {
    private int numberAxles;

    public Truck(String plate, int numberAxles) {
        super(plate);
        this.numberAxles = numberAxles;
    }

    @Override
    public double calculateToll() {
        return 50.0 * numberAxles;
    }
}

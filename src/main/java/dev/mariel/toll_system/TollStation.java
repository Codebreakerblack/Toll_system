package dev.mariel.toll_system;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private double totalCollected;
    private List<Vehicle> vehicles;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0.0;
        this.vehicles = new ArrayList<>();
    }

    public void registerVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        vehicles.add(vehicle);
        totalCollected += vehicle.calculateToll();
    }

    public double getTotalCollected() {
        return totalCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}

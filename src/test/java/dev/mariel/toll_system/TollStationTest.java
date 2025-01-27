package dev.mariel.toll_system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TollStationTest {

    @Test
    public void testRegisterVehicleAndTotalCollected() {
        TollStation station = new TollStation("Central", "Spain");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ987");
        Vehicle truck = new Truck("LMN456", 4);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        assertEquals(350.0, station.getTotalCollected());
    }

    @Test
    public void testGetVehicles() {
        TollStation station = new TollStation("Central", "Spain");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ987");

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);

        List<Vehicle> vehicles = station.getVehicles();
        assertEquals(2, vehicles.size());
        assertTrue(vehicles.contains(car));
        assertTrue(vehicles.contains(motorcycle));
    }

}

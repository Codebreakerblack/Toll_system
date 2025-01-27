package dev.mariel.toll_system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testCarToll() {
        Vehicle car = new Car("ABC123");
        assertEquals(100.0, car.calculateToll());
        assertEquals("ABC123", car.getPlate());
    }

    @Test
    public void testMotorcycleToll() {
        Vehicle motorcycle = new Motorcycle("XYZ987");
        assertEquals(50.0, motorcycle.calculateToll());
        assertEquals("XYZ987", motorcycle.getPlate());
    }

    @Test
    public void testTruckToll() {
        Vehicle truck = new Truck("LMN456", 3);
        assertEquals(150.0, truck.calculateToll());
        assertEquals("LMN456", truck.getPlate());
    }

}

package dev.mariel.toll_system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ReportTollTest {

    @Test
    public void printReportTest() {
        TollStation station = new TollStation("Central", "España");

        Vehicle car = new Car("ABC123");
        Vehicle motorcycle = new Motorcycle("XYZ987");
        Vehicle truck = new Truck("LMN456", 2);

        station.registerVehicle(car);
        station.registerVehicle(motorcycle);
        station.registerVehicle(truck);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ReportToll.printReport(station);

        System.setOut(System.out);

        String output = outputStream.toString();
        assertTrue(output.contains("Estación: Central en España"));
        assertTrue(output.contains("- Vehículo con placa: ABC123"));
        assertTrue(output.contains("- Vehículo con placa: XYZ987"));
        assertTrue(output.contains("- Vehículo con placa: LMN456"));
        assertTrue(output.contains("Total recolectado: 250.0"));
    }
}

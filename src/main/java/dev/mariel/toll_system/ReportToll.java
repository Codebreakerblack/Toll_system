package dev.mariel.toll_system;

public class ReportToll {
    public static void printReport(TollStation station) {
        System.out.println("Informe de Peaje");
        System.out.println("Estación: " + station.getName() + " en " + station.getCity());
        System.out.println("Vehículos registrados:");
        station.getVehicles().forEach(v -> 
            System.out.println("- Vehículo con placa: " + v.getPlate()));
        System.out.println("Total recolectado: " + station.getTotalCollected());
    }
}


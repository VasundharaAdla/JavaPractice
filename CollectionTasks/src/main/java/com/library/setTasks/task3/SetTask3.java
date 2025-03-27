package com.library.setTasks.task3;

public class SetTask3 {
    public static void main(String[] args) {
        Vehicles vehicles=new Vehicles();
        vehicles.printAllVehicles();
        vehicles.addVehicle("Car");
        vehicles.addVehicle("Bus");
        vehicles.addVehicle("Bike");
        vehicles.addVehicle("Auto");
        vehicles.addVehicle("Train");
        vehicles.printAllVehicles();
        vehicles.removeVehicle("Auto");
        vehicles.printAllVehicles();
        String vehicle="Bike";
        if(vehicles.searchVehicle(vehicle))
            System.out.println(vehicle+" is available");
        else
            System.out.println(vehicle+" is not available");
    }
}

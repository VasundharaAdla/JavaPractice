package com.library.setTasks.task3;
import java.util.*;
public class Vehicles {
    private Set<String> vehicles;
    public Vehicles() {
        this.vehicles=new HashSet<>();
    }
    public Vehicles(Set<String> vehicles) {
        this.vehicles=vehicles;
    }
    public void setVehicles(Set<String> vehicles) {
        this.vehicles=vehicles;
    }
    public Set<String> getVehicles() {
        return vehicles;
    }
    public void addVehicle(String vehicle) {
        vehicles.add(vehicle);
        System.out.println(vehicle+" added successfully");
    }
    public void removeVehicle(String vehicle) {
        vehicles.remove(vehicle);
        System.out.println(vehicle+" removed successfully");
    }
    public boolean searchVehicle(String vehicle) {
        return vehicles.contains(vehicle);
    }
    public void printAllVehicles() {
        System.out.print("Type of vehicles available: ");
        Iterator<String> itr=vehicles.iterator();
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
}

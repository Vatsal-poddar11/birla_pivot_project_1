package org.example.models;

public class CargoPlanes extends Aeroplane{
    protected int cargoCapacity;

    CargoPlanes(){
        System.out.println("This is CargoPlanes Class");
    }

    public CargoPlanes(int seats, String model, int cargoCapacity){
        super(seats,model);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void start(){
        System.out.println("Cargo Plane Started");
    }

    @Override
    public void fly(){
        System.out.println("Cargo Plane Flying");
    }

    @Override
    public void stop(){
        System.out.println("Cargo Plane Stopped");
    }

    public void cargoCapacity(){
        System.out.println("Total Cargo Capacity: " + cargoCapacity + " tonnes");
    }
}

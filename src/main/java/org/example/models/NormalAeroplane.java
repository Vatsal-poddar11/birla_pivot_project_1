package org.example.models;

import org.example.services.AeroplaneService;

public class NormalAeroplane extends Aeroplane{
    public NormalAeroplane(){
        System.out.println("This is Normal Aeroplane Class");
    }

    public NormalAeroplane(int seats, String model){
        super(seats,model);
    }

    @Override
    public void start(){
        System.out.println("Normal Aeroplane Started");
    }

    @Override
    public void fly(){
        System.out.println("Normal Aeroplane Flying");
    }

    @Override
    public void stop(){
        System.out.println("Normal Aeroplane Stopped");
    }

    public void totalPassengers(){
        System.out.println("Total Passengers: " + seats);
    }
}

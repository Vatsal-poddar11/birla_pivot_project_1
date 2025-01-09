package org.example.models;

public abstract class Aeroplane {
    public int seats;
    public String model;

    Aeroplane(){
        System.out.println("This is Aeroplane Model");
    }

    public Aeroplane(int seats, String model){
        this.seats = seats;
        this.model = model;
    }

    public abstract void start();
    public abstract void fly();
    public abstract void stop();

    public void display(){
        System.out.println("Model : " + model + " Seats: " + seats);
    }

}

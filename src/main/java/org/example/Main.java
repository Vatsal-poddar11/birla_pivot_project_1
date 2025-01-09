package org.example;
import org.example.models.Aeroplane;
import org.example.models.CargoPlanes;
import org.example.models.FighterJets;
import org.example.models.NormalAeroplane;
import org.example.services.AeroplaneService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aeroplane normal = new NormalAeroplane(150, "Airbus A320");
        Aeroplane cargo = new CargoPlanes(5, "Boeing C-17 Globemaster", 300);
        Aeroplane fighter = new FighterJets(1, "F22", 12);

        normal.start();
        normal.fly();
        normal.stop();
        normal.display();

        fighter.start();
        fighter.fly();
        fighter.stop();
        fighter.display();
        ((FighterJets) fighter).fireMissile();

        cargo.start();
        cargo.fly();
        cargo.stop();
        cargo.display();

        ((NormalAeroplane) normal).totalPassengers();
        ((CargoPlanes) cargo).cargoCapacity();

    }
}
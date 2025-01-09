package org.example.models;

public class FighterJets extends Aeroplane implements Fighter{
    protected static int numMissiles;
    public FighterJets(){
        System.out.println("This is FighterJets Class");
    }

    public FighterJets(int seats, String model, int missiles){
        super(seats,model);
        numMissiles = missiles;
    }

    @Override
    public void start(){
        System.out.println("FighterJet Started");
    }

    @Override
    public void fly(){
        System.out.println("FighterJet Flying");
    }

    @Override
    public void stop(){
        System.out.println("FighterJet Stopped");
    }

    public void combatMissilesCount(){
        System.out.println("Combat Missile Count: " + numMissiles);
    }

    public static void fireMissile(){
        numMissiles--;
        System.out.println("Missiles Left: " + numMissiles);
    }

}

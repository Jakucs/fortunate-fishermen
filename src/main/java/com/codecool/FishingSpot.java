package com.codecool;

public class FishingSpot {
    private static int idCounter = 0;
    private int id;
    private WaterZone waterZone;
    private boolean isCaught;

    public FishingSpot(WaterZone waterZone){
        this.id = idCounter++;
        this.waterZone = waterZone;
    }
}

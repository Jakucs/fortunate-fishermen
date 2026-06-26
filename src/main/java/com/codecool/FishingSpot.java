package com.codecool;

public class FishingSpot {
    private int id;
    private WaterZone waterZone;
    private boolean isCaught;

    public FishingSpot(int id, WaterZone waterZone){
        this.id = id;
        this.waterZone = waterZone;
    }
}

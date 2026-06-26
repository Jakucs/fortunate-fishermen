package com.codecool;

import java.util.List;

public class Fisherman {
    private String name;
    private List<FishingSpot> spots;
    private int maxReattempsPerSpot;
    private int maxReattempsPerDay;
    private int reattempsLeft;
    private int successfulCatches;

    public Fisherman(String name, int maxReattempsPerSpot, int maxReattempsPerDay){
        this.name = name;
        this.maxReattempsPerSpot = maxReattempsPerSpot;
        this.maxReattempsPerDay = maxReattempsPerDay;
    }

    public void addSpot(FishingSpot spot){
        this.spots.add(spot);
    }
// Adds a fishing spot to the fisherman's daily list.

    public void doFishingDay(){
        for(FishingSpot spot : spots){
            System.out.println("spot: " + spot);
        }
    }
// Attempts a catch at every assigned spot.
// - Each attempt has a random chance of success.
// - If a spot fails, the fisherman may reattempt it
//   (up to maxReattempsPerSpot times and within the daily limit).
// - Successfully caught spots are not revisited.

/*    public Report createReport(){
        return new Report()
    }*/
// Returns a Report object built from the day's statistics.
}

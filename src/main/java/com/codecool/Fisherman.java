package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Fisherman {
    private String name;
    private List<FishingSpot> spots = new ArrayList<>();
    private int maxReattempsPerSpot;
    private int maxReattempsPerDay;
    private int reattempsLeft;
    private double successfulCatches = 0;

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
        this.reattempsLeft = maxReattempsPerDay;
        for(FishingSpot spot : spots){
            int reattempsPerSpotLeft = this.maxReattempsPerSpot;
            while(reattempsPerSpotLeft>0 && reattempsLeft>0){
                if(Util.isCaught()){
                    spot.setIsCaught(true);
                    successfulCatches+=1;
                    break;
                }
                reattempsPerSpotLeft--;
                reattempsLeft--;
            }
        }
        Report report = new Report(name, successfulCatches, spots.size(), reattempsLeft);
        System.out.println(report.getSummary());

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

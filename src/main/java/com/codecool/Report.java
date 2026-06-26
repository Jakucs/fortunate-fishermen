package com.codecool;

public class Report {
    private String fishermanName;
    private int successfulCatches;
    private int totalSpots;
    private int reattempsLeft;

    public Report(String fishermanName, int successfulCatches, int totalSpots, int reattempsLeft){
        this.fishermanName = fishermanName;
        this.successfulCatches = successfulCatches;
        this.totalSpots = totalSpots;
        this.reattempsLeft = reattempsLeft;
    }

    public String getSummary(){
        return "";
    }
// Returns a formatted string, e.g.:
// "Fisherman Frank caught at 7 spots out of 10: success rate 70% (0 reattempt(s) left)"
}

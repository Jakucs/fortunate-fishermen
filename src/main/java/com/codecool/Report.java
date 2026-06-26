package com.codecool;

public class Report {
    private String fishermanName;
    private double successfulCatches;
    private int totalSpots;
    private int reattempsLeft;

    public Report(String fishermanName, double successfulCatches, int totalSpots, int reattempsLeft){
        this.fishermanName = fishermanName;
        this.successfulCatches = successfulCatches;
        this.totalSpots = totalSpots;
        this.reattempsLeft = reattempsLeft;
    }

    public double getSuccessRate(){
        return (successfulCatches / totalSpots) * 100;
    }

    public String getSummary(){
        return "Fisherman " + fishermanName + " caught at " + successfulCatches + " spots out of " + totalSpots +
                ": success rate " + getSuccessRate() + "% (" + reattempsLeft + "reattempt(s) left)";
    }
// Returns a formatted string, e.g.:
// "Fisherman Frank caught at 7 spots out of 10: success rate 70% (0 reattempt(s) left)"
}

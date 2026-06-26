package com.codecool;

import java.util.Random;

public class Util {

    private static int RANDOM_CAUGHT_CHANCE = 30;

    static Random random = new Random();


    public static boolean isCaught(){
        return random.nextInt(0, 100) > RANDOM_CAUGHT_CHANCE;
    }


    public String randomLakeNameGenerator(){
        return lakeNames[random.nextInt(0, lakeNames.length)];
    }

    public String randomLakeTypeGenerator(){
        return lakeTypes[random.nextInt(0, lakeTypes.length)];
    }

    public String randomRegionGenerator(){
        return regions[random.nextInt(0, regions.length)];
    }

    String[] regions = {
            "Közép-Magyarország",
            "Közép-Dunántúl",
            "Nyugat-Dunántúl",
            "Dél-Dunántúl",
            "Észak-Magyarország",
            "Észak-Alföld",
            "Dél-Alföld"
    };


    String[] lakeTypes = {
            "Reservoir",
            "Artificial lake",
            "Retention pond",
            "Detention pond",
            "Farm pond",
            "Quarry lake",
            "Gravel pit lake",
            "Cooling pond"
    };

    String[] lakeNames = {
            "Motionless Cove",
            "Grave Loch",
            "Sleeping Waters",
            "Turquoise Pond",
            "Eckman Cove",
            "Commouth Depths",
            "Boisterel Waters",
            "Innissons Domain",
            "Hebdare Cove",
            "Trayworth Gorge",
            "Sanguine Lagoon",
            "Cold Domain",
            "Sparkling Cove",
            "Pristine Expanse",
            "Wolfburn Pond",
            "Cowanmar Gorge",
            "Digwaki Lagoon",
            "Abcaster Shallows",
            "Windbour Basin",
            "Savabrook Basin",
            "Cursed Reservoir",
            "Harmonious Depths",
            "Northern Lake",
            "Waveless Depths",
            "Delisney Expanse",
            "Berpar Cove",
            "Calberg Shallows",
            "Reidrich Lake",
            "Killingland Lagoon",
            "Warwater Lagoon",
            "Iris Depths",
            "Silent Lagoon",
            "Glassy Waters",
            "Tadpole Shallows",
            "Warcarres Expanse",
            "Braceguay Lake",
            "Niversano Gorge",
            "Tunnet Loch",
            "Beaubrook Reservoir",
            "Roxisle Reservoir"
    };
}

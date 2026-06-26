package com.codecool;

import java.util.Random;

public class Util {

    Random random = new Random();


    public String randomLakeNameGenerator(){
        return lakeNames[random.nextInt(0, lakeNames.length)];
    }



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

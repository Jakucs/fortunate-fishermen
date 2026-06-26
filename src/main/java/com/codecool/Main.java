package com.codecool;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Util util = new Util();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Fisherman fisherman = new Fisherman("Halász Judit", 3, 12);
        Fisherman fisherman1 = new Fisherman("Halász Agéla", 5, 14);
        Fisherman fisherman2 = new Fisherman("Tokos Béla", 2, 9);

        for(int i = 0; i < 10; i++){
            fisherman.addSpot(new FishingSpot(
                    new WaterZone(util.randomLakeNameGenerator(),
                            util.randomLakeTypeGenerator(),
                            util.randomRegionGenerator())
            ));
            fisherman1.addSpot(new FishingSpot(
                    new WaterZone(util.randomLakeNameGenerator(),
                            util.randomLakeTypeGenerator(),
                            util.randomRegionGenerator())
            ));
            fisherman2.addSpot(new FishingSpot(
                    new WaterZone(util.randomLakeNameGenerator(),
                            util.randomLakeTypeGenerator(),
                            util.randomRegionGenerator())
            ));
        }

        fisherman.doFishingDay();

    }
}
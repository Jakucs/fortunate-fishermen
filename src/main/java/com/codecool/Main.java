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

        WaterZone waterZone = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone1 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone2 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone3 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone4 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone5 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone6 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone7 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone8 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());
        WaterZone waterZone9 = new WaterZone(util.randomLakeNameGenerator(), util.randomLakeTypeGenerator(), util.randomRegionGenerator());

        FishingSpot fishingSpot = new FishingSpot(waterZone);
        FishingSpot fishingSpot1 = new FishingSpot(waterZone1);
        FishingSpot fishingSpot2 = new FishingSpot(waterZone2);
        FishingSpot fishingSpot3 = new FishingSpot(waterZone3);
        FishingSpot fishingSpot4 = new FishingSpot(waterZone4);
        FishingSpot fishingSpot5 = new FishingSpot(waterZone5);
        FishingSpot fishingSpot6 = new FishingSpot(waterZone6);
        FishingSpot fishingSpot7 = new FishingSpot(waterZone7);
        FishingSpot fishingSpot8 = new FishingSpot(waterZone8);
        FishingSpot fishingSpot9 = new FishingSpot(waterZone9);

    }
}
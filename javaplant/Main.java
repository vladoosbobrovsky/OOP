package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public enum Color {
        RED,
        GREEN,
        BLUE,
        PINK
    }

    public enum Size {
        SMALL,
        MIDDLE,
        BIG
    }


    public static void main(String[] args) {
        List<Plant> plants = new ArrayList<Plant>();

        plants.add(new Flowerpot(Size.SMALL.name(), true));
        plants.add(new Cactus("Desert", false));
        plants.add(new Rose(true));

        for (Plant plant: plants) {
            System.out.println(plant.getDescription());
        }
    }
}

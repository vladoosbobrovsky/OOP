package com.company;

public class Flowerpot extends Plant {

    String size;
    boolean hasStand;

    Flowerpot() {
        size = Main.Size.MIDDLE.name();
        hasStand = true;
    }

    Flowerpot(String s, boolean st){
        size = s;
        hasStand = st;
    }

    @Override
    public String getDescription() {
        return "CLASS: Flowerpot - " + super.getDescription() + String.format("Size:%s; Has stand:%b", size, hasStand);
    }
}

package com.company;

public class Rose extends Plant {

    boolean hasThorns;

    Rose() {
        hasThorns = true;
        name = "Rose";
    }

    Rose(boolean t){
        hasThorns = t;
        name = "Rose";
    }

    @Override
    public String getDescription() {
        return "CLASS: Rose - " + super.getDescription() + String.format("Has Thorns:%b", hasThorns);
    }
}

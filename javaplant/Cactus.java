package com.company;

public class Cactus extends Plant {

    String sort = "NULL";
    boolean isToxic;

    Cactus(){
        isToxic = false;
        color = Main.Color.GREEN.name();
        name = "Cactus";
    }

    Cactus(String s, boolean t){
        sort = s;
        isToxic = t;
        color = Main.Color.GREEN.name();
        name = "Cactus";
    }

    @Override
    public String getDescription() {
        return "CLASS: Cactus - " + super.getDescription() + String.format("Sort:%s; Toxic:%b", sort, isToxic);
    }
}

package com.company;

public class Plant implements Description{


    String color;
    String name;
    double price;

    Plant() {}

    Plant(String c, String n, double p){
        color = c;
        name = n;
        price = p;
    }

    @Override
    public String getDescription() {
        return String.format("Name:%s; Color:%s; Price:%f; ",name, color, price);
    }
}

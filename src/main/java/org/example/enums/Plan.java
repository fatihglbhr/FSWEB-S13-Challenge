package org.example.enums;

public enum Plan {
    BASIC("Basic", 100),
    PRO("Pro",250);

    final String name;
    final int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

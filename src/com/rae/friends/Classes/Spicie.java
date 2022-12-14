package com.rae.friends.Classes;

public class Spicie {
    String name;

    public Spicie(String name){
        this.name = name;
    }

    public static class SpiciesList {
        public static Spicie Cat = new Spicie("Cat");
    }
}

package com.rae.friends.Classes;

public class Species {
    String name;

    public Species(String name){
        this.name = name;
    }

    public static class SpeciesList {
        public static Species Cat = new Species("Cat");
        public static Species Kitsune = new Species("Kitsune");
    }
}

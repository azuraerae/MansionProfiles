package com.rae.friends.Classes;

public class Specie {
    String name;

    public Specie(String name){
        this.name = name;
    }

    public static class SpeciesList {
        public static Specie Cat = new Specie("Cat");
        public static Specie Kitsune = new Specie("Kitsune");
        public static Specie Human = new Specie("Human");
        public static Specie Loly = new Specie("Loli");
        public static Specie Dragon = new Specie("Dragon");
    }
}

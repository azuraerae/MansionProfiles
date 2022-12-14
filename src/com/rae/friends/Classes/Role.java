package com.rae.friends.Classes;

public class Role {
    String name;
    public Role(String name){
        this.name = name;
    }

    public static class RoleList{
        public static Role Princess = new Role("Princess");
        public static Role Visitor = new Role("Visitor");
        public static Role Pet = new Role("Pet");
        public static Role Entertainer = new Role("Entertainer");
    }
}

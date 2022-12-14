package com.rae.friends.App;
import java.util.Scanner;

import com.rae.friends.Classes.Person;
import com.rae.friends.People.Azurae;

public class PeopleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person nieuw = new Person(null, null, args, null, null, args, false);
        System.out.println("who do you want info on?");
        String name = input.next();
        if (name == "rae") {
            Person.class.printen();
        }
    
    }
}
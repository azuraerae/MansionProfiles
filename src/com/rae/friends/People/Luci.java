package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Spicie.SpiciesList;

public class Luci extends Person {
    public Luci(){
        super(
            "Luci", 
            SpiciesList.Cat, 
            new String[]{
                "Breed me",
                "Fill me with seed",
                "Don't pull out",
                "Let's break the bed",
                "Blow my back out",
                "Let me drain you",
                "Stuff my throat",
                "I'll crush your balls"
            },
            new GregorianCalendar(2005, Calendar.APRIL, 1).getTime()
        );
    }
}
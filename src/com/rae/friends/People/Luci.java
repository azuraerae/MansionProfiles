package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Luci extends Person {
    public Luci(){
        super(
            "Luci", 
            new String[]{
                
            },
            SpeciesList.Cat, 
            new GregorianCalendar(2005, Calendar.APRIL, 1).getTime(),
            new String[]{
                "Breed me",
                "Fill me with seed",
                "Don't pull out",
                "Let's break the bed",
                "Blow my back out",
                "Let me drain you",
                "Stuff my throat",
                "I'll crush your balls"
            }
        );
    }
}
package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Nyo extends Person {
    public Nyo(){
        super(
            "Nyo", 
            new String[]{
                "the cat 2.0",
                "slow",
                "akku"
            },
            SpeciesList.Cat,
            new GregorianCalendar(2001, Calendar.SEPTEMBER, 3).getTime(),
            new String[]{
                
            }
        );
    }
}

package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Silver extends Person {
    public Silver(){
        super(
            "Silver", 
            new String[]{

            },
            SpeciesList.Kitsune,
            new GregorianCalendar(2004, Calendar.FEBRUARY, 15).getTime(),
            new String[]{
                "i'll make you trans",
                "Are you really fucking me while talking casually?"
            },
            "tease"
        );
    }
}

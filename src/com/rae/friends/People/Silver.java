package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Spicie.SpiciesList;

public class Silver extends Person {
    public Silver(){
        super(
            "Silver", 
            SpiciesList.Kitsune,
            new String[]{
                "i"ll make you trans"
                "Are you really fucking me while talking casually?"
            }, 
            new GregorianCalendar(2004, Calendar.Februari, 15).getTime()
        );
    }
}

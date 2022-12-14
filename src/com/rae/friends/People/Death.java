package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Death extends Person{
    public Death(){
        super(
            "Death", 
            SpeciesList.human, 
            new String[]{
                "Swallow my sand"
            },
            new GregorianCalendar(2002, Calendar.DECEMBER, 15).getTime()
        );
    }
}

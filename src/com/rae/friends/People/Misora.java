package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Misora extends Person{
    public Misora() {
        super(
            "Misora",
            new String[]{
                "Dragoli"
            },
            SpeciesList.Dragon,
            new GregorianCalendar(2004, Calendar.MAY, 31).getTime(), 
            new String[]{
                ""
            }
        );
    }
    
}

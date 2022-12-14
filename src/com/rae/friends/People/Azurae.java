package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Azurae extends Person {
    public Azurae(){
        super(
            "Rae", 
            SpeciesList.Cat, 
            new String[]{
                
            },
            new GregorianCalendar(2005, Calendar.AUGUST, 11).getTime()
        );
    }
}
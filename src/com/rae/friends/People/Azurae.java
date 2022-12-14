package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Spicie.SpiciesList;

public class Azurae extends Person {
    public Azurae(){
        super(
            "Rae", 
            SpiciesList.Cat, 
            new String[]{
                
            },
            new GregorianCalendar(2005, Calendar.AUGUST, 11).getTime()
        );
    }
}
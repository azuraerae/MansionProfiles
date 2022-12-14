package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Dizzy extends Person{
    public Dizzy(){
        super(
            "dizzy",
            new String[]{
                "princess",
                "princess dizzy"
            },
            SpeciesList.Human,
            new GregorianCalendar(1904 ,Calendar.NOVEMBER, 28).getTime(),
            new String[]{
                
            }
        );
    }
}

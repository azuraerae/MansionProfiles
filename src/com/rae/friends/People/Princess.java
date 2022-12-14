package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Princess extends Person{
    public Princess(){
        super(
            "Dizzy",
            new String[]{
                "Princess dizzy",
                "Zomboli"
            },
            SpeciesList.Loli,
            new GregorianCalendar(1904 ,Calendar.NOVEMBER, 28).getTime(),
            new String[]{
                
            },
            "owner"
        );
    }
}

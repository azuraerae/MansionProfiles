package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Role.RoleList;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Azurae extends Person {
    public Azurae(){
        super(
            "Azurae", 
            RoleList.Pet,
            new String[]{
                "Rae"
            },
            SpeciesList.Cat, 
            new GregorianCalendar(2005, Calendar.AUGUST, 11).getTime(),
            new String[]{
                "Let it rip your balls",
                "Real real real real real"
            }
        );
    }
}
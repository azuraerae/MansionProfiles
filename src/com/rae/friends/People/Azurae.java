package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.jar.Attributes.Name;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Role;
import com.rae.friends.Classes.Role.RoleList;
import com.rae.friends.Classes.Specie.SpeciesList;

import javafx.print.PrintColor;

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
            },
            true
        );
    }

}
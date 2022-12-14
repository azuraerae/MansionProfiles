package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Role.RoleList;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Death extends Person{
    public Death(){
        super(
            "Death", 
            RoleList.Visitor,
            new String[]{
                
            },
            SpeciesList.Human, 
            new GregorianCalendar(2002, Calendar.DECEMBER, 15).getTime(),
            new String[]{
                "Swallow my sand"
            },
            true

        );
    }
}

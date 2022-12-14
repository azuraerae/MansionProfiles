package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Role.RoleList;
import com.rae.friends.Classes.Specie.SpeciesList;

public class Lenis extends Person {
    public Lenis(){
        super(
            "Lenis",
            RoleList.Pet,
            new String[]{
                "Lenny"
            },
            SpeciesList.Cat, 
            new GregorianCalendar(2004, Calendar.APRIL, 3).getTime(),
            new String[]{
                "headless? I get plenty of head",
                "you better keep your hands off me or you'll catch these hands. MAGIC hands",
                "you're mother"
            },
            true
        );
    }
}

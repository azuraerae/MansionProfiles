package com.rae.friends.People;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.rae.friends.Classes.Person;
import com.rae.friends.Classes.Species.SpeciesList;

public class Lenny extends Person {
    public Lenny(){
        super(
            "Lenny",
            SpeciesList.Cat, 
            new String[]{
                "headless? I get plenty of head",
                "you better keep your hands off me or you'll catch these hands. MAGIC hands",
                "you're mother"
            },
            new GregorianCalendar(2004, Calendar.APRIL, 3).getTime()
        );
    }
}

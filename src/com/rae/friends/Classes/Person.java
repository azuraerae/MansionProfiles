package com.rae.friends.Classes;

import java.util.Date;
import java.util.Random;

public class Person {
    protected String name;
    Role role;

    Date birthday;
    Specie kind;
    
    String[] nicknames;
    String[] voicelines;

    boolean doesERP;

    public Person(
        String name, 
        Role role,
        String[] nicknames,

        Specie kind, 

        Date birthday,
        
        String[] voicelines,
        boolean ERP
        ){
            
        this.name = name;
        this.kind = kind;
        this.voicelines = voicelines;
        this.nicknames = nicknames;
        this.role = role;
        this.doesERP = ERP;
    }

    //Methods
    public String getVoicelines(){
        String output = "";
        if(this.voicelines.length == 0){return "";}; 

        for (String string : this.voicelines) {
            output += " \n" + string;
        }
        return output;
    }

    public String getRandomVoiceline(){
        Random r = new Random();
        int l = r.nextInt(this.voicelines.length);
        return this.voicelines[l];
    }


    //Setters
    public void setName(String newName){
        this.name = newName;
    }

    public void setKind(Specie kind){
        this.kind = kind;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }
    public void printen() {
        System.out.println(getName());
    }
}

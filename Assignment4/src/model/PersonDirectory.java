/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kashr
 */
public class PersonDirectory {
    private ArrayList<Person> directory;

    public final Map<Integer, Person> personMap;
    
    public PersonDirectory(){
         this.directory=new ArrayList<Person>();
         this.personMap = new HashMap<>();
    }

    public ArrayList<Person> getdirectory() {
        return directory;
    }
    
    public void setdirectory(ArrayList<Person> personDirectory) {
        this.directory = personDirectory;
    }
    
    public Person addNewPersons(){
       //created new method newPersons to put data into Person
        Person newPersons=new Person();
        directory.add(newPersons);
        return newPersons;
    }
    
    public void deletePersons(Person u){
        directory.remove(u);
    }
}

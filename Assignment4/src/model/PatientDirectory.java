/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Patient;
import model.PersonDirectory;

import java.util.ArrayList;

/**
 *
 * @author kashr
 */
public class PatientDirectory extends PersonDirectory{
    
    ArrayList<Patient> patientList;
    
    public PatientDirectory(){
         this.patientList=new ArrayList<Patient>();
    }
    
    public Patient addNewPatient(){
       //created new method addNewPatient to insert patient in the directory
        Patient newPersons=new Patient();
        patientList.add(newPersons);        
        return newPersons;
    }
    
    public void deletePatient(Patient u){
        patientList.remove(u);
    }
    
}

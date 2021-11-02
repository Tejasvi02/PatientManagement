/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author kashr
 */
public final class MedicalSystem {
    
    public PersonDirectory personDirectory;
    public PatientDirectory patientDirectory;
    public int numPersons;
    public Set<String> citySet;
    
    public MedicalSystem() {
        this.personDirectory = new PersonDirectory();
        this.patientDirectory = new PatientDirectory();
        citySet = new HashSet<> (); 
        initializeData(); //sets the initialized data into the array
    }
            
    public void initializeData() {
        
        int numPersonsToInitialize = 600;
        
        for(int i=0;i< numPersonsToInitialize; ++i){
            
            Random rand = new Random();
            
            if(rand.nextBoolean()){
                Patient u=patientDirectory.addNewPatient();
                u.setName(generateRandomAlphaString());
                u.setCommunity(generateCommunity());
                u.setAge(generateAge());
                String cityName = generateCity();
                u.setCity(cityName);
                this.citySet.add(cityName);
                u.setAddress(generateAplhaNumericString());
                u.setId(numPersons++);
                EncounterHistory encounterhistory=u.getEncounterhistory();
                int bp = generateBP();
                Encounter encounter = new Encounter();
                encounter.getVitalsign().setBp(bp);
                encounterhistory.getEncounters().add(encounter);
                personDirectory.getdirectory().add(u);
                personDirectory.personMap.put(u.getId(), u);
            } else {            
                Person u = this.personDirectory.addNewPersons();
                u.setName(generateRandomAlphaString());
                u.setCommunity(generateCommunity());
                u.setAge(generateAge());
                String cityName = generateCity();
                u.setCity(cityName);
                this.citySet.add(cityName);
                u.setAddress(generateAplhaNumericString());
                u.setId(numPersons++);
                personDirectory.personMap.put(u.getId(), u);
            }
        }
        
    }
    private String generateRandomAlphaString()
    {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
        .limit(targetStringLength)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
        
        return generatedString;
    }
    
    private String generateAplhaNumericString(){
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
        .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
        .limit(targetStringLength)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        .toString();
        
        return generatedString;
    }
    
    private String generateCommunity(){
        ArrayList<String> communities = new ArrayList<>();
        communities.add("KK Nagar");
        communities.add("Kalpakkam");
        Random random = new Random();
        var rand = random.nextInt(2);
        return communities.get(rand);
    }
    
    private String generateCity(){
        ArrayList<String> communities;
        communities = new ArrayList<>();
        communities.add("Boston");
        communities.add("NYC");
        communities.add("Seattle");
        communities.add("Washington D.C");
        communities.add("Austin");
        communities.add("San Fransisco");
        communities.add("Chennai");
        Random random = new Random();
        var rand = random.nextInt(7);
        return communities.get(rand);
    }
    
    private int generateAge(){        
        Random random = new Random();
        var age = random.nextInt(100);
        return age;
    }
        private int generateBP(){        
        Random random = new Random();
        var bp = random.nextInt(100);
        return bp+60;
    }
    
}

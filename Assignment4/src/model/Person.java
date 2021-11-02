/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kashr
 */
public class Person {
    private int age ;
    protected boolean isPatient;
    private String name;
    int id;
    House house;
    
    public Person(){
        isPatient = false;
        house = new House();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsPatient() {
        return isPatient;
    }

    public void setIsPatient(boolean isPatient) {
        this.isPatient = isPatient;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.house.getAddress();
    }

    public void setAddress(String address) {
        this.house.setAddress(address);
    }

    public String getCommunity() {
        return this.house.getCommunity();
    }

    public void setCommunity(String community) {
        this.house.setCommunity(community);
    }

    public String getCity() {
        return this.house.getCity();
    }

    public void setCity(String city) {
        this.house.setCity(city);
    }
    
    @Override
    public String toString(){
        return name;
    }

    
}

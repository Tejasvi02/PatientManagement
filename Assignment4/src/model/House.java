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
public class House {
    String address;
    Community community;
    
    
    public House(){
        community = new Community();         
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCommunity() {
        return community.getCommunity();
    }

    public void setCommunity(String community) {
        this.community.setCommunity(community);
    }

    public String getCity() {
        return this.community.getCityName();
    }

    public void setCity(String cityName) {
        this.community.setCityName(cityName);
    }
}

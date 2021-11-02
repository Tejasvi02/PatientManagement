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
public class Community {
    String community;
    City city;

    public String getCityName() {
        return city.getCityName();
    }

    public void setCityName(String cityName) {
        this.city.setCityName(cityName);
    }
    
    public Community(){
        city = new City();
    }
    

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
}

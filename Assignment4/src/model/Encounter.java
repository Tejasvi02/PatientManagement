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
public class Encounter {
    VitalSigns vitalsign;

    public Encounter() {
        this.vitalsign = new VitalSigns();
    }

    public VitalSigns getVitalsign() {
        return vitalsign;
    }

    public void setVitalsign(VitalSigns vitalsign) {
        this.vitalsign = vitalsign;
    }
}

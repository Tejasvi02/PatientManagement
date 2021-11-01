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
public class Patient extends Person {
    EncounterHistory encounterhistory;

    public Patient() {
        this.encounterhistory = new EncounterHistory();
        this.isPatient = true;
    }

    public EncounterHistory getEncounterhistory() {
        return encounterhistory;
    }

    public void setEncounterhistory(EncounterHistory encounterhistory) {
        this.encounterhistory = encounterhistory;
    }
}

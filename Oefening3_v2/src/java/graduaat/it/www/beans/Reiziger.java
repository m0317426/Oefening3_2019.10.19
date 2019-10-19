/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author c1041731
 */

@Named("reiziger")
@RequestScoped

public class Reiziger {
    
    private String Naam;

    public Reiziger() {
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }
    
    
    
}

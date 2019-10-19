/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans;

import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author c1041731
 */
@Named ("Bus")
@RequestScoped

public class Bus {

    private ArrayList<Reiziger> reiziger;

    public Bus() {
    }

    public ArrayList<Reiziger> getReiziger() {
        return reiziger;
    }

    public void setReiziger(ArrayList<Reiziger> reiziger) {
        this.reiziger = reiziger;
    }
    
    public String toevoegen(Reiziger reiziger){
       
        return "lijst";
    }

    
}

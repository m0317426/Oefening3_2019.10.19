/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduaat.it.www.beans;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.xml.rpc.encoding.Serializer;

/**
 *
 * @author c1041731
 */
@Named ("Bus")
@SessionScoped

public class Bus implements Serializable{

    private ArrayList<Reiziger> reizigers =new ArrayList<>();

    public Bus() {
    }

    public ArrayList<Reiziger> getReiziger() {
        return reizigers;
    }

    public void setReiziger(ArrayList<Reiziger> reiziger) {
        this.reizigers = reiziger;
    }
    
    public String toevoegen(Reiziger reiziger){
       this.reizigers.add(reiziger);
        return "lijst";
    }

    
}

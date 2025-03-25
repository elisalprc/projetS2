/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leprince.projets2;

import java.util.ArrayList;

/**
 *
 * @author clema
 */
public class Poste extends Equipement {
    private String refPoste;
    private String dPoste;
    private ArrayList<Machine> listeMachine;

    public String getRefPoste() {
        return refPoste;
    }

    public String getdPoste() {
        return dPoste;
    }

    public ArrayList<Machine> getListeMachine() {
        return listeMachine;
    }

    public void setRefPoste(String refPoste) {
        this.refPoste = refPoste;
    }

    public void setdPoste(String dPoste) {
        this.dPoste = dPoste;
    }

    public void setListeMachine(ArrayList<Machine> listeMachine) {
        this.listeMachine = listeMachine;
    }

    public Poste(String refPoste, String dPoste, ArrayList<Machine> listeMachine, String refEquipement, String dEquipement) {
        super(refEquipement, dEquipement);
        this.refPoste = refPoste;
        this.dPoste = dPoste;
        this.listeMachine = listeMachine;
    }
    
}

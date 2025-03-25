/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leprince.projets2;

/**
 *
 * @author clema
 */
public class Machine extends Equipement {
    private String refMachine;
    private String type;
    private String dmachine;
    private float origine_x;
    private float origine_y;
    private float cout;
    private float t; //temps en heures
    private String etat; // description de l'etat

    public String getRefMachine() {
        return refMachine;
    }

    public String getType() {
        return type;
    }

    public String getDmachine() {
        return dmachine;
    }

    public float getOrigine_x() {
        return origine_x;
    }

    public float getOrigine_y() {
        return origine_y;
    }

    public float getCout() {
        return cout;
    }

    public float getT() {
        return t;
    }

    public String getEtat() {
        return etat;
    }

    public void setRefMachine(String refMachine) {
        this.refMachine = refMachine;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDmachine(String dmachine) {
        this.dmachine = dmachine;
    }

    public void setOrigine_x(float origine_x) {
        this.origine_x = origine_x;
    }

    public void setOrigine_y(float origine_y) {
        this.origine_y = origine_y;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public void setT(float t) {
        this.t = t;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Machine(String refMachine, String type, String dmachine, float origine_x, float origine_y, float cout, float t, String etat, String refEquipement, String dEquipement) {
        super(refEquipement, dEquipement);
        this.refMachine = refMachine;
        this.type = type;
        this.dmachine = dmachine;
        this.origine_x = origine_x;
        this.origine_y = origine_y;
        this.cout = cout;
        this.t = t;
        this.etat = etat;
    }
    
}

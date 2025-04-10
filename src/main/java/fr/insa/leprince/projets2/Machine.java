/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leprince.projets2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


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
    
    @Override
    public String toString() {
        return "machine : " + this.dmachine + " ..." ;
        
    }
    
    public void afficherMachine(){
        System.out.println("référence de la machine = "+ this.refMachine);
        System.out.println("type de la machine = "+ this.type);
        System.out.println("dmachine = "+ this.dmachine);
        System.out.println("Origine = ("+ this.origine_x + "," + this.origine_y + ")");
        System.out.println("cout de la Machine = "+ this.cout);
        System.out.println("temps d'utilisation de la Machine = "+ this.t);
        System.out.println("Etat de la Machine = "+ this.etat);
    }
    
    public void modifierMachine(String type, String dmachine, float origine_x, float origine_y, float cout, float t, String etat) {
        this.type = type;
        this.dmachine = dmachine;
        this.origine_x = origine_x;
        this.origine_y = origine_y;
        this.cout = cout;
        this.t = t;
        this.etat = etat;
    }
     
    /*
    public static int[] idMachinePrAnalyse(ArrayList<Machine> L) {  // va retourner le tableau contenant les machines qui ont eu un arret, 
                                                                   //on lui envoie la liste machine de Atelier et le document à lire ? 
        // il faut renseigner le chemin jusqu'au fichier 
        System.out.println("renseigner le chemin d'accès au fichier");
        String chemin = Lire.S();
        
        int taille = L.size();
        int[]M = new int[taille];   // le tableau a la place pour contenir toutes les machins de l'atelier 
        int e = 0;
        
        
        BufferedReader bfr = new BufferedReader(new FileReader(chemin)); 
        String lignelue = bfr.readLine(); 
        StringTokenizer t = new StringTokenizer(lignelue,"");
        String machine = t.nextToken();
        // verif si cette machine est dans l'atelier : comparer machine et dMachine de chaque objet de l'arrayList
        

        
    } */
}

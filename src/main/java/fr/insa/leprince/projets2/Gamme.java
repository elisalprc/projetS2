/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leprince.projets2;

import java.util.ArrayList;

/**
 *
 * @author eleprince01
 */
public class Gamme {
//Atributs:
    private String refGamme;
    private ArrayList<Operation> listeOperations;
    private ArrayList<Equipement> listeEquipement;
    private Object listeGamme;
    
//Constructeur:
    public Gamme(String refGamme, ArrayList<Operation> listeOperations, ArrayList<Equipement> listeEquipement){
        this.listeEquipement=listeEquipement;
        this.listeOperations=listeOperations;
        this.refGamme=refGamme;
    }

//Getters et setters:
    public String getRefGamme() {
        return refGamme;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public ArrayList<Operation> getListeOperations() {
        return listeOperations;
    }

    public void setListeOperations(ArrayList<Operation> listeOperations) {
        this.listeOperations = listeOperations;
    }

    public ArrayList<Equipement> getListeEquipement() {
        return listeEquipement;
    }

    public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
        this.listeEquipement = listeEquipement;
    }
    
//Methodes:
    //suppression d'une gamme:
      //voir directement dans Atelier pour supprimer une gamme de l'ensemble des gammes proposées.
    
    //modifierGamme:
    public void modifierGamme(ArrayList<Gamme> g, int i){
        listeGamme.set(i,g); //remplacer la gamme à la position i par la game g
    }
    
    //afficher une gamme
    public void AfficherGamme(Gamme gamme){
    System.out.println("Pour réaliser la gamme de fabrication "+refGamme+" il faut les operations suivantes : "+listeOperations+" ainsi que les equipements suivants : "+listeEquipement);
}
        
}
//creerGamme () ;
    public void CreerGamme(String ref,ArrayList<Operation> listeOperations, ArrayList<Equipement> listeEquipement){
    Gamme gamme = newGamme (ref, listeOperations, ListeEquipement);
}



//Les méthodes de calcul suivantes :

//coutGamme(), (retourne le coût d’une gamme donnée (float)

//dureeGamme (), (calcule la durée d’exécution d’une gamme (float).

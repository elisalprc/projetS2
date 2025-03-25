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
public class Operateur extends Personne {
    private ArrayList<Equipement> ListeEquipements = new ArrayList<Equipement>;

    public ArrayList<Equipement> getListeEquipements() {
        return ListeEquipements;
    }

    public void setListeEquipements(ArrayList<Equipement> ListeEquipements) {
        this.ListeEquipements = ListeEquipements;
    }

    public Operateur(String nom, String prenom, int id, ArrayList<Equipement> ListeEquipements) {
        super(nom, prenom, id);
    }
}

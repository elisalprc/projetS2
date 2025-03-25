/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leprince.projets2;

import java.util.ArrayList;

/**
 *
 * @author chach
 */
public class Atelier {
    //Attributs :
        private String nom; 
        private ArrayList listeMachines;
        private ArrayList listePostes;
        private ArrayList listeProduits;
        private ArrayList listeGamme;
        private ArrayList listeOperateurs;
        
    //Getters :
        public String getNom(){
            return nom;
        }
   
        public ArrayList getListeMachines() {
            return listeMachines;
        }

        public ArrayList getListePostes() {
            return listePostes;
        }

        public ArrayList getListeProduits() {
            return listeProduits;
        }

        public ArrayList getListeGamme() {
            return listeGamme;
        }

        public ArrayList getListeOperateurs() {
            return listeOperateurs;
        }
        
    //Setters :
        public void setNom(String nom){
            this.nom=nom;
        }

        public void setListeMachines(ArrayList listeMachines) {
            this.listeMachines = listeMachines;
        }

        public void setListePostes(ArrayList listePostes) {
            this.listePostes = listePostes;
        }

        public void setListeProduits(ArrayList listeProduits) {
            this.listeProduits = listeProduits;
        }

        public void setListeGamme(ArrayList listeGamme) {
            this.listeGamme = listeGamme;
        }

        public void setListeOperateurs(ArrayList listeOpérateurs) {
            this.listeOperateurs = listeOpérateurs;
        }
        
    //Constructeur:
        public Atelier(String nom, ArrayList listeMachines, ArrayList listePostes, ArrayList listeProduits, ArrayList listeGamme, ArrayList listeOpérateurs) {
            this.nom = nom;
            this.listeMachines = listeMachines;
            this.listePostes = listePostes;
            this.listeProduits = listeProduits;
            this.listeGamme = listeGamme;
            this.listeOperateurs = listeOperateurs;
        }
    
    //Methodes:
        public void ajoutMachine(Machine machine){
            listeMachines.add(machine); 
        }
        public void ajoutPoste(Poste poste){
            listePostes.add(poste);
        }
        public void ajoutProduit(Produit produit){
            listeProduits.add(produit);
        }
        public void ajoutOperateur(Operateur operateur){
            listeOperateurs.add(operateur);
        }
        public void ajoutGammeFabrication(Gamme gamme){
            listeGamme.add(gamme);
        }
       
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.leprince.projets2;

/**
 *
 * @author chach
 */
public class Atelier {
    //Attributs :
        private String nom; 
        private Liste_de_Machine listeMachines;
        private Liste_de_Postes listePostes;
        private Liste_de_Produits listeProduits;
        private Liste_de_Gamme listeGamme;
        private Liste_d_Operateur listeOpérateurs;
        
    //Getters :
        public String getNom(){
            return nom;
        }
   
        public Liste_de_Machine getListeMachines() {
            return listeMachines;
        }

        public Liste_de_Postes getListePostes() {
            return listePostes;
        }

        public Liste_de_Produits getListeProduits() {
            return listeProduits;
        }

        public Liste_de_Gamme getListeGamme() {
            return listeGamme;
        }

        public Liste_d_Operateur getListeOpérateurs() {
            return listeOpérateurs;
        }
        
    //Setters :
        public void setNom(String nom){
            this.nom=nom;
        }

        public void setListeMachines(Liste_de_Machine listeMachines) {
            this.listeMachines = listeMachines;
        }

        public void setListePostes(Liste_de_Postes listePostes) {
            this.listePostes = listePostes;
        }

        public void setListeProduits(Liste_de_Produits listeProduits) {
            this.listeProduits = listeProduits;
        }

        public void setListeGamme(Liste_de_Gamme listeGamme) {
            this.listeGamme = listeGamme;
        }

        public void setListeOpérateurs(Liste_d_Operateur listeOpérateurs) {
            this.listeOpérateurs = listeOpérateurs;
        }
        
    //Constructeur:
        public Atelier(String nom, Liste_de_Machine listeMachines, Liste_de_Postes listePostes, Liste_de_Produits listeProduits, Liste_de_Gamme listeGamme, Liste_d_Operateur listeOpérateurs, <any> ) {
            this.nom = nom;
            this.listeMachines = listeMachines;
            this.listePostes = listePostes;
            this.listeProduits = listeProduits;
            this.listeGamme = listeGamme;
            this.listeOpérateurs = listeOpérateurs;
            this.<error> = <error>;
        }
    
    //Methodes:
            
}

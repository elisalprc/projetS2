/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// enregistrer ses modifs : [Team] commit puis push
//récupérer le fichier le plus récent : [TEAM] [remote] pull
// bien selectionner la localisation github avec l'url (la 2e)

package fr.insa.leprince.projets2;

import java.util.ArrayList;

/**
 *
 * @author eleprince01
 */
public class ProjetS2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // objets utiles pour creer les operateurs 
        ArrayList<Equipement> LEQ = new ArrayList<>();
        // pour l'atelier 
        ArrayList<Machine> LM = new ArrayList<>();
        ArrayList<Poste> LPO = new ArrayList<>();
        ArrayList<Produit> LPRO = new ArrayList<>();
        ArrayList<Gamme> LG = new ArrayList<>();
        ArrayList<Operateur> LOP = new ArrayList<>();
        Atelier A1 = new Atelier("atelier test",LM,LPO,LPRO,LG,LOP);
        
        
        // on va entrer des infos dans l'atelier 
        
        Produit a = new Produit("a1","crayon");
        A1.ajoutProduit(a);
        System.out.println(A1.getListeProduits());  //!\\ il faut définir un toString pour chaque classe pour que ça s'affiche correctement 
                                                    // ou autre chose mais je sais pas 
        Equipement test = new Equipement("e1","essai");
        Operateur op = new Operateur("turing","alan",1,LEQ);
        op.ajoutEquipement(test);
        Operateur opa = new Operateur("bzz","maya",2,LEQ); //meme liste eq 
        A1.ajoutOperateur(op);
        A1.ajoutOperateur(opa);
        System.out.println(A1.getListeOperateurs());
        
        
        
    }
}

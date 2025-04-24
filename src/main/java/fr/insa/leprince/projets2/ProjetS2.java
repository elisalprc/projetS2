/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

// enregistrer ses modifs : [Team] commit puis push
//récupérer le fichier le plus récent : [TEAM] [remote] pull
// bien selectionner la localisation github avec l'url (la 2e)

package fr.insa.leprince.projets2;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author eleprince01
 */
public class ProjetS2 {

    public static void main(String[] args) throws IOException {
        // objets utiles pour creer les operateurs 
        ArrayList<Equipement> LEQ = new ArrayList<>();
        // pour l'atelier 
        ArrayList<Machine> LM = new ArrayList<>();
        ArrayList<Poste> LPO = new ArrayList<>();
        ArrayList<Produit> LPRO = new ArrayList<>();
        ArrayList<Gamme> LG = new ArrayList<>();
        ArrayList<Operateur> LOP = new ArrayList<>();
        Atelier A1 = new Atelier("atelier test",LM,LPO,LPRO,LG,LOP);
        ArrayList<Machine> LEQp = new ArrayList<>();
        
        
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
        
        Machine M1 = new Machine("redTEST","decoupeuse","decoup laser",2,2,10,2,"libre","eqM1","machine1");
        Machine M2 = new Machine("refTEST2","imprimante","imp 3D",4,4,30,8,"libre","eqM2","machine2");
        A1.ajoutMachine(M1);
        System.out.println(A1.getListeMachines());
        Poste poste1 = new Poste("poste d'essai","poste1",LEQp,"poste d'essai","poste1");
        poste1.ajoutMachine(M1);
        poste1.ajoutMachine(M2);
        A1.ajoutPoste(poste1);
        System.out.println(A1.getListePostes());
        System.out.println(poste1.getListeMachine());
  
        
// =====================================================================================       
// IMPORTANT : pour ecrire et lire dans un fichier texte donc sauvegarder des données !
// =====================================================================================   
        String file_name = "C:/Documents/SuiviMaintenance"; //on aura besoin du nom du fichier par la suite ça risque de bloquer/buguer à ce niveau là :') vu que j'ai mis le fichier chez moi... ou alors on créée tous un fichier qu'on met au même endroit ???? en tout cas le path c'est le chemin pour y acceder :)
        // pour lire un fichier texte
        try{
            ReadFile file = new ReadFile(file_name);
            String[] lignes = file.OpenFile();
            int i;
            for (i=0; i<lignes.length;i++){
                System.out.println(lignes[i]);
            }
        }
        catch(IOException e){
            System.out.println("Une erreur est survenue à la lecture, désolé, veuillez recommencer");           
        }
        
        // pour écrire dans le fichier texte
        try{
            WriteFile fichier_texte  = new WriteFile(file_name, true); 
            System.out.println("entrer la date sous le format : jjmmaaaa");
            String Date = Lire.S();
            System.out.println("entrer l'heure sous le format : hh:mm");
            String Heure = Lire.S();
            System.out.println("entrer la Machine sous le format : Mach_n");
            String Machine = Lire.S();
            System.out.println("entrer l'évènement sous le format : A (pour arrêt) ou D (pour démarrage)");
            String Evenement = Lire.S();
            System.out.println("entrer l'opérateur sous le format : OPccc");
            String Operateur = Lire.S();
            System.out.println("entrer la cause : panne, accident, maintenance ou x si aucun des trois");
            String Cause = Lire.S();
            fichier_texte.writeToFile(Date+"   "+Heure+"   "+Machine+"    "+Evenement+"            "+Operateur+"       "+Cause);
                System.out.println("Text File Written To"); //pour dire que ça a bien écrit dans le fichier texte :)
        }
        catch(IOException e){
            System.out.println("Une erreur est survenue à l'écriture, désolé, veuillez recommencer");           
        }
    }
}

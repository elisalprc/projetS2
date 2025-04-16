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
        String file_name = "C:/Documents/Test info"; //on aura besoin du nom du fichier par la suite ça risque de bloquer/buguer à ce niveau là :') vu que j'ai mis le fichier chez moi... ou alors on créée tous un fichier qu'on met au même endroit ???? en tout cas le path c'est le chemin pour y acceder :)
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
            WriteFile patate  = new WriteFile(file_name, true); 
            patate.writeToFile("Salut bonsoir je suis une patate ambulante ! "
                    + "Quoi tu n'as jamais entendu parler de tubercule narrateur ? "
                    + "Fichtre ! Je ne sais que dire sinon que je suis interloqué ! "
                    + "Ma fierté en prends un sacré coup, il faut dire après tout que nous faisons parti avec les légumineuse des meilleurs conteurs et orateurs interstellaires ! "
                    + "Dans bien de nombreux endroit où j'ai fait escale l'on m'acclamait à vive voix. "
                    + "Tous s'époumonaient à hurler et quémander d'autres histoires. "
                    + "Il faut dire que certains vivent tellement reclus que chaque histoire devient légende et à le gout d'or. "
                    + "Quoi ? tu ne vois pas ce que c'est ??? Diantre mais qui est tu donc pour ignorer ceci ? "
                    + "N'importe quel ignare même les plus grands qu'il m'ai été donné de croiser avaient tous entendu parlés de cette pierre fabuleuse ! "
                    + "Roger c'est ça ? Moi c'est... enfin cela est sans importance après tout qu'est un nom sinon qu'une suite de lettre destinée à s'identifier ? "
                    + "Je peux au moins te confier être une suivante de la Dame. Que dis tu ? Tu veux ma mort c'est bien ça ? "
                    + "Ne pas connaitre la Dame c'est comme penser que nous sommes les seuls à respirer et festoyer ! "
                    + "Pardi l'ami, c'est bien trop pour moi ! La Dame est en chaque coeur et chaque être ! "
                    + "Elle fait foi dans le cosmère entier, foi de patate ! Alors mon petit Roger, si tu as un peu de temps, que dis-je, que tu en ai à disposition ou pas, assied toi auprès de moi et écoute ce que j'ai à te dire. "
                    + "Ne pas connaitre l'or ou n'avoir jamais vu tubercule parler peut aller mais ignorer jusqu'à l'existence de la Dame, c'est dépasser les bornes... "
                    + "Il y a fort longtemps mon brave si longtemps que rare sont les peuples y ayant assistés... "
                    + "Non Roger, ce n'est pas une question de siècle ni de millénaires met toi bien ça dans le crâne, c'est tellement plus que même le plus sage de tes compatriotes ne saurait imaginer un temps aussi lointain. "
                    + "Bien avant que le cosmère ne prenne entièrement forme, le rire empreint de légèreté et d'innocence d'une enfant éclatait, faisant de fait vibrer jusqu'aux entrailles de l'étoile sur laquelle elle et les siens se trouvaient. "
                    + "L'étoile Irma. La jeune fille s'appelait Aeryn. Ahhh oui c'est bien elle, Aeryn est la Dame mais cesse donc de m'interrompre et écoute la suite...");
                System.out.println("Text File Written To"); //pour dire que ça a bien écrit dans le fichier texte :)
        }
        catch(IOException e){
            System.out.println("Une erreur est survenue à l'écriture, désolé, veuillez recommencer");           
        }
    }
}

package fr.efrei.java;

import java.util.Scanner;
import java.util.ArrayList;

public class HelloEfrei {
    public static void main(String[] args){

//        System.out.println("Hello LSI 1");

//        String prenomAlice="Alice";
//        String nomAlice = "Martin";
//        String langagePrefere = "Java";
//        double Salaire = 42000;

//        System.out.println("Prénom :" + prenomAlice);
//        System.out.println("Nom :" + nomAlice);
//        System.out.println("Langage :" + langagePrefere);
//        System.out.println("Salaire :" + Salaire);

        ArrayList<Collaborateur> listeCollaborateur = new ArrayList<>();
        Adresse addAlice = new Adresse("avenue de l'aurore",44300,"Nantes","France");
        Adresse addAlex = new Adresse("rue du Jura", 75013, "Paris","France");
        Collaborateur Alice = new Programmeur("Alice", "Martin", "Java", 4000.0,addAlice);
        Collaborateur Alex = new Programmeur("Alex", "Dupont", "Java", 4000.0,addAlex);

        listeCollaborateur.add(Alice);
        listeCollaborateur.add(Alex);

        int cpt = 4;
        Scanner scanners = new Scanner(System.in);
        while(cpt!=0) {
            System.out.println("=====================================");
            System.out.println("    Gestion des programmeur     ");
            System.out.println("=====================================");
            System.out.println("1- Afficher Alice");
            System.out.println("2- Afficher Alex");
            System.out.println("3- Ajouter programmeur");
            System.out.println("0- Quitter");
            System.out.print("Entrez votre saisie : ");
            cpt = scanners.nextInt();
            if(cpt==1){
                Alice.afficherCollaborateur();
            }
            if(cpt==2){
                Alex.afficherCollaborateur();
            }
            if(cpt==3){
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Entrez votre prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrez votre nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez votre langage prefere : ");
                    String langagePrefere = scanner.nextLine();
                    System.out.print("Entrez votre rue : ");
                    String rue = scanner.nextLine();
                    System.out.print("Entrez votre code postal : ");
                    Integer code_postal = scanner.nextInt();
                    System.out.print("Entrez votre ville : ");
                    String ville = scanner.nextLine();
                    System.out.print("Entrez votre pays : ");
                    String pays = scanner.nextLine();
                    while (true) {
                        System.out.print("Entrez votre salaire : ");
                        if (scanner.hasNextDouble()) {
                            double salaire = scanner.nextDouble();
                            scanner.nextLine();
                            Adresse addnv = new Adresse(rue,code_postal,ville,pays);
                            Programmeur nv = new  Programmeur(prenom,nom,langagePrefere,salaire,addnv);
                            listeCollaborateur.add(nv);
                            if (salaire >= 0) {
                                break;
                            }

                            System.out.println("Le salaire ne peut pas être négatif.");
                        } else {
                            System.out.println("Veuillez saisir un nombre.");
                            scanner.nextLine();
                        }
                    }
            }
            else{
                System.out.println("Erreur de saisie");
            }
        }
        for( int i=0;i<listeCollaborateur.size();i++){
            listeCollaborateur.get(i).travailler();
        }

        scanners.close();
        Alice.augmenterSalaire(5);
        Alice.afficherCollaborateur();
    }
}
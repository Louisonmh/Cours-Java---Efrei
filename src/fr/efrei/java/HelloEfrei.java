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

        ArrayList<Programmeur> listeProgrammeurs = new ArrayList<>();
        Programmeur Alice = new Programmeur("Alice", "Martin", "Java", 40000);
        Programmeur Alex = new Programmeur("Alex", "Dupont", "Java", 40000);

        listeProgrammeurs.add(Alice);
        listeProgrammeurs.add(Alex);

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
                Alice.afficherProgrammeur();
            }
            if(cpt==2){
                Alex.afficherProgrammeur();
            }
            if(cpt==3){
                Programmeur nv = new  Programmeur();
                listeProgrammeurs.add(nv);
            }
            else{
                System.out.println("Erreur de saisie");
            }
        }
        scanners.close();
        Alice.afficherProgrammeur();
        Alice.augmenterSalaire(5);
        Alice.afficherProgrammeur();
    }
}
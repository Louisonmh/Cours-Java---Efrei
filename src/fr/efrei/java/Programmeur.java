package fr.efrei.java;

import java.util.Scanner;

public class Programmeur {
    String prenom;
    String nom;
    String langagePrefere;
    double salaire;

    public Programmeur(String prenom, String nom, String langagePrefere, double salaire) {
        this.prenom = prenom;
        this.nom = nom;
        this.langagePrefere = langagePrefere;
        this.salaire = salaire;
    }

    public Programmeur() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez votre langage prefere : ");
        String langagePrefere = scanner.nextLine();
        System.out.print("Entrez votre salaire : ");
        int salaire = scanner.nextInt();

        this.prenom = prenom;
        this.nom = nom;
        this.langagePrefere = langagePrefere;
        this.salaire = salaire;
    }

    public void afficherProgrammeur(){
        System.out.println("Prénom : "+this.prenom);
        System.out.println("Nom : "+this.nom);
        System.out.println("Langage : "+this.langagePrefere);
        System.out.println("Salaire : "+this.salaire);
    }

    public void augmenterSalaire(int pourcentage){
        this.salaire = (this.salaire/100)*(100+pourcentage);
    }
}
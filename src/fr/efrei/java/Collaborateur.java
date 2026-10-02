package fr.efrei.java;

import java.util.Scanner;

public class Collaborateur implements Formateur {
    private final String prenom;
    private final String nom;
    private String langagePrefere;
    private double salaire;
    private Adresse adresse;

    public Collaborateur(String prenom, String nom, String langagePrefere, double salaire, Adresse adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.langagePrefere = langagePrefere;
        this.salaire = salaire;
        this.adresse = adresse;
    }

    public void setSalaire(double salaire) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Entrez votre salaire : ");
            if (scanner.hasNextDouble()) {
                this.salaire = scanner.nextDouble();
                scanner.nextLine();

                if (salaire >= 0) {
                    break;
                }

                System.out.println("Le salaire ne peut pas être négatif.");
            } else {
                System.out.println("Veuillez saisir un nombre.");
                scanner.nextLine();
            }
        }
        this.salaire = salaire;
    }

    public void setLangagePrefere(String langagePrefere) {this.langagePrefere = langagePrefere;}
    public void setAdresse() {this.adresse.setAdresse();}

    public String getPrenom() {return prenom;}
    public String getNom() {return nom;}
    public Double getSalaire() {return salaire;}
    public String getLangagePrefere() {return langagePrefere;}

    public void afficherCollaborateur(){
        System.out.println("Prénom : "+this.prenom);
        System.out.println("Nom : "+this.nom);
        System.out.println("Langage : "+this.langagePrefere);
        System.out.println("Salaire : "+this.salaire);
    }

    public void augmenterSalaire(double pourcentage) {
        if (pourcentage < 0) {
            System.out.println("L'augmentation doit etre supérieur a 0");
        } else {
            this.salaire = salaire * (1 + pourcentage / 100);
        }
    }

    public void travailler(){
        System.out.println("Je travaille");
    }

    @Override
    public void former() {
    }
}

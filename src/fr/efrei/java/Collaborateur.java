package fr.efrei.java;

import java.util.Scanner;

public abstract class Collaborateur implements Formateur {
    private static int compteurid = 0;
    private final String id;
    private final String prenom;
    private final String nom;
    private String langagePrefere;
    private double salaire;
    private Adresse adresse;

    public Collaborateur(String prenom, String nom, String langagePrefere, double salaire, Adresse adresse) {
        this.id = "C"+compteurid;
        this.prenom = prenom;
        this.nom = nom;
        this.langagePrefere = langagePrefere;
        this.salaire = salaire;
        this.adresse = adresse;

        compteurid=compteurid+1;
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
    public String getId() {return id;}

    public void afficherCollaborateur(){
        System.out.print("ID : "+id);
        System.out.print(" Prénom : "+this.prenom);
        System.out.print(" Nom : "+this.nom);
        System.out.print(" Langage : "+this.langagePrefere);
        System.out.println(" Salaire : "+this.salaire);
    }

    public void augmenterSalaire(double pourcentage) {
        if (pourcentage < 0) {
            System.out.println("L'augmentation doit etre supérieur a 0");
        } else {
            this.salaire = salaire * (1 + pourcentage / 100);
        }
    }

    public abstract void travailler();

    @Override
    public void former() {
    }
}

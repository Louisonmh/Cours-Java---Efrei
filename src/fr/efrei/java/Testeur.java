package fr.efrei.java;

import java.util.Scanner;

public class Testeur extends Collaborateur{

    public Testeur(String prenom, String nom, String langagePrefere, Double salaire,Adresse adresse) {
        super(prenom,nom,langagePrefere, salaire, adresse);
    }

    @Override
    public void travailler(){
        System.out.println(getPrenom()+" exécute une campagne de tests.");
    }
}

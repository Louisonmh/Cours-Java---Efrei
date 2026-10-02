package fr.efrei.java;

import java.util.Scanner;

public class Programmeur extends Collaborateur{

    public Programmeur(String prenom, String nom, String langagePrefere, Double salaire, Adresse adresse) {
        super(prenom,nom,langagePrefere,salaire,adresse);
    }

    @Override
    public void travailler(){
        System.out.println(getPrenom()+" développe une fonctionnalité");
    }
}
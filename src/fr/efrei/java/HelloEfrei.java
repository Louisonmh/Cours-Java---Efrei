package fr.efrei.java;

import java.util.*;

public class HelloEfrei {

    public static Collaborateur rechercherid(Set<Collaborateur> liste, String idrecherche) {
        for (Collaborateur c : liste) {
            if (c.getId().equals(idrecherche)) {
                return c;
            }
        }
        return null;
    }

    public static void affichage(){
        System.out.println("=====================================");
        System.out.println("    Gestion des Collaborateurs     ");
        System.out.println("=====================================");
        System.out.println("1- Afficher la liste collaborateur");
        System.out.println("2- Afficher un collaborateur par ID");
        System.out.println("3- Afficher les collaborateurs par nom");
        System.out.println("4- Afficher les collaborateurs selon un seuil de salaire");
        System.out.println("5- Ajouter collaborateur");
        System.out.println("0- Quitter");
        System.out.print("Entrez votre saisie : ");
    }

    public static void afficherIDCollaborateur(Set<Collaborateur> listeCollaborateur){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\nRentrer l'ID du Collaborateur rechercher");
        String idrecu = scanner.nextLine();
        Collaborateur collabID = rechercherid(listeCollaborateur, idrecu);
        if(null != collabID){
            collabID.afficherCollaborateur();
        }
        else{
            System.out.println("Le collaborateur n'existe pas");
        }
    }

    public static void afficherListeCollab(Set<Collaborateur> listeCollab){
        for (Collaborateur c : listeCollab) {
            c.afficherCollaborateur();
        }
    }

    public static Set<Collaborateur> recherchernom(Set<Collaborateur> liste, String recherche) {
        Set<Collaborateur> resultats = new HashSet<>();

        for (Collaborateur c : liste) {
            String nommin = c.getNom().toLowerCase();
            String recherchemin = recherche.toLowerCase().trim();
            if (nommin.contains(recherchemin)) {
                resultats.add(c);
            }
        }
        return resultats;
    }

    public static void AffichageSalaire(Set<Collaborateur> listeCollaborateur,Double seuil){
        for (Collaborateur c : listeCollaborateur) {
            if(c.getSalaire()>=seuil){
                c.afficherCollaborateur();
            }
        }
    }

    public static void main(String[] args){
        Set<Collaborateur> listeCollaborateur = new HashSet<>();

        Adresse addAlice = new Adresse("avenue de l'aurore",44300,"Nantes","France");
        Adresse addAlex = new Adresse("rue du Jura", 75013, "Paris","France");
        Adresse addBob = new Adresse("rue de la République", 69002, "Lyon", "France");
        Adresse addEmma = new Adresse("boulevard Victor Hugo", 33000, "Bordeaux", "France");

        Collaborateur alice = new Programmeur("Alice", "Martin", "Java", 4000.0,addAlice);
        Collaborateur alex = new Testeur("Alex", "Dupont", "Java", 3000.0,addAlex);
        Collaborateur bob = new Programmeur("Bob", "Lefebvre", "Python", 4200.0, addBob);
        Collaborateur emma = new Testeur("Emma", "Dubois", "Selenium", 3800.0, addEmma);

        listeCollaborateur.add(alice);
        listeCollaborateur.add(alex);
        listeCollaborateur.add(bob);
        listeCollaborateur.add(emma);


        int cpt = 20;
        Scanner scanners = new Scanner(System.in);
        while(cpt!=0) {
            affichage();
            cpt = scanners.nextInt();
            if(cpt==1){
                afficherListeCollab(listeCollaborateur);
            }
            if(cpt==2){
                afficherIDCollaborateur(listeCollaborateur);
            }
            if(cpt==3){
                System.out.println("Entrer le nom rechercher");
                scanners.nextLine();
                String rechercher = scanners.nextLine();
                afficherListeCollab(recherchernom(listeCollaborateur,rechercher));
            }
            if(cpt==4){
                System.out.println("Entrer le seuil");
                Double seuil=scanners.nextDouble();
                AffichageSalaire(listeCollaborateur,seuil);
            }
            if(cpt==5){
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
                    scanner.nextLine();
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
        }
        for (Collaborateur collaborateur : listeCollaborateur) {
            collaborateur.travailler();
        }

        scanners.close();
        alice.augmenterSalaire(5);
        alice.afficherCollaborateur();
    }
}
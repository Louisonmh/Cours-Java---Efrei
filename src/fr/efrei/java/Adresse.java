package fr.efrei.java;

import java.util.Scanner;

public class Adresse {
    private String rue;
    private Integer code_postal;
    private String ville;
    private String pays;

    public Adresse(String rue, Integer code_postal, String ville, String pays) {
        this.rue = rue;
        this.code_postal = code_postal;
        this.ville = ville;
        this.pays = pays;
    }

    public void setAdresse(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre rue : ");
        String rue = scanner.nextLine();
        System.out.print("Entrez votre code postal : ");
        int code_postal = scanner.nextInt();
        System.out.print("Entrez votre ville : ");
        String ville = scanner.nextLine();
        System.out.print("Entrez votre pays : ");
        String pays = scanner.nextLine();
        this.rue = rue;
        this.code_postal = code_postal;
        this.ville = ville;
        this.pays = pays;
    }

    public String getRue() {return rue;}
    public Integer getCode_postal() {return code_postal;}
    public String getVille() {return ville;}
    public String getPays() {return pays;}

    public void afficher() {
        System.out.println(rue);
        System.out.println(code_postal + " " + ville);
        System.out.println(pays);
    }
}

package Entities.Exo1;

public class Captage implements Comparable
{
    private int idCaptage;
    private String nom;
    private int hauteur;
    private int debitMax;


    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public String getDescription(){
        return this.getNom()+" - "+this.getHauteur()+" mètres - "+this.getDebitMax()+" litres";
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    protected String getNom() {
        return nom;
    }

    protected int getHauteur() {
        return hauteur;
    }

    protected int getDebitMax() {
        return debitMax;
    }
}

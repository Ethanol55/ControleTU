package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
private int largeur;
private int longueur;

    public Cuve(int idCaptage, String nom, int hauteur, int debitMax, int largeur, int longueur) {
        super(idCaptage, nom, hauteur, debitMax);
        this.largeur = largeur;
        this.longueur = longueur;
    }
    public double getVolume(){
        return this.largeur*this.longueur;
    }
    public String getDescription(){
        return this.getNom()+" - "+this.getHauteur()+" mètres - "+this.getDebitMax()+" litres - longueur"+this.longueur+" - largeur "+this.largeur;
    }

}

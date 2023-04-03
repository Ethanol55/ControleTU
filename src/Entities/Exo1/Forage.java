package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private int diametre;

    public Forage(int idCaptage, String nom, int hauteur, int debitMax, int diametre) {
        super(idCaptage, nom, hauteur, debitMax);
        this.diametre = diametre;
    }
    public double getVolume(){
        return Math.PI*this.diametre*this.getHauteur();
    }
    public String getDescription(){
        return this.getNom()+" - "+this.getHauteur()+" mètres - "+this.getDebitMax()+" litres - diamètre"+this.diametre;
    }
}

package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        // A compléter ici
        int i = 0;
        for (Participant unParticipant:this.lesParticipants) {
            if (unParticipant.isEstPresent()){
                i++;
            }
        }

        return i;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        // A compléter ici
        double montantTotal = 0;
        for (Participant unParticipant:this.lesParticipants) {
            if (unParticipant.isEstPresent()){
                montantTotal = montantTotal+unParticipant.getNbKm()*1.89;
            }
        }
        return montantTotal;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        // A compléter ici
        int present = 0;
        int inscrit = lesParticipants.size();
        for (Participant unParticipant:this.lesParticipants) {
            if (unParticipant.isEstPresent()){
                present++;
            }
        }
        return present*100/inscrit;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        // A compléter ici
        double montantARembourser = 0;
        int montantRecu = 0;//this.prixFormation*this.lesParticipants.size();
        for (Participant unParticipant:this.lesParticipants) {
            if (unParticipant.isEstPresent()){
                montantARembourser = montantARembourser+unParticipant.getNbKm()*1.89;
                montantRecu = montantRecu+this.prixFormation;
            }
        }
        return montantRecu-montantARembourser;
    }
}

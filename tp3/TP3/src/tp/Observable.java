package tp;

import java.util.LinkedList;
import java.util.List;

public class Observable {
	 // Liste des observateurs
    private List<Observer> listeObservateurs = new LinkedList<Observer>();
    
    /**
     * Ajouter un observateur de la liste
     * @param pObservateur
     */
    public void ajouterObs(Observer pObservateur) {
        listeObservateurs.add(pObservateur);
    }
    
    /**
     * Supprimer un observateur de la liste
     * @param pObservateur
     */
    public void supprimerObs(Observer pObservateur) {
        listeObservateurs.remove(pObservateur);
    }
    
    /**
     * Notifier à tous les observateurs de la liste
     * que l'objet à été mis à jour.
     */
    protected void notifier() {
        for(Observer lObservateur : listeObservateurs) {
            lObservateur.miseAJour();
        }
    }
    
    /* Partie gestion des valeurs */
    Modele modele = new Modele();
    
    boolean changement = false;
        
    /**
     * Modifie une valeur de l'objet 
     * et notifie la nouvelle valeur
     * @param pValeur
     */
    public void setValeur(Modele pModele) {
        modele = pModele;
        hasChanged();
        notifier();
    }
    
    
    
    /**
     * Retourne la valeur de l'objet
     * @return La valeur
     */
    public Modele getValeur() {
        return modele;
    }
    
    public void hasChanged(){
    	this.changement = true;
    }
}

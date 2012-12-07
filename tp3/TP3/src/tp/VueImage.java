package tp;

public class VueImage implements Observer {
    private Modele modele = new Modele();
    private Observable observe;
    
    /**
     * Fixe l'objet observé
     * @param pObserve
     */
    public void setObserve(Observable pObserve) {
        observe = pObserve;
    }
    
    /**
     * Méthode appelée par l'objet observé
     * pour notifier une mise à jour
     */
    public void miseAJour() {
        modele = observe.getValeur();
    }

    /* POUR CETTE PARTIE: ENCORE DES MODIF A FAIRE!!!*/
    /**
     * Affiche la valeur 
     */
    public void afficher() {
        System.out.println("VueImage contient " + modele);
    }
}

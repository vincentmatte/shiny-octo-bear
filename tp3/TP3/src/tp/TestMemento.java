package tp;

public class TestMemento {
	
	public static void test(){
		PileMemento pileMemento = new PileMemento();
		CreateurMemento createurMemento = new CreateurMemento();
	
		
		//Ajout des attribut du memento
		createurMemento.nouveauMemento(100, 15, 50);
		
		//Ajout de l'�tat 
		pileMemento.ajouterMemento(createurMemento.sauverDansMemento());
		
		//Nouveau Memento
		createurMemento.nouveauMemento(75, 15, 50);
		
		//Recup�tation du premier memento (index 0)
		Memento vieuxMemento = pileMemento.getMemento(0);
		
		//Ajouter le vieuxMemento comme Memento actuel
		createurMemento.restaurerDepuisMemento(vieuxMemento);
		
		GestionnaireSauvegarde save = new GestionnaireSauvegarde();
		
		save.Sauvegarde(vieuxMemento, "test");
	}
}

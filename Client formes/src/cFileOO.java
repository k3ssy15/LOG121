

public class cFileOO {
	private final int LIMIT_FORMES = 10;
	private cNoeuds M_Debut  = null;
	private int M_Limit = 0;
	
	public cFileOO(){
		//Constructeur de la file FiFo
		M_Debut = null;
		M_Limit = LIMIT_FORMES;
		
	}
	public void setLimit(int _limit){
	//Ascesseur qui permet de modifier la limite de la file
		if(_limit > 0){
			M_Limit = _limit;
		}
	}
	public int getLimit(){
	//Ascesseur qui permet de recevoir la nombre maxime de noeuds dans la file
		return M_Limit;
	}
	public void addForme( cFormes _formes){
	//Procedure permettant l'ajout d'un noeud qui contiendra la classe cForme
		cNoeuds searchNoeud = null;
		cNoeuds addNoeud = new cNoeuds(_formes);
		int nbNextNoeuds = 0;
		
		if( M_Debut == null ){
			//Si la file est vide
			M_Debut = addNoeud;
		}else{
			//Ajouter le nouveau noeud à la fin
			nbNextNoeuds = countNoeuds();
			if( nbNextNoeuds >= M_Limit ){
				//Si le nombre de noeuds va excéder le nombre maximale. On doit retirer le premier noeud
				nbNextNoeuds--;
				removeForme();
			}
			searchNoeud = M_Debut;
			for( int pos = 0; pos < nbNextNoeuds-1;pos++ ){
				searchNoeud = searchNoeud.getSuivant();
			}
			searchNoeud.setSuivant(addNoeud);
		}
	}
	private int countNoeuds(){
	//Fonction retournant le nombre de noeuds existant dans la file
		int nbNoeuds = 0;
		if( M_Debut != null){
			cNoeuds tempoNoeuds = M_Debut;
			nbNoeuds++;
			while (tempoNoeuds.getSuivant() != null) {
				nbNoeuds++;
				tempoNoeuds = tempoNoeuds.getSuivant();
			}
		}
		
		
		return nbNoeuds;
	}
	private void removeForme(){
	//Procédure qui permet d'enlever le premier noeud
		cNoeuds remNoeuds = M_Debut;
		M_Debut = M_Debut.getSuivant();
		remNoeuds.setSuivant(null);
		System.gc();
		
	}
	public cFormes getDebut(){
	//Obtenir la forme du premier noeud
		return M_Debut.getForme();
	}
	public cFormes getNoeudAt( int _pos ){
	//Obtenir la forme d'un noeud dans la file selon la position
		cNoeuds searchNoeud = M_Debut;
		int nbNoeuds = countNoeuds()-1;
		if(_pos > nbNoeuds){
			_pos = nbNoeuds;
		}
		for( int pos = 0; pos < _pos;pos++ ){
			searchNoeud = searchNoeud.getSuivant();
		}
		
		return searchNoeud.getForme();
	}
}

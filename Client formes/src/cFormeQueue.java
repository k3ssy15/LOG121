/**
 * Cette classe reprÃ©sente l'application dans son ensemble. 
 * @author Kevin Raymond-Lamoureux
 * @date 2016/01/12
 * ***********************************
 * Modifier le 17 Janvier
 */

public class cFormeQueue {
	private final int LIMIT_FORMES = 10;
	private cNoeuds M_Debut  = null;
	private int M_Limit = 0;
	
	/**
	* Constructeur
	* 
	*/
	public cFormeQueue(){

		M_Debut = null;
		M_Limit = LIMIT_FORMES;
		
	}
	/**
	 * Ascesseur
	 * @param _limit
	 */
	public void setLimit(int _limit){
		if(_limit > 0){
			M_Limit = _limit;
		}
	}
	/**
	 * Ascesseur
	 */
	public int getLimit(){

		return M_Limit;
	}
	/**
	 * Procedure permettant l'ajout d'un noeud qui contiendra la classe cForme
	 * @param _formes
	 */
	public void addForme( cFormes _formes){
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
	/**
	 * Fonction retournant le nombre de noeuds existant dans la file
	 */
	private int countNoeuds(){
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
	/**
	 * Procédure qui permet d'enlever le premier noeud
	 */
	private void removeForme(){
		cNoeuds remNoeuds = M_Debut;
		M_Debut = M_Debut.getSuivant();
		remNoeuds= null;
		System.gc();
		
	}
	/**
	 * Obtenir la forme du premier noeud
	 * @param 
	 */
	public cFormes getDebut(){
		return M_Debut.getForme();
	}
	/**
	 * Obtenir la forme d'un noeud dans la file selon la position
	 * @param _pos 
	 */
	public cFormes getNoeudAt( int _pos ){

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

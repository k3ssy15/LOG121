/**
 * Cette classe reprÃ©sente l'application dans son ensemble. 
 * @author Kevin Raymond-Lamoureux
 * @date 2016/01/12
 */

public class cNoeuds {
	private cFormes M_Container = null;
	private cNoeuds M_Suivant = null;
	/**
	 * Constructeur
	 */
	public cNoeuds( cFormes _formes){

		if( _formes != null ){
			M_Container = _formes;
			M_Suivant = null;
		}
	}
	/**
	 * Procédure permetant la file de modifier le noeud suivant
	 * @param _noeud
	 */
	public void setSuivant( cNoeuds _noeud ){
	/**
	 * 
	 * */
		if( _noeud != null ){
			M_Suivant = _noeud;
		}
	}
	/**
	 * Ascesseur
	 */
	public cNoeuds getSuivant(){

		return M_Suivant;
	}
	/**
	 * Ascesseur donnant le contenu du noeuds
	 */
	public cFormes getForme(){
		return M_Container;
	}
}

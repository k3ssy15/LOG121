
public class cNoeuds {
	private cFormes M_Container = null;
	private cNoeuds M_Suivant = null;
	
	public cNoeuds( cFormes _formes){
	//Constructeur de la forme cNoeuds
		if( _formes != null ){
			M_Container = _formes;
			M_Suivant = null;
		}
	}
	public void setSuivant( cNoeuds _noeud ){
	//Procédure permetant la file de modifier le noeud suivant
		if( _noeud != null ){
			M_Suivant = _noeud;
		}
		else{
			//
		}
	}
	public cNoeuds getSuivant(){
	//Fonction retournant le prochain noeuds
		return M_Suivant;
	}
	public cFormes getForme(){
	//Fonction retournant la forme du noeud
		return M_Container;
	}
}

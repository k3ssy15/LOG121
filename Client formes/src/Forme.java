import java.awt.Color;

public abstract class Forme {
	
	private int M_positionX;
	private int M_positionY;
	private int M_nseq;
	private Color M_couleur;

	
	public Forme(int positionX, int positionY, int nseq, Color couleur){
		this.M_positionX=positionX;
		this.M_positionY=positionY;
		this.M_nseq=nseq;
		this.M_couleur=couleur;
	}
	
	/**************
	 * ACCESSEUR
	 ************/
	
	public int getPositionX(){
		return M_positionX;
	}
	
	public int getPositionY(){
		return M_positionY;
	}
	
	public int getNseq(){
		return M_nseq;
	}
	
	public Color getCouleur(){
		return M_couleur;
	}
	
	/**************
	 * MUTATEUR
	 ************/
	
	public void setPositionX(int positionX){
		this.M_positionX=positionX;
	}
	
	public void setPositionY(int positionY){
		this.M_positionY=positionY;
	}
	
	public void setNseq(int nseq){
		this.M_nseq=nseq;
	}
	
	public void setCouleur(Color couleur){
		this.M_couleur=couleur;
	}
	

}


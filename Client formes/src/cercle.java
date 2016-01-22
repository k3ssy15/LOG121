import java.awt.Color;

public class cercle extends Forme{ 
	
	private int M_rayonH;
	private int M_rayonV;
	
	//Constructeur par copie d'attribut
	public cercle(int positionX, int positionY,int nseq, Color couleur, int rayonH, int rayonV ){
		super(positionX,positionY,nseq,couleur);
		this.M_rayonH=rayonH;
		this.M_rayonV=rayonV;
	}	
	
	public cercle(int positionX, int positionY,int nseq, Color couleur, int rayonH){
		super(positionX,positionY,nseq,couleur);
		this.M_rayonH=rayonH;
	}
			
		
	public int getRayonH(){
		return M_rayonH;
	}
	
	public int getrayonV(){
		return M_rayonV;
	}
	

}

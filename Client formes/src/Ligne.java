import java.awt.Color;

public class Ligne extends Forme{

	private int M_positionX2;
	private int M_positionY2;
	
		
		//Constructeur par copie d'attribut
		public Ligne(int positionX, int positionY,int nseq, Color couleur, int positionX2, int positionY2 ){
			super(positionX,positionY,nseq,couleur);
			this.M_positionX2=positionX2;
			this.M_positionY2=positionY2;
		}	
		
		public int getPositionX2(){
			return M_positionX2;
		}
		
		public int getPositionY2(){
			return M_positionY2;
		}
}

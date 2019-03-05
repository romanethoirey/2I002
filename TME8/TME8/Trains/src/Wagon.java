
public abstract class Wagon extends ElemTrain{
	
	protected int nbPorte;
	public Wagon(int num,String marque,int nbPorte){
		super(num,marque);
		this.nbPorte=nbPorte;
	}
	
	public String toString(){
		return "Wagon"+numeroserie+" "+marque;
	}
}

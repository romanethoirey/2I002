public class Roue {
	private int diametre;
	
	public Roue(int d){
		diametre=d;
	}
	
	public Roue(){
		diametre=60;
	}
	
	public String toString(){
		return "La taille de la roue est"+diametre+".";
	}

	public int getDiametre(){
		return diametre;	
	}
}

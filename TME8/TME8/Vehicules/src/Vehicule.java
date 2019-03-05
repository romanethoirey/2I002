public class Vehicule {
	protected double distance;
	public static int cpt=0;
	protected int id;
	
	public Vehicule(){
		this.distance=0;
		this.id=cpt;
		cpt++;
	}
	
	public String toString(){
		return "Véhicule "+this.id;
	}
}

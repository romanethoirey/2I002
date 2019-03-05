
public class Velo extends SansMoteur implements VehiculeARoue{
	private int nbVitesse;
	
	public Velo(int nbVitesse) {
		super();
		this.nbVitesse=nbVitesse;
	}
	public void rouler(double distance){
		this.distance+=distance;
	}
	
	public String toString(){
		return "Velo "+id+" avec "+nbVitesse+" vitesses";
	}
	
	public void transporter(String depart, String arrive){
		System.out.println("Velo "+id+" a roulé de "+depart+"à "+arrive);
	}
}

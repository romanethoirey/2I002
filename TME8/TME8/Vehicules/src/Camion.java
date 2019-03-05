
public class Camion extends AMoteur implements VehiculeARoue{

	private double volume;
	
	public Camion(double capacite, double volume) {
		super(capacite);
		this.volume=volume;
	}

	public void rouler(double distance){
		this.distance+=distance;
	}
	
	public void transporter(String materiaux,int km){
		System.out.println("le camion "+id+" a transporte "+materiaux+"sur "+km+" km");
	}
	
	public String toString(){
		return "Camion"+id+" possede un volume de "+volume+" litres";
	}
}
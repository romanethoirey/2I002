
public class WVoyageurs extends Wagon{
	private int nbPlaces;
	public WVoyageurs(int num,String marque,int nbPorte,int nbPlaces){
		super(num,marque,nbPorte);
		this.nbPlaces=nbPlaces;
	}
	
	public String toString(){
		return "Wagon Voyageurs"+numeroserie+" "+marque+ "avec "+nbPlaces+" places";
	}
}


public class WMarchandise extends Wagon {
	private double poids;
	public WMarchandise(int num,String marque,int nbPorte,double poids){
		super(num,marque,nbPorte);
		this.poids=poids;
		
	}
	
	public String toString(){
		return "Wagon Marchandise "+numeroserie+" "+marque+" qui porte"+poids+" kg";
	}
}
public class AMoteur extends Vehicule {
	
	protected double capaciteReservoir;
	protected int niveauEssence;
	
	public AMoteur(double capacite){
		super();
		this.capaciteReservoir=capacite;
		this.niveauEssence=0;
	}
	
	@Override
	public String toString(){
		return "Vehicule à moteur "+id+" avec"+capaciteReservoir+" litres et "+niveauEssence+" litres d'essence";
	}
	
	public void approvisionner(double nbLitres){
		niveauEssence+=nbLitres;
	}
	
	public boolean enPanne(){
		return (niveauEssence==0);
	}
}

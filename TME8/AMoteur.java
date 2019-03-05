public class AMoteur extends Vehicule {
	private int capaciteReservoir;
	private int niveauEssence;
	
	public AMoteur(int capacite){
		super();
		this.capaciteReservoir=capacite;
		this.niveauEssence=0;
	}
	
	@Override
	public String toString(){
		return "Vehicule à moteur "+id+" avec"+capaciteReservoir+" litres et "+niveauEssence+" litres d'essence";
	}
}

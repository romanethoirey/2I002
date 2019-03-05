
public class Reservoir {

	private Ingredient i;
	private double capacite;
	private double niveau;
	
	public Reservoir(Ingredient i,double capacite) {
		this.capacite=capacite;
		this.niveau=capacite;
		this.i=i;
	}
	
	public Ingredient getIngredient(){
		return i;
	}
	
	public void remplir(){
		niveau=capacite;
	}
	
	public void recuperer(double q) throws RecuperationIngredientException {
		
		if(Math.random()<0.0001){
			throw new RecuperationIngredientException("Défaillance dans le réservoir");
		}
		
		if(q<niveau)
			niveau-=q;
		else
			throw new RecuperationIngredientException("Quantité indisponible");
		
	}
	
	public double getNiveau(){
		return niveau;
	}

}

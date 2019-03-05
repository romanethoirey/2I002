
public class Robinet extends Reservoir{
	
	
	public Robinet(Ingredient i){
		super(i,Double.POSITIVE_INFINITY);
	}
	
	
	public void recuperer(double q) throws RecuperationIngredientException{
		if(Math.random()<0.005){
			throw new RecuperationIngredientException("Défaillance dans le robinet");
		}
	}
}

import java.util.ArrayList; 

public class Machine {

	private ArrayList<Recette> recettes;
	private ArrayList<Reservoir> reservoirs;
	private double credit;
	private int id;
	public static int cpt=0;
	
	
	public Machine() {
		id=cpt;
		cpt++;
		
		recettes = new ArrayList<Recette>();
		reservoirs = new ArrayList<Reservoir>();
	}
	
	public void ajouterReservoir(Reservoir r){
		reservoirs.add(r);
	}
	public void ajouterRecette(Recette r){
		recettes.add(r);
	}
	
	public void ajouterCredit(double d){
		credit=d;
	}
	
	public void rendreLaMonnaie(){
		credit=0;
	}
	
	public void remplir(){
		for(int i=0;i<reservoirs.size();i++){
			reservoirs.get(i).remplir();
		}
	}
	
	private Reservoir trouveReservoir(Ingredient i){
		for(int j=0;j<reservoirs.size();j++){
			if(reservoirs.get(j).getIngredient()==i){
				return reservoirs.get(j);
			}
		}
		return null;
	}
	
	public boolean checkup(){
		for(int i=0;i<recettes.size();i++){
			for(int j=0;j<recettes.get(i).getTabIngredient().length;i++){
				Reservoir r=trouveReservoir(recettes.get(i).getTabIngredient()[j]);
				if(r.getNiveau()<recettes.get(i).getQuantite()[j]){
					return false;
				}
				else{
					System.out.println(recettes.get(i).getNom()+"Ok");
				}
			}
		}
		return true;
	}

}

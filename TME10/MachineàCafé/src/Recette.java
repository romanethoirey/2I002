
public class Recette {
	
	private Ingredient[] tabingredient;
	private int[] quantite;
	private double prix;
	private String nom;

	public Recette(String nom, double prix, int tailleingrdient, int taillequantite) {
		this.nom=nom;
		this.prix=prix;
		tabingredient= new Ingredient[tailleingrdient];
		quantite= new int[taillequantite];
	}
	
	public String getNom(){
		return nom;
	}
	public double getPrix(){
		return prix;
	}
	public int[] getQuantite(){
		return quantite;
	}
	public Ingredient[] getTabIngredient(){
		return tabingredient;
	}

}

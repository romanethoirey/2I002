public class Machine {
	private String couleur;
	private Avant av;
	private Arriere ar;
	
	public Machine(String couleur, Avant av, Arriere ar){
		this.couleur=couleur;
		this.av=av;
		this.ar=ar;
	}
	
	public String toString(){
		return "La machine "+couleur+" avec sa partie avant composé de : "+av+" et sa partie arriere : "+ar; 
	}

	public void getCouleur(String couleur){
		this.couleur=couleur;
	}
}

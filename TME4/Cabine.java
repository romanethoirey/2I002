public class Cabine{
	private int volume;
	private String couleur;
	
	public Cabine(int vol, String coul){
		volume=vol;
		couleur=coul;
	}
	
	public String toString(){
		return "La cabine possède un volume de "+volume+"m³ et est: "+couleur;
	}
	
	public void setCouleur(String couleur){
		this.couleur=couleur;
	}
	
	public String getCouleur(){
		return couleur;
	}
}

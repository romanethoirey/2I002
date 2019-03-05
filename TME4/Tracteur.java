public class Tracteur {
	private Roue r1;
	private Roue r2;
	private Roue r3;
	private Roue r4;
	private Cabine c;
	
	public Tracteur(Roue r1, Roue r2, Roue r3, Roue r4, Cabine c){
		this.r1=r1;
		this.r2=r2;
		this.r3=r3;
		this.r4=r4;
		this.c=c;
	}	
	
	public String toString(){
		return "Le tracteur "+c.getCouleur()+" à des roues: "+r1.getDiametre()+" "+r2.getDiametre()+" "+r3.getDiametre()+" "+r4.getDiametre();
	}
	
	public void peindre(String couleur){
		c.setCouleur(couleur);	
	}
}

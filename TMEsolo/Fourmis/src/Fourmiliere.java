
public class Fourmiliere extends Element{
	private int nbFourmisMax;
	private int nbFourmisCrees;
	public Fourmiliere(Point p, int nbFourmisMax) {
		super(p,1);
		nbFourmisCrees=0;
		
	}
	
	public String toString(){
		return "Fourmiliere"+super.toString();
	}
	
	public void next(Monde m){
		
	}

}

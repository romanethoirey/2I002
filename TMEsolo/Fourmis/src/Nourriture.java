
public class Nourriture extends Element{

	public Nourriture(Point p) {
		super(p,(int)Math.random()*(12-1+1-1));
	}
	
	public void next(Monde m){
		
	}
	
	public String toString(){
		return "Nourriture :"+super.toString();
	}
}
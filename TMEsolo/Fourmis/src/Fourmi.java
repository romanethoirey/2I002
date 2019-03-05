
public class Fourmi {
	private Point position;
	private Point direction;
	private int id;
	public static int cpt =0;
	private Fourmiliere fourmiliere;
	private boolean possedeNourriture;
	
	public Fourmi(Fourmiliere f) {
		fourmiliere=f;
		id=cpt;
		cpt++;
		possedeNourriture=true;
		direction= new Point((int)Math.random()*(1-(-1)+1)-1,(int)Math.random()*(1-(-1)+1)-1);
	}
	
	public Point getPosition(){
		return position;
	}
	public int getX(){
		return position.x;
	}
	public int getY(){
		return position.y;
	}
	
	public String toString(){
		return "Fourmi "+id+" en ("+this.getX()+", "+this.getY()+")";
	}
	
	public void next(Lieu lieu){
		
	}
}

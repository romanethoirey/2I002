public class Vecteur {
	private double x;
	private double y;
	
	public Vecteur(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public Vecteur add(Vecteur v){
		return new Vecteur(x+v.x,y+v.y);
	}

	public String toString(){
		return ("x="+x+", y="+y);
	}

	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	public Vecteur rotation(double angle){
		return new Vecteur(x*Math.cos(angle)-y*Math.sin(angle),x*Math.sin(angle)+y*Math.cos(angle));
	} 
	
}

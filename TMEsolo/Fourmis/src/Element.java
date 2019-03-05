
public abstract class Element {
	private Point position;
	private int valeur;
	
	public Element(Point p,int val){
		position=p;
		valeur=val;
	}
	public Element(Point p){
		position = p;
		
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
	public int getValeur(){
		return valeur;
	}
	
	public void incrementer(){
		valeur++;
	}
	public void decrementer(){
		valeur--;
	}
	
	public String toString(){
		return "Valeur ="+valeur+"en ("+this.getX()+", "+this.getY()+")";
	}
	
	public abstract void next(Monde m);
	
}

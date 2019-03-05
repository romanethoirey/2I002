
public class Point {
	public final int x;
	public final int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public Point(){
		x=(int)Math.random()*(1-(-1)+1)-1;
		y=(int)Math.random()*(1-(-1)+1)-1;
	}
	
	public String toString(){
		return "("+x+", "+y+")";
	}
	
	public Point addition(Point p2){
		return new Point(p2.x+x,p2.y+this.y);
	}
	
	public Point soustraction(Point p2){
		return new Point(p2.x-this.x,p2.y-this.y);
	}
	
	public Point signe(){
		return new Point(Integer.signum(x),Integer.signum(y));
	}
	
	public boolean egale(Point p2){
		if ((p2.x==x)&&(p2.y==y)){
			return true;
		}
		else{
			return false;
		}
	}
	
}

// Q2.
// on peut les mettre en public car x et y sont finaux










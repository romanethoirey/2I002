public class Animal{
	private int x;
	private int y;
	private String type;
	
	public Animal(int x,int y, String type){
		this.x=x;
		this.y=y;
		this.type=type;
	}
	
	public int getX(){return x;}
	public int getY(){return y;}
	public String getType(){return type;}
	
	public double distance(Animal a){
		return (Math.abs(a.x-x)+Math.abs(a.y-y));
	}
	
	public void move(int i,int j){
		x=i;
		y=j;
	}
	public void move(Animal a){
		
	}
	
	public String toString(){
		return "Je suis un animal";
	}
}

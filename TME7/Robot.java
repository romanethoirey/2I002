public abstract class Robot {
	private double i;
	private double j;
	private int id;
	public static int cpt = 0;
	
	public Robot(double x, double y){
		i=x;
		j=y;
		id=cpt;
		cpt++;
	}
	
	protected void move(di,dj){
		i=di;
		j=dj;
	}
	
	public int getId(){
		return getId;
	}
	
	public int getI(){
		return i;
	}
	public int getJ(){
		return j;
	}
	
	public abstract void move(Monde m);
	
	public abstract void action (Monde m);
}

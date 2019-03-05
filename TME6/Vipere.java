public class Vipere extends Animal{
	public static int cpt=0;
	public int id=0;
	
	public Vipere(int x, int y){
		super(x,y,"v");
		id=cpt;
		cpt++;
	}
	
	public String toString(){
		return String.format("v%02d", id);
	}
	
	public void afficher(){
		System.out.println("Je suis la vipere "+id+" place ("+this.getX()+", "+this.getY()+")"); 
	}

}

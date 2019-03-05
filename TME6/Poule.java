public class Poule extends Animal{
	public static int cpt=0;
	public int id=0;
	
	public Poule(int x, int y){
		super(x,y,"p");
		id=cpt;
		cpt++;
	}
	
	public String toString(){
		return String.format("p%02d", id);
	}
	
	public void afficher(){
		System.out.println("Je suis la poule "+id+" place ("+this.getX()+", "+this.getY()+")"); 
	}

}

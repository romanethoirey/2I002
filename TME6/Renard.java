public class Renard extends Animal{
	public static int cpt=0;
	public int id=0;
	
	public Renard(int x, int y){
		super(x,y,"r");
		id=cpt;
		cpt++;
	}
	
	public String toString(){
		return String.format("r%02d", id);
	}
	
	public void afficher(){
		System.out.println("Je suis le renard "+id+" place ("+this.getX()+", "+this.getY()+")"); 
	}

}

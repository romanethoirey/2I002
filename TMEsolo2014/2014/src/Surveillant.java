public class Surveillant extends Personne {
	private int id;
	public static int cpt=0;
	public Surveillant(int x,int y ,Cours c) {
		super(x,y,c);
		id=cpt;
		cpt++;
	}
	
	public void agir(){
		
	}
	public String toString(){
		return String.format("s%02d", id);
	}
}
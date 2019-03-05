
public abstract class Enfant extends Personne {
	protected int id;
	public static int cpt = 0;
	public Enfant(int x,int y, Cours c) {
		super(x,y,c);
		id=cpt;
		cpt++;
	}
	public abstract void agir();
	
	public abstract boolean estMechant();
	
	public String toString(){
		return String.format("e%02d", id);
	}

}


public abstract class Personne {
	protected int x;
	protected int y;
	protected Cours c;
	protected boolean actif;
	public Personne(int x,int y, Cours c) {
		this.x=x;
		this.y=y;
		this.c=c;
		actif=true;
	}
	
	public boolean getActif(){
		return actif;
	}
	
	public abstract void agir();

}

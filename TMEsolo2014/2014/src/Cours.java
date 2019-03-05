import java.util.ArrayList;

public class Cours {
	private int taille;
	private int nbIteration;
	private ArrayList<Personne> p;
	private ArrayList<Personne> toilettes;
	private ArrayList<Personne> prison;
	private String c[][];

	public Cours (int taille,int nbIt){
		this.taille=taille;
		this.nbIteration=nbIt;
		p = new ArrayList<Personne>(); 
		toilettes = new ArrayList<Personne>();
		prison = new ArrayList<Personne>();
		c=new String [taille][taille];
	}
	
	public int getTaille(){
		return taille;
	}
	
	public int getNbIt(){
		return nbIteration;
	}
	
	public void addP(Personne p){
		this.p.add(p);
	}
	
	public void addToilettes(Personne p){
		this.p.add(p);
	}
	
	public void addPrison(Personne p){
		this.p.add(p);
	}
	
	public String getC(int x,int y){
		return c[x][y];
	}
	


}


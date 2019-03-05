public class Choix{
	private boolean[] tab;
	private int nbLibre;
	
	public Choix(int n){
		tab= new boolean[n];
		for(int i=0;i<n;i++){
			tab[i]=true;
		}	
	}
	
	public boolean estLibre(int n){
		return tab[n-1];
	}
	
	public int getNblibre(){
		int nb=0;
		for(int i=0;i<tab.length;i++){
			if tab[i]
				nb++;
		}
		return nb;
	}
	
	public String toString(){
		String chaine="";
		for(int i=0;i<tab.length;i++){
			chaine+=" "+tab[i];
		}
		return chaine;
	}
	
	public Choix clone(){
		boolean[] tab2 =new boolean[tab.length];
		for(int i=0;i<tab.length;i++){
			tab2[i]=tab[i];
		}
		Choix ch2 = new Choix(tab.length);
		ch2.tab=tab2;
		
		return ch2;
	}
	
	public void setLibre(int i){
		if(!(tab[i])){
			tab[i]=true;
			nbLibre++;
			}
	}
	
	public void setOccupe(int i){
		if(tab[i]){
		
		
		tab[i]=false;
	}
	
	public int getNext(int i){
		for(int i=0;i<tab.length;i++){
			if
		}
	}
}

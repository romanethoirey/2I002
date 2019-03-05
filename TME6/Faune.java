public class Faune {
	public static final int TAILLE = 10;
	public static final int NBANIMAUX = 21;
	public Animal tabfaune[];
	
	public Faune(int taillefaune){
		this.
		tabfaune = new Animal [taillefaune];
		int nbanimauxdiff=(int)taillefaune/3;
		
		for(int i=0;i<taillefaune;i++){
			if(i<nbanimauxdiff){
				tabfaune[i]= new Poule((int)(Math.random()*(TAILLE)-1),(int)(Math.random()*(TAILLE)-1)); 
			}
			else if(i<nbanimauxdiff*2) {
				tabfaune[i]= new Renard((int)(Math.random()*(TAILLE)-1),(int)(Math.random()*(TAILLE)-1)); 
			}
				
			else{
				tabfaune[i]= new Vipere((int)(Math.random()*(TAILLE)-1),(int)(Math.random()*(TAILLE)-1)); 
			}
		}
	}
	
	public Faune(){
		this(NBANIMAUX);
	}
	
	public String terrain(){
		String terr[][]=new String[TAILLE][TAILLE];
		for(int i=0;i<TAILLE;i++){
			for(int j=0;j<TAILLE;j++){
				terr[i][j]=" . ";
			}
		}
		
		for(int i=0;i<tabfaune.length;i++){
			terr[tabfaune[i].getX()][tabfaune[i].getY()]=tabfaune[i].toString();
		}
		
		String s="";
		for(int i=0;i<TAILLE;i++){
			s+=" _ ";
		}
		s+="\n";
		for(int i=0;i<TAILLE;i++){
			s+="|";
			for(int j=0;j<TAILLE;j++){
				s+=terr[i][j];
			}
			s+="\n|";
		}
		s+="\n";
		for(int i=0;i<TAILLE;i++){
			s+="_";
		}
		return s;
	}
}

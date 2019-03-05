public class Terrain {
	private Case[][] terrain;
	public final int taille=20;
	
	public Terrain(){
		terrain = new Case[taille][taille];
		for (int i=0;i<taille;i++){
			for(int j=0;j<taille;j++){
				terrain[i][j]=new Case();
				if(Math.random()<0.05){
					terrain[i][j].setMouton(new Mouton());
				}
			}
		}
	}	
	
	public String toString(){
		String chaine="";
		
		for(int i=0;i<3*taille+2;i++){
			chaine+="_";
		}
		chaine+="\n";
		for(int j=0; j<taille;j++){
			chaine+="|";
			for(int k=0;k<taille;k++){
				chaine+=terrain[j][k];
				
			}
			
			chaine+="|\n";
		}
		for(int i=0;i<3*taille+2;i++){
			chaine+="_";
		}
		
		return chaine;
	}
	
	public void update(){
		for(int i=0;i<taille;i++){
			for(int j=taille-2;j>=0;j--){
				if ((terrain[i][j+1].getMouton()==null)&&(terrain[i][j].getMouton()!=null)){
					if(Math.random()<0.2){
						terrain[i][j+1].setMouton(terrain[i][j].getMouton());
						terrain[i][j].setMouton(null);
					}
				}
			}
		}
	}
}

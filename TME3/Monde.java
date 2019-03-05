public class Monde {
	private int dimX, dimY, noGener;
	private boolean[][] tabCells;

	public Monde(int dimX, int dimY, double seuil){
		this.dimX=dimX;
		this.dimY=dimY;
		tabCells = new boolean[dimX][dimY];
		for(int i=0; i<dimX;i++){
			for(int j=0; j<dimY;j++){
				if(Math.random()<=seuil){
					tabCells[i][j]=true;}
				else{ 	
					tabCells[i][j]=false;}
			}
		}
	}

	public Monde(int dimx, int dimy, int x, int y, boolean[][] motif){
		this.dimX=dimX;
		this.dimY=dimY;	
		tabCells = new boolean[dimX][dimY];
		for(int i=0; i<dimX;i++){
			for(int j=0; j<dimY;j++){
				if(((i==x)&&(j==y))||((j<motif[0].length+y)&&(j>y))&&((x<motif.length+x)&&(i>x))){
					tabCells[i][j]=true;}
				else{ 	
					tabCells[i][j]=false;}
			}
		}
		
	}


	public String toString(){
		String chaine="Jeu de la vie, de dimension "+dimX+"x"+dimY+" à la génération : "+noGener+"\n";	
		for(int i=0; i<dimX;i++){
			for(int j=0; j<dimY;j++){
				if(tabCells[i][j])
					chaine+="*";
				else
					chaine+=".";
			}
		chaine+="\n";
		}
		return chaine;
	}
	
	public int nbVoisins(int nuLign, int nuCol){
		int compteur=0,j2,i2;
		for(int i=nuLign-1; i<=nuLign+1;i++){
			for(int j=nuCol-1;j<=nuCol+1;j++){
				i2 = (i+dimX)%dimX;
				j2 = (j+dimY)%dimY;
				if(tabCells[i2][j2]&&((i2!=nuLign)||(j2!=nuCol)))
					compteur++;
			}	
		}
		return compteur;			
	}

	public void genSuiv(){
		noGener++;
		boolean[][] tabTemps= new boolean [dimX][dimY];
		for(int i=0; i<dimX;i++){
			for(int j=0; j<dimY;j++){
				if((nbVoisins(i,j)<2)||(nbVoisins(i,j)>3)){
					tabTemps[i][j]=false;
				}
				else{
					tabTemps[i][j]=true;
				}
			}
		}
		for(int i=0; i<dimX;i++){
			for(int j=0; j<dimY;j++){
				tabCells[i][j]=tabTemps[i][j];
			}		

		}
	}	
}

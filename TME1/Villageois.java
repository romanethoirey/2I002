public class Villageois{
	private String nom;
	private double poids;
	private boolean malade;

	public Villageois(String nomVillageois){
		nom=nomVillageois;
		poids=Math.random()*100+50;
		if(Math.random()<0.20){malade=true;}
		else{malade=false;}
	}
	
	public String getNom(){
		return nom;
	}
	
	public double getPoids(){
		return poids;
	}

	public boolean getMalade(){
		return malade;
	}

	public String toString(){
		if(malade){return "villageois :"+nom+", "+poids+"kg, malade: oui";}
		else{return "villageois :"+nom+", "+poids+"kg, malade: non";}
	}

	public double poidsSouleve(){
		if(malade){return poids*0.25;}
		else{return poids*0.3;}
	}	
			
}






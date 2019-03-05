public class Mouton{
	public int id;
	public static int cpt=0;
	
	public Mouton(){
		id=cpt;
		cpt++;
	}
	
	public int getId(){
		return id;
	}
}

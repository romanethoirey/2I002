public class Case{
	private Mouton mouton;
	
	public Case(){
		mouton=null;
	}
	
	public Mouton getMouton(){
		return mouton;
	}	
	
	public void setMouton(Mouton m){
		mouton = m;
	}
	
	public String toString(){
		if (mouton==null){
			return "  .";
		}
		else {
			return String.format("%3d", mouton.getId());
		}
	}
}

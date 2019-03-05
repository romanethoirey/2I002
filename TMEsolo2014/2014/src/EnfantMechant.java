
public class EnfantMechant extends Enfant {

	public EnfantMechant(int x,int y, Cours c) {
		super(x,y,c);
	}
	
	public boolean estMechant(){
		return true;
	}
	
	public void agir(){
		x=(int)Math.random()*c.getTaille();
		y=(int)Math.random()*c.getTaille();
		if(c.getC(x,y)!=null){
			
		}
	}
}

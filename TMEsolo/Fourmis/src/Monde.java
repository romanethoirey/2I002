import java.util.ArrayList;

public class Monde {
	private ArrayList<Fourmi> listeFourmis;
	public static int TAILLE = 100;
	private Lieu[][] evironnement ;
	
	public Monde() {
		listeFourmis=new ArrayList<Fourmi>();
		evironnement= new Lieu[TAILLE][TAILLE];
	}
	
	public void addFourmi(Fourmi f){
		listeFourmis.add(f);
	}
	
	public ArrayList<Fourmi> getListeFourmis(){
		return listeFourmis;
	}
	
	public void afficher(){
		for(int i=0;i<listeFourmis.size();i++){
			System.out.println(listeFourmis.get(i));
		}
	}
	
	public void setElem(Element e){
		for(int i=0;i<TAILLE;i++){
			for(int j=0;j<TAILLE;j++){
				if(i==e.getX()&&j==e.getX()){
					evironnement[i][j].setElement(e);
				}
			}
		}
	}
	
	public Lieu getLieu(Point p){
		for(int i=0;i<TAILLE;i++){
			for(int j=0;j<TAILLE;j++){
				if(i==p.x&&j==p.y){
					return evironnement[i][j];
				}
			}
		}
		return null;
	}
	
	public void next(){
		for(int i=0;i<TAILLE;i++){
			for(int j=0;j<TAILLE;j++){
				evironnement[i][j].next(this);
				listeFourmis.get(i).next(evironnement[i][j]);
			}
			
		}
	}

}
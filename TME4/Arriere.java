public class Arriere {
	private PieceA p1;
	private PieceC p2;
	
	public Arriere(PieceA p1, PieceC p2){
		this.p1=p1;
		this.p2=p2;
	}

	public String toString(){
		return "il est constitué des 2 pieces: "+p1+" "+p2;
	}
}

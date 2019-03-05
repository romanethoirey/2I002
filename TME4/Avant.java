public class Avant{
	private PieceA p1;
	private PieceA p2;
	private PieceB p3;
	
	public Avant(PieceA p1,PieceA p2,PieceB p3){
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	
	public String toString(){
		return "il est constitué des 3 pieces: "+p1+" "+p2+" "+p3;
	}
}

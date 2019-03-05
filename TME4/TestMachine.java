public class TestMachine{
	public static void main (String [] args){
		PieceA p1 = new PieceA(105);
		PieceA p2 = new PieceA(512);
		PieceA p3 = new PieceA(307,"fer");
		PieceB p4 = new PieceB(655,60);
		PieceC p5 = new PieceC(909, true);
		
		Avant a1 = new Avant(p1,p2,p4);
		Arriere a2 = new Arriere(p3,p5);
		
		Machine m1 = new Machine("bleu",a1,a2);
		System.out.println(m1); 
		
		Machine m2 = m1;
		m2.getCouleur("voilet");
		System.out.println(m2);
		System.out.println(m1);
	}
}

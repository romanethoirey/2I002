public class TestTracteur {
	public static void main (String [] args){
		Roue r1 = new Roue(120);
		Roue r2 = r1;
		Roue r3 = new Roue();
		Roue r4 = r3;
		Cabine cab = new Cabine(500,"bleu");
		System.out.println(cab);
		
		Tracteur t1 = new Tracteur(r1,r2,r3,r4,cab);
		System.out.println(t1);
		
		Tracteur t2 = t1;
		Tracteur t3 = new Tracteur(r1,r2,r3,r4,cab);
		
		t2.peindre("vert");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);		 
	}
}

/*

t1 est vert apres affichage car t2 et t1 pointe vers la même case en mémoire. Pour qu'ils ne changent pas ensemble il faut que t1 et t2 ont des parametres avec des noms differents

*/

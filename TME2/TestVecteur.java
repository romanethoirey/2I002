public class TestVecteur {
	public static void main (String [] args){
		Vecteur v1 = new Vecteur(1,2);
		Vecteur v2 = new Vecteur(10,1);
		Vecteur v3 = new Vecteur(0,0);
		Vecteur v4 = new Vecteur(1,1); 
		Vecteur v5 = new Vecteur(0,1); 
		Vecteur v6=v1.add(v2);
		System.out.println(v6.toString());
		Vecteur v7=v1.add(v3);
		System.out.println(v7.toString());
		Vecteur v8=v5.rotation(Math.PI/2);
		System.out.println(v8.toString());//erreur de précision mais correcte
		Vecteur v9=v4.rotation(Math.PI/2);
		System.out.println(v9.toString());
	}
}

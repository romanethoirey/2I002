public class TestAnimal{
	public static void main (String[] args){
		Vipere vipere = new Vipere(0,0);
		Poule poule = new Poule(1,2);
		Renard renard = new Renard (3,3);
		
		vipere.afficher();
		poule.move(3,4);
		poule.afficher();
		double d1= renard.distance(vipere);
		System.out.println(d1);
		renard.afficher();
		System.out.println(vipere);
		Animal vipere1 = new Animal(1,0,"v");
		System.out.println(vipere1);
	}
}

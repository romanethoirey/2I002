public class TestVillageois {
	public static void main (String [] args){
		Villageois v1 = new Villageois ("Pierre");
		Villageois v2 = new Villageois ("Paul");
		Villageois v3 = new Villageois ("Jaques");	
		Villageois v4 = new Villageois ("Martine");	

		double rocher = 100;

		if(v1.poidsSouleve()+v2.poidsSouleve()+v3.poidsSouleve()+v4.poidsSouleve()>= rocher)
		{System.out.println("Les villageois ont réussis");}

		else
		{System.out.println("Il y a un ou plusieurs des villageois qui sont trop faibles pour soulever le rocher");}
	
	}
}

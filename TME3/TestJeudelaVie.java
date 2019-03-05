public class TestJeudelaVie {
	public static void main(String[] args){
		/*Monde terre = new Monde (10,10,0.2);
		System.out.print(terre);
		int v =terre.nbVoisins(5,5);
		System.out.println(v);
		terre.genSuiv();
		System.out.println(terre);
			
		Monde mars = new Monde(20,20,0.3);
		for(int i=0;i<5;i++){	
			System.out.print(mars);	
			mars.genSuiv();		
			try {Thread.sleep(2000);} // temporisation en ms      
 			catch(InterruptedException e){
    				e.printStackTrace();
 			}
		}*/
	Monde m = new Monde(20, 20, 3,5,new boolean[][]{{true,true},{true,true}});
	System.out.println(m);
	}	
	
}

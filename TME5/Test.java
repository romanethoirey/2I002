public class Test{
	public static void main (String[] args){
	
		Terrain t1 = new Terrain();
		System.out.println(t1);
		for(int i =0;i<10;i++){
			t1.update();
			System.out.println(t1);
			try{
				Thread.sleep(100); // 100 ms
  			}
  			catch(Exception e){
     					e.printStackTrace();
  			}
		}	
	}
}

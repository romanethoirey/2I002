public class Histo {
	private int[] hist;
	
	public Histo (){
		hist= new int[21];
		for(int i=0;i<hist.length;i++){
			hist[i]=0;
		}
	}
	
	public void ajoutNote(int note){
		hist[note]++;
	}
	
	public Histo(int[] tabNotes){
		this();
		for(int i=0;i<tabNotes.length;i++){
			ajoutNote(tabNotes[i]);
		}
	}
	
	public void afficheHistogrammeTableau(){
		System.out.print("[");
		for(int i=0;i<hist.length-1;i++){
			System.out.print(hist[i]+", ");
		}
		
		System.out.println(hist[hist.length-1]+"]");
	}
	
	public void afficheHistogramme(){
		
		for(int i=0;i<hist.length;i++){
			System.out.print(i+" |");
			for(int j=0;j<hist[i];j++){
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}

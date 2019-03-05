public class TestHisto {
	public static void main (String [] args){
		int[] note= new int [150];
		for(int i=0;i<note.length;i++){
			note[i]=(int)(Math.random()*21);
		}			
		Histo histoEtu = new Histo(note);
		histoEtu.afficheHistogrammeTableau();
		histoEtu.afficheHistogramme(); 
	}
}

import java.util.ArrayList;

public class TestLIFO {
	public static void main (String args[]){
		Liste listeobj = new ListeFILO();
		if (listeobj.isEmpty()){
			System.out.println("La liste est vide");}
		
		for(Integer i=0;i<9;i++){
			listeobj.push(i);
		}
		System.out.println(listeobj.size());
		listeobj.pop();
		System.out.println(listeobj.size());
		for(int i=0;i<listeobj.size();i++){
			listeobj.get(i);
		}
	}
}

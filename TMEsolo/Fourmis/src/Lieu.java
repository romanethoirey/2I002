
public class Lieu {
	private Element e;
	
	public Lieu() {
		e=null;
	}
	
	public Element getElement(){
		return e;
	}
	public void setElement(Element e){
		this.e=e;
	}
	
	public boolean isEmpty(){
		if(e==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void next(Monde m){
		if(e.getValeur()<=0){
			e=null;
		}
		else{
			this.next(m);
		}
	}

}

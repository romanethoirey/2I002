import java.util.ArrayList;

public abstract class Liste {
	protected ArrayList<Object> liste=new ArrayList<Object>();
	
	
	public boolean isEmpty(){
		return (liste.size()==0);	
	}
	public int size(){
		return liste.size();
	}
	public void push(Object o){
		liste.add(o);
	}
	public abstract Object pop();
	
	public Object get(int o){
		return liste.get(o);
	}
}

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class Polygone extends Figure{

	private ArrayList<Point> polygone;
	private boolean closed;
	
	public Polygone(Color couleur, boolean closed) {
		super(couleur);
		this.closed=closed;
		polygone = new ArrayList<Point>();
	}
	
	public void move (int deltaX, int deltaY){
		for(int i=0;i<polygone.size();i++){
			polygone.get(i).move(deltaX, deltaY);
		}
	}
	
	public void add(Point p){
		polygone.add(p);
	}
	
	 public void draw(Graphics g) {
	        // une ligne à ajouter ici pour dessiner de la bonne couleur
		 	g.setColor(getColor());
		 	for(int i=0;i<polygone.size()-1;i++){
		 		g.drawLine(polygone.get(i).getX(), polygone.get(i).getY(), polygone.get(i+1).getX(), polygone.get(i+1).getY());
		 	}
		 	if(closed){
		 		g.drawLine(polygone.get(polygone.size()-1).getX(), polygone.get(polygone.size()-1).getY(), polygone.get(0).getX(), polygone.get(0).getY());
		 	}
	        
	 }

}

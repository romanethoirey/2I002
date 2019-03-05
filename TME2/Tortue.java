import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;


public class Tortue {
	private Vecteur pos;
	private Vecteur dir;
	private boolean draw; //position levée ou baissée du stylo
	private Graphics g;

	public Tortue(Graphics g){
		pos = new Vecteur(0,0);
		dir = new Vecteur(1,0);
		draw = true;
		this.g=g;		
	}
	
	public void leverStylo(){
		draw = false;
	}
	public void baisserStylo(){
		draw = true;
	}
	public void rotation(double thetha){
		dir = dir.rotation(thetha);
	}	

	public void avance(int lg){
		int i;
		for(i=0;i<lg;i++){
			pos=pos.add(dir);
			if(draw)
				g.drawLine((int) pos.getX(),(int) pos.getY(), (int) pos.getX(), (int) pos.getY());
		}
	}
	
	
}

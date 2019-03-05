import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class GroupeDeFigure extends Figure{
	
	private ArrayList<Figure> figure;
	private int dim1;
	private int dim2;

	public GroupeDeFigure(int dim1, int dim2) {
		super(Color.black);
		this.dim1=dim1;
		this.dim2=dim2;
		figure = new ArrayList<Figure>();
	}
	
	public void add(Figure f){
		figure.add(f);
	}
	
	public Figure getFigure(int id){
		for(int i=0;i<figure.size();i++){
			if(figure.get(i).getId()==id){
				return  figure.get(i);
			}
		}
		return null;
	}
	
	public BufferedImage makeImage(){
		BufferedImage im = new BufferedImage(dim1, dim2, BufferedImage.TYPE_INT_ARGB);
		Graphics g = im.getGraphics();
		for(Figure f:figure){
			f.draw(g);
			
		}
		return im;
	}
	
	public void move(int deltaX,int deltaY){
		for(Figure f: figure){
			f.move(deltaX, deltaY);
		}
	}

}

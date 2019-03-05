import java.io.*;
import javax.imageio.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.image.BufferedImage;



public class TestFigure {

	public static void main(String[] args) {
		int dim1=400,dim2=400;
		GroupeDeFigure dessin = new GroupeDeFigure(dim1, dim2);

		Point f1=new Point(50,50);
		Point f2=new Point(100,50);
		Point f3=new Point(100,100);
		Point f4=new Point(50,100);
		
		Polygone f5=new Polygone(Color.pink,true);
		
		f5.add(f1);
		f5.add(f2);
		f5.add(f3);
		f5.add(f4);
		
		Point f6=new Point(100,100);
		Point f7=new Point(150,100);
		Point f8=new Point(100,150);
		
		Polygone f9=new Polygone(Color.green,true);
		
		f9.add(f6);
		f9.add(f7);
		f9.add(f8);
		
		
		Point p1=new Point(200,200);
		Point p2=new Point(200,220);
		Point p3=new Point(210,200);
		
		Polygone p4=new Polygone(Color.yellow,true);
		
		p4.add(p1);
		p4.add(p2);
		p4.add(p3);
		
		dessin.add(f5);
		f5.move(20,20);
		
		dessin.add(f9);
		
		dessin.add(p4);
		
		BufferedImage im = dessin.makeImage();

		String filename = "test.png";
		try {
		     ImageIO.write(im, "png", new File(filename));
		} catch (IOException e) {
		     e.printStackTrace();
		}

	}

}

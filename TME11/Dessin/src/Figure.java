// import nécessaires
import java.awt.Color;
import java.awt.Graphics ;

// Pour les couleurs de base:
//Color noir = Color.black; // récupération dans la classe Color
// toutes les couleurs de base existent:
//Color.red; Color.blue; // ...

// Graphics = pinceau pour le dessin
// Si vous disposez d'une variable Graphics g, vous pouvez faire les opérations suivantes
//g.setColor(Color.blue); // le pinceau dessinera en bleu
//g.drawLine(A.x, A.y, B.x, B.y); // trace la ligne de A à B
// pour plus de détails => cf javadoc





public abstract class Figure {

	private Color couleur;
	private int id;
	private static int cpt=0;
	
	public Figure(Color couleur) {
		this.couleur=couleur;
		id=cpt;
		cpt++;
	}
	
	public int getId(){return id;}
	
	public Color getColor(){return couleur;}
	
	public abstract void move(int deltaX, int deltaY);

	 public void draw(Graphics g){ // permet de choisir un pinceau de la bonne couleur avant le dessin
	        g.setColor(couleur);
	 }
}
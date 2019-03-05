
public class TestMiseEnPlace {

	public static void main(String[] args) {
		
		Monde m = new Monde();
		m.setElem(new Nourriture(new Point()));
		m.setElem(new Nourriture(new Point()));
		m.setElem(new Fourmiliere(new Point (),100));
		m.setElem(new Fourmiliere(new Point (),25));
		m.afficher();

	}

}

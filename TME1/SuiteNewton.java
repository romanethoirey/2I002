public class SuiteNewton {
	private double e;

	public SuiteNewton (double epsilon){
		e=epsilon;	
	}
	
	public double Suite(double x){
		double u0=x/2,ui,temp;
		do{
			ui=(u0+x/u0)/2;
			temp=u0;
			u0=ui;
		}while((ui-temp)>e);
	}
}




/*La suite de Newton définie ci-dessous converge vers la racine carrée de x :

U0=x=2  et Ui=(Ui¡1+x=Ui¡1)=2 

Écrire une classe SuiteNewton qui calcule la racine de x avec une précision de ² , en utilisant la suite de Newton. */

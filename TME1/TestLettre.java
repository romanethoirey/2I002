public class TestLettre{
	public static void main (String[] args){
		for(char i = 'a'; i<='z';i++){
			Lettre c = new Lettre(i);
			System.out.println(c.getCarac());
			System.out.println(c.getCodeAscii());
		}
		for(char i = 'a'; i<='z';i++){
			Lettre c = new Lettre(i);
			if(((int) i -'a')% 5 == 0){
				System.out.println();
			}
			System.out.print(c.getCarac()+"\t");
			
		}
	}
}




















/*Question 1 :

Dans la méthode main d'une classe TestLettre , écrire les instructions qui, pour chaque caractère de 'a' à 'z', affiche son code ascii (utiliser la méthode getCodeAscii() ).
Aide : utiliser une boucle for avec un compteur de type char .
Question 2 :

On veut maintenant afficher l'alphabet comme ceci :
a	b	c	d	e
f	g	h	i	j
k	l	m	n	o
p	q	r	s	t
u	v	w	x	y
z	 	 	 

Pour cela, il suffit de répéter l'affichage d'un caractère en passant à la ligne tous les cinq caractères. A la suite dans le main , en utilisant la méthode getCarac() de la classe Lettre, effectuer cet affichage.
Aide : utiliser l'opérateur qui affiche chaîne sans passer à la ligne (contrairement à System.out.println() ). */

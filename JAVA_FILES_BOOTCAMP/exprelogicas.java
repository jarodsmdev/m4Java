package javita;

public class exprelogicas {
	
	/*
	 *a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10))
La primera parte de la expresión ('A' > 'B') es falsa, ya que en el
* código ASCII 'A' tiene un valor menor que 'B'. La segunda parte (Largo('Hola mundo') = 10)
* es verdadera, ya que la longitud de la cadena 'Hola mundo' es 10. Por lo tanto, la expresión completa será verdadera (true).

b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3))
La expresión (5 + 2) < 7 es falsa, por lo que No((5 + 2) < 7) será verdadera (true).
* La expresión (7 > 9) es falsa, la expresión (3 < 5) es verdadera, y la expresión (4 = 3) es falsa.
*  Por lo tanto, (3 < 5) Y (4 = 3) será falsa. La expresión completa será verdadera (true) Y falsa (false), lo que resulta en falso (false).

c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20)
La expresión (2 * 3 + 5 -7) es igual a 4, y la expresión (2 * (2 + 5)) es igual a 14. La expresión ((10 - 5) < 20) es verdadera. Por lo tanto, ((2 * 3 + 5 -7) > (2 * (2 + 5))) será falsa, y la expresión completa será verdadera (true).
	 *
	 **/
	public static void main(String[] args) {
		boolean v1 = ('A' > 'B') || ("Hola mundo".length() == 10);
		boolean v2 = !((5 + 2) < 7) && !((7 > 9) || (3 < 5) && (4 == 3));
		boolean v3 = ((2 * 3 + 5 - 7) > (2 * (2 + 5))) || ((10 - 5) < 20);
		System.out.println("V1 es " + v1);
		System.out.println("V2 es " + v2);
		System.out.println("V3 es " + v3);
	}
	   
}

package m4ABP4;

import java.util.Scanner;

public class M4ABP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a) V1 = ((‘A’ > ‘B’) O (Largo(‘Hola mundo’) = 10)) V
		// b) V2 = No((5 + 2) < 7) Y No((7 > 9) O (3 < 5) Y (4 = 3)) V
		// c) V3 = ((2 * 3 + 5 -7) > (2 * (2 + 5)) O ((10 – 5) < 20) V

		Scanner scanner = new Scanner(System.in);

		int A = 0;
		int B = 0;
		String holaMundo = "Hola Mundo";

		System.out.println("Ingrese el valor de A");
		A = scanner.nextInt();

		System.out.println("Ingrese el valor de B");
		B = scanner.nextInt();

		boolean V1 = ((A > B) || ((holaMundo.length() == 10)));

		System.out.println("V1 es: " + V1);

		int dos = 2;
		int tres = 3;
		int cuatro = 4;
		int cinco = 5;
		int siete = 7;
		int nueve = 9;

		boolean V2 = !((cinco + dos) < siete) && !((siete > nueve) || (tres < cinco) && (cuatro == tres));
		System.out.println("V2 es: " + V2);

		int diez = 10;
		int veinte = 20;

		boolean V3 = ((dos * tres + cinco - siete) > (dos * (dos + cinco)) || ((diez - cinco) < veinte));

		System.out.println("V3 es: " + V3);
		scanner.close();
	}

}

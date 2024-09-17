package javita;

import java.util.Scanner;

public class dosifseguridad {
	public static void main(String[] args) {
		/*
		 * “Si un trabajador no cuida los procedimientos de seguridad, ocurrirá un
		 * accidente. Si el trabajador no lee el manual de seguridad interno sucedería
		 * lo mismo. El trabajador no ha sufrido incidentes. De ahí concluimos que ha
		 * seguido todos los procedimientos de seguridad, y ha leído el manual de
		 * seguridad interno”
		 */

		String respuesta;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Ingrese ¿ leyo manual si o no ? ");
			respuesta = sc.nextLine();

			if (respuesta.equals("si")) {
				System.out.println("Ingrese si ¿ realiza los procedimientos de seguridad? si o no");
				respuesta = sc.nextLine();
				if (respuesta.equals("si")) {
					System.out.println("Usted esta libre de accidentes");
				} else {
					System.out.println("usted se accidento o lo hara !");
				}
			} else {
				System.out.println("usted se accidento o lo hara !");
			}
			sc.close();

		} while (false);

	}
}

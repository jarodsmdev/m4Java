package m4_ABP1;

import java.util.Scanner;

public class ciaSeguros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DECLARAR VARIABLES
		String capturaDatos;
		int RUT;
		String Nombres;
		String Apellidos;
		int Telefono;
		String AFP;
		byte SistSalud;
		String Direccion;
		String Comuna;
		byte Edad;
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Ingrese RUT:");
		//RUT = Integer.parseInt(myObj.nextLine());
		capturaDatos = myObj.nextLine();
		//Validacion de RUT
		if (isNumeric(capturaDatos)) {
			RUT = Integer.parseInt(capturaDatos);
			System.out.println("El RUT es: " + RUT);
		}else {
			System.out.println("Rut no válido");
		}
		;
		
	}

	
	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		}catch (NumberFormatException nfe) {
			return false;
		}
	}

}

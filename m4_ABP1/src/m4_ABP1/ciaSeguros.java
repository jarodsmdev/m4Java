package m4_ABP1;

import java.util.Scanner;

public class ciaSeguros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DECLARAR GLOBALES
		String capturaDatos;
		int i;
		
		// Variables
		int RUT;
		String Nombres;
		String Apellidos;
		int Telefono;
		String AFP;
		byte SistSalud;
		String Direccion;
		String Comuna;
		byte Edad;
		
		// Instanciar la clase Scanner
		Scanner myObj = new Scanner(System.in);
		
		
		
		//Validacion de RUT (solo numeros, no vacío)
		System.out.println("Ingrese RUT:");
		capturaDatos = myObj.nextLine();
		if (isNumeric(capturaDatos)) {
			RUT = Integer.parseInt(capturaDatos);
			if (RUT < 99999999) {
				System.out.println("RUT: " + RUT);
			}else {
				System.out.println("El Rut ingresado es un número muy alto");				
			}
		}else {
			System.out.println("Rut ingresado no es válido");
			System.exit(0);
		}
		
		//Validar Nombres Obligatorio
		i = 0;
		do {
			System.out.println("["+ i +"]Ingrese su Nombre: ");
			Nombres = myObj.nextLine().trim();
			i++;
		} while (Nombres.length() == 0);
		System.out.println("Nombre: " + Nombres);	
		
		//Validar Apellidos Obligatorio
		i = 0;
		do {
			System.out.println("["+ i +"]Ingrese su apellido: ");
			Apellidos = myObj.nextLine().trim();
			i++;
		} while (Apellidos.length() == 0);
			System.out.println("Apellido: " + Apellidos);
				
		//Validar Teléfono no más de 15 carácteres
		do {
			System.out.println("Ingrese su número telefónico: ");
			capturaDatos = myObj.nextLine().trim();
			if (isNumeric(capturaDatos)) {
				Telefono = Integer.parseInt(capturaDatos);
				System.out.println("Teléfono: " + Telefono);
			}
				
			} while (capturaDatos.length() > 15);
			if(capturaDatos.length() >15) {
				System.out.println("No más de 15 dígitos");				
			}
		
		//validar afp obligatorio
		i = 0;
		do {
			System.out.println("[" + i + "]Ingrese AFP: ");
			capturaDatos = myObj.nextLine().trim();
			i++;
			if (capturaDatos.length()>0) {
				AFP = capturaDatos;
				
				System.out.println("AFP : " + AFP);
			}
		}while(capturaDatos.length()==0);
			
		//Validar Sistema salud 1 o 2
		i = 0;
		do {
			System.out.println("[" + i +"]Ingrese Sistema de Salud: ");
			if (isNumeric(capturaDatos)) {
				SistSalud = Byte.parseByte(capturaDatos);
			}
			//capturaDatos = myObj.nextLine().trim();
			i++;
			if (SistSalud == 1 || SistSalud == 2) {
			}else {
				System.out.println("Debe seleccionar 1 [Fonasa] o 2 [Isapre]");
				
			}
		}while(SistSalud != 1 || SistSalud != 2);
			
			
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

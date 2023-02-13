package modulo4;

import java.util.Scanner;    ///esto es para importar y siempre debe ir al comienzo, bajo el package///

public class Exercise1grupal {      ///el nombre de la clase///


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);   ///sc es la abreviatura de scanner///  ///se hace un nuevo scaneo///
		System.out.println("Ingrese su rut sin guion ni digito verificador:");  ///system.out para que se vea en la consola///
		int rut = sc.nextInt();  ///int (integer) porque son numeros///
		while (rut >= 99999999) {   ///mientras y la condicion///
			System.out.println("Por favor, ingrese un rut valido:");  ///si no se cumple lo primero, pasa al while y vuelve a aparecer en consola llamando al system.out/// ///println para imprimir una linea de texto en la pantalla///
			rut = sc.nextInt();  ///se llama al sc y nextint porque son numeros///
			
			
		}
			
		sc.nextLine();    ///para que siga su curso sin mostrar toda la informacion enseguida, si no, cuando se llame///
		
		System.out.println("Ingrese su nombre:");   
		String nombre = sc.nextLine();
		while (nombre.isEmpty()) {
			System.out.println("Por favor, ingrese su nombre:");
			nombre = sc.nextLine();
			
			}
		
		System.out.println("Ingrese su apellido");
		String apellido = sc.nextLine();
		while (apellido.isEmpty()) {
			System.out.println("Por favor, ingrese su apellido:");
			apellido = sc.nextLine();
			
		}
		
		System.out.println("Ingrese su numero telefonico:");
		String telefono = sc.nextLine();
		while (telefono.length() >15 ) {    ///cuenta los caracteres///
			System.out.println("Por favor, ingrese un numero telefonico valido:");
			telefono = sc.nextLine();
			
					
		}
		
		System.out.println("Ingrese su afp:");
		String afp = sc.nextLine();
		while (afp.isEmpty()) {
			System.out.println("Por favor, ingrese una afp valida:");
			afp = sc.nextLine();
						
			
		}
		
		System.out.println("Ingrese su sistema de salud, 1 para Fonasa o 2 para Isapre:");
		int sistsalud = sc.nextInt();
		String salud;
		while (sistsalud <1 || sistsalud >2) {
			System.out.println("Por favor, ingrese 1 para Fonasa o 2 para Isapre:");
			sistsalud = sc.nextInt();
			
			
		}
		if (sistsalud ==1) {      ///se usa if para una opcion///
			 salud ="fonasa"; 
		} else {                       ///se usa else para añadir algo más, como una segunda opcion///
			 salud="isapre";      /// en este caso es UNA de las 2 opciones, fonasa o isapre///
				 
			}
			
			
		
		sc.nextLine();
		
		System.out.println("Ingrese su direccion:");
		String direccion = sc.nextLine();
		while (direccion.length() >50 ) {
			System.out.println("Por favor, ingrese una direccion valida:");
			direccion = sc.nextLine();
		}
		
		System.out.println("Ingrese su comuna:");
		String comuna = sc.nextLine();
		while (comuna.isEmpty()) {
			System.out.println("Por favor, ingrese una comuna valida:");
			comuna = sc.nextLine();
			
		}
		
		System.out.println("Ingrese su edad:");
		int edad = sc.nextInt();
		while (edad >120) {
			System.out.println("Por favor, ingrese una edad valida:");
			edad = sc.nextInt();
		}
		
		System.out.println("Su nombre es " + nombre + ". Su apellido es " + apellido + ". Su rut es " + rut + ". Su telefono es " + telefono + ". Su afp es " + afp + ". Su sistema de salud es " + salud + ". Su direccion es " + direccion + ". En la comuna de " + comuna + ". Su edad es " + edad + "." );
	
		
		sc.close();
	    }
			
		}


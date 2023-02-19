package m4_ABP1;

import java.util.Scanner;
import java.lang.Math;

public class LogicExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Realiza un algoritmo que permita mostrar por la pantalla  la suma de los 20 primeros numeros naturales
//		int acumulador=0;
//		int contador = 1;
//		
//		while (contador <= 20) {
//			acumulador = acumulador + contador;
//			contador++;
//		}
//		System.out.println("Resultado es: " + acumulador );
		
//		// usando ciclo for
//		int suma = 0;
//		for (int i = 0; i < 21; i++) {
//			suma = suma + i;
//		};
//		System.out.println(suma);
		
		//Escriba un programa que reciba como entrada un número entero. El programa debe mostrar el resultado de la suma de los números al cuadrado desde el 1 hasta el valor ingresado.
		// Instanciar la clase Scanner
//		double resultado = 0;
//		int i = 0;
//		double d = 0;
		Scanner scanTerminal = new Scanner(System.in);
//		
//		System.out.println("Ingrese Número: ");
//		int numero = scanTerminal.nextInt();
//		System.out.println("Número ingresado: " + numero);
//		
//		while(i <= numero) {
//			d = Math.pow(i,2);
//			resultado = resultado + d;
//			System.out.println(i + " " + d);
//			i++;
//		};
//		System.out.println("La Suma de los números al cuadrado hasta el " + numero + " es: " + resultado);
//	}
	
	//Escriba un script que permita calcular el factorial del numero ingresado por terminal
	System.out.println("Ingrese un número: ");
	int numero = scanTerminal.nextInt();
	
	if(numero < 0) {
		System.out.println("No es posible calcular un factorial de cero.");
	}else {
		int i = 1;
		int resultado = 1;
		
		while(i <= numero) {
			resultado = resultado * i;
			i++;
		}
		System.out.println("El factorial de " + numero + ", es: " + resultado);
	}
	
}
}
package m4POOdiagnostico;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tablero = new Tablero();
		tablero.crearCarros();
		//tablero.mostrarPlano();
		tablero.menu();
		tablero.mostrarHuevo();
	}
	
	
}

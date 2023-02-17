package m4ABPRO4;
import java.util.Arrays; //para utilizar el array
import java.util.Scanner;
public class M4APBRO4 {
	//FILAS (100)/COLUMNAS (2)
	static String [][] usuarios = new String[100][10];
	static Scanner scanner = new Scanner(System.in);
	/*
	 *  0 String nombre
	 	1 String fechaNacimiento;
		2 String rut;
		3 String direccion;
		4 String telefono;
		5 String cantEmpleados;
		6 String experiencia;
		7 String departamento;
		8 String funcion;
		9 String nombresuperior;
	 */
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usuarios[0] = new String[]{"Juan", "01/01/1990", "12345678-9", "Calle 1 #123", "+56912345678", "10", "5 años", "Ventas", "Vendedor", "Pedro"};
		usuarios[1] = new String[]{"María", "02/02/1995", "98765432-1", "Calle 2 #456", "+56987654321", "5", "2 años", "Marketing", "Analista", "Sofía"};
		usuarios[2] = new String[]{"Pedro", "03/03/1985", "11111111-1", "Calle 3 #789", "+56911111111", "20", "10 años", "Finanzas", "Contador", "Carlos"};
		
		registrarUsuario(usuarios);
	}
	
	//Función para registrar Usuario
	public static void registrarUsuario(String[][]listadoUsuario) {
		
		String rut = "";
		int posicion;
		System.out.println("Favor ingrese RUT: ");
		rut = scanner.nextLine();
		if(existeRegistro(rut, listadoUsuario)) {
			//SI EXISTE USUARIO
			System.out.println("[ERROR]: Usuario ya Existe en la base de datos");
		}else {
			//NO EXISTE USUARIO
			posicion = posicionRegistroVacio(listadoUsuario);
			
		}
	}
	
	//Función que retorna true si existe un rut en el array
	public static boolean existeRegistro(String rut, String[][]listadoUsuario) {
		for(int i = 0; i < listadoUsuario.length ; i++) {
	        if(rut.equals(listadoUsuario[i][2])) {
	            return true;
	        }
	    }
	    return false;
	}
	
	//Función que encuentra la primera fila vacía enla columna RUT
	public static int posicionRegistroVacio(String[][]listadoUsuario) {
		int posicionVacio = 0;
		for(int i = 0; i < listadoUsuario.length; i++) {
			if(listadoUsuario[i][2] != null) {
				posicionVacio = i;
				break;
			}
		}
		return posicionVacio;
		
	}

}

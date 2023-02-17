package m4ABPRO4;
import java.util.Arrays; //para utilizar el array
import java.util.Scanner;
public class M4APBRO4 {
	//FILAS (100)/COLUMNAS (2)
	static String [][] usuarios = new String[100][10];
	static Scanner scanner = new Scanner(System.in);

//String nombre; 0
//String fechaNacimiento;
//String rut; 2
//String direccion;
//String telefono;
//String cantEmpleados;
//String experiencia;
//String departamento;
//String funcion;
//String nombresuperior;

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usuarios[0] = new String[]{"Juan", "01/01/1990", "12345678-9", "Calle 1 #123", "+56912345678", "10", "5 años", "Ventas", "Vendedor", "Pedro"};
		usuarios[1] = new String[]{"María", "02/02/1995", "98765432-1", "Calle 2 #456", "+56987654321", "5", "2 años", "Marketing", "Analista", "Sofía"};
		usuarios[2] = new String[]{"Pedro", "03/03/1985", "11111111-1", "Calle 3 #789", "+56911111111", "20", "10 años", "Finanzas", "Contador", "Carlos"};
		
		registrarUsuario(usuarios);
	}
	
	//Función para registrar Usuario
	public static void registrarUsuario(String[][]listadoUsuario) {
		String capturador = "";
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
			//PROCESO DE GUARDADO DE DATOS EN EL ARRAY
			//NOMBRE: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Nombre [OBLIGATORIO]");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][0] = capturador;
			
			//FECHA NACIMIENTO: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Fecha Nacimiento");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][1] = capturador;
			
			//DIRECCION: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Dirección  [OBLIGATORIO]");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][3] = capturador;
			
			//TELEFONO: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Teléfono  [OBLIGATORIO]");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][4] = capturador;
			
			//CANT EMPLEADOS: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Cantidad Empleados");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][5] = capturador;
			
			//EXPERIENCIA: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Experiencia en años");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][6] = capturador;
			
			//DEPARTAMENTO: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Departamento  [OBLIGATORIO]");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][7] = capturador;
			
			//FUNCION: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Función  [OBLIGATORIO]");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][8] = capturador;
			
			//NOMBRE SUPERIOR: PETICION Y GUARDADO
			System.out.println("Favor Ingrese Nombre Superior");
			capturador = scanner.nextLine();
			listadoUsuario[posicion][9] = capturador;
			
			
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

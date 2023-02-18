package m4ABPRO4;

import java.util.Arrays; //para utilizar el array
import java.util.Scanner;


public class M4APBRO4 {
	//FILAS (100)/COLUMNAS (2)
	static String [][] usuarios = new String[100][10];
	static Scanner scanner = new Scanner(System.in);
	static String regExNumerica = "^[0-9]+$"; //SÓLO ACEPTA CARACTERES NUMÉRICOS

	static String nombre;  //0
	static String fechaNacimiento; //1
	static String rut; //2
	static String direccion; //3
	static String telefono; //4
	static String cantEmpleados; //5
	static String experiencia; //6
	static String departamento; //7
	static String funcion; //8
	static String nombresuperior; //9


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS DE PRUEBA
		usuarios[0] = new String[]{"Juan", "01/01/1990", "12345678-9", "Calle 1 #123", "+56912345678", "10", "5 años", "Ventas", "Vendedor", "Pedro"};
		usuarios[1] = new String[]{"María", "02/02/1995", "98765432-1", "Calle 2 #456", "+56987654321", "5", "2 años", "Marketing", "Analista", "Sofía"};
		usuarios[2] = new String[]{"Pedro", "03/03/1985", "11111111-1", "Calle 3 #789", "+56911111111", "20", "10 años", "Finanzas", "Contador", "Carlos"};
		menuPerfilUsuario();
		//registrarUsuario(usuarios);
	}
	
	//REGISTRA USUARIO EN EL ARRAY
	public static void registrarUsuario(String[][]listadoUsuario) {
		//BUSCA EL SIGUIENTE ESPACIO DISPONIBLE EN EL ARRAY
		int posicion = posicionRegistroVacio(listadoUsuario);

		}
	
	//Función selección tipo de usuario
	public static void menuPerfilUsuario() {
		String capturador = "";
		do {
			//GUARDA RUT/NOMBRE/FECHA NACIMIENTO QUE ES TRANSVERSAL A TODOS LOS USUARIOS
			guardarDatosComunes();

			//MUESTRA MENÚ DE SELECCION EN CONSOLA
			System.out.println("[+] SELECCIONE EL PERFIL DE USUARIO A CREAR");
			System.out.println("\t1. CLIENTE");
			System.out.println("\t2. PROFESIONAL");
			System.out.println("\t3. ADMINISTRATIVO");
			
			//CAPTURA 1 2 ó 3 PARA EL INGRESO
			capturador = scanner.nextLine().trim();
			
			//SELECCIONA EL PERFIL DE USUARIO CON 1/2/3
			switch(capturador) {
			case "1":
				//INVOCA FUNCIÓN GUARDAR CLIENTE
				guardarCliente();
				break;
			case "2":
				//INVOCA FUNCIÓN GUARDAR PROFESIONAL
				guardarProfesional();
				break;
			case "3":
				//INVOCA FUNCIÓN GUARDAR ADMINISTRATIVO
				guardarAdministrativo();
				break;
			default:
				System.out.println("[ERROR] Opción ingresada No es válida.");
			}
		}while(!capturador.matches("^[1-3]$"));
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
	
	//FUNCION PERMITE ALMACENAR LOS DATOS COMUNES A TODOS LOS PERFILES
	public static void guardarDatosComunes() {
	String capturador = "";
		//RUT: PETICION Y VALIDACION
			do {
				System.out.println("[+] Favor ingrese RUT: [OBLIGATORIO]");
				capturador = scanner.nextLine().trim();
				if(capturador.length() == 0) {
					System.out.println("[ERROR] Debe ingresar RUT para continuar.");
				}else if(existeRegistro(capturador, usuarios)) {
					//SI EXISTE USUARIO (NO PUEDE CONTINUAR)
					System.out.println("[ERROR]: Usuario ya Existe en la base de datos");
				}else {
					//NO EXISTE USUARIO (PUEDE GUARDAR)
					//listadoUsuario[posicion][2] = rut;
					rut = capturador;
					//PROCESO DE GUARDADO DE DATOS EN EL ARRAY
				}
			}while(capturador.length() == 0 || existeRegistro(capturador, usuarios));
		
		//NOMBRE: PETICION Y GUARDADO
				do {
					System.out.println("[+] Favor Ingrese Nombre [OBLIGATORIO]");
					capturador = scanner.nextLine().trim();
					if(capturador.length()==0) {
						System.out.println("[ERROR] Nombre Obligatorio, favor reintente.");
					}else {
						//NOMBRE VALIDO -> GUARDAR
						//listadoUsuario[posicion][0] = capturador;
						nombre = capturador;
					}
				}while(capturador.length()==0);
				
		//FECHA NACIMIENTO: PETICION Y GUARDADO
		String regExFecha = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/((?:19|20)[0-9]{2}|18[0-9]{2})|\\b29\\/02\\/((?:19|20)(?:04|08|[2468][048]|[13579][26])|(?:2000))$";
				do {
					System.out.println("[+] Favor Ingrese Fecha Nacimiento [DD/MM/AAAA]");
					capturador = scanner.nextLine().trim();
					if(!capturador.matches(regExFecha)) {
						System.out.println("[ERROR] Ingrese una fecha válida.");
					}else {
						//FECHA VALIDA -> GUARDAR
						//listadoUsuario[posicion][1] = capturador;
						fechaNacimiento = capturador;
					}
				}while(!capturador.matches(regExFecha));
	}
	
	//ALMACENA LOS DATOS NECESARIOS PARA EL PERFIL CLIENTE
	public static void guardarCliente() {
	String capturador;
	//DIRECCION: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Dirección [OBLIGATORIO]");
			capturador = scanner.nextLine().trim();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Dirección No puede estar vacío, favor reintente.");
			}else {
				//DIRECCION VALIDA -> GUARDAR
				//listadoUsuario[posicion][3] = capturador;
				direccion = capturador;
			}
		}while(capturador.length() == 0);
		
	//TELEFONO: PETICION Y GUARDADO
		String regExTelefono = "^\\+?[0-9]{1,3}[-\\s]?\\(?\\d{3}\\)?[-\\s]?\\d{3}[-\\s]?\\d{4}$";
		do {
			System.out.println("[+] Favor Ingrese Teléfono  [OBLIGATORIO]");
			capturador = scanner.nextLine().trim();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Teléfono No puede estar vacío, favor reintente.");
			}else if(!capturador.matches(regExTelefono)){
				System.out.println("[ERROR] Formato ingresado no es válido favor reintente.");
			}else {
				//TELEFONO VALIDO -> GUARDAR
				//listadoUsuario[posicion][4] = capturador;
				telefono = capturador;
			}
		}while(capturador.length() == 0 || !capturador.matches(regExTelefono));
		
	//CANT EMPLEADOS: PETICION Y GUARDADO

		do {
			System.out.println("[+] Favor Ingrese Cantidad Empleados");
			capturador = scanner.nextLine().trim();
			if(!capturador.matches(regExNumerica)) {
				System.out.println("[ERROR] Sólo se permiten caracteres Numéricos.");
			}else {
				//CANTIDAD EMPLEADOS VALIDO -> GUARDAR
				//listadoUsuario[posicion][5] = capturador;
				cantEmpleados = capturador;
			}
		}while(!capturador.matches(regExNumerica));
		
	}
	
	//ALMACENA LOS DATOS NECESARIOS PARA EL PERFIL PROFESIONAL
	public static void guardarProfesional() {
	String capturador;
	//EXPERIENCIA: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Experiencia en años");
			capturador = scanner.nextLine().trim();
			if(!capturador.matches(regExNumerica)) {
				System.out.println("[ERROR] Sólo se permiten carácteres Numéricos.");
			}else {
				//EXPERIENCIA VALIDA -> GUARDAR
				//listadoUsuario[posicion][6] = capturador;	
				experiencia = capturador;
			}
		}while(!capturador.matches(regExNumerica));
		
	//DEPARTAMENTO: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Departamento [OBLIGATORIO]");
			capturador = scanner.nextLine();
			//DEPARTAMENTO VALIDADO -> GUARDAR
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Departamento No puede estar vacío, favor reintente.");
			}else {}
			//listadoUsuario[posicion][7] = capturador;
			departamento = capturador;
		}while(capturador.length() == 0);
	}
	
	//ALMACENA LOS DATOS NECESARIOS PARA EL PERFIL ADMINISTRATIVO
	public static void guardarAdministrativo() {
	String capturador;	
	//FUNCION: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Función [OBLIGATORIO]");
			capturador = scanner.nextLine();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Función no puede estar vacío, favor reintente");
			}else {
				//FUNCION VALIDADA -> GUARDAR
				//listadoUsuario[posicion][8] = capturador;
				funcion = capturador;
			}
		}while(capturador.length() == 0);
		
	//NOMBRE SUPERIOR: PETICION Y GUARDADO
		System.out.println("[+] Favor Ingrese Nombre Superior");
		capturador = scanner.nextLine().trim();
		//NOMBRE SUPERIOR -> GUARDAR
		//listadoUsuario[posicion][9] = capturador;
		nombresuperior = capturador;
	}
				
}

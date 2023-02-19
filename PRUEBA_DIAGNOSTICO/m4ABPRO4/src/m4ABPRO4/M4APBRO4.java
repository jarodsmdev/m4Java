package m4ABPRO4;

//import java.util.Arrays; //para utilizar el array
import java.util.Scanner;


public class M4APBRO4 {
	
	//MATRIZ
	static String [][] usuarios = new String[100][10];
	
	//OBJETO SCANNER
	static Scanner scanner = new Scanner(System.in);
	
	//EXPRESIONES REGULARES
	static String regExNumerica = "^[0-9]+$"; //SÓLO ACEPTA CARACTERES NUMÉRICOS
	static String RegExRut = "^\\d{1,8}-[0-9K]$"; //CAMBIAR A 6 EL 1 EN PRODUCCCION DEBUG****
	static String regExTelefono = "^\\+?[0-9]{1,3}[-\\s]?\\(?\\d{3}\\)?[-\\s]?\\d{3}[-\\s]?\\d{4}$";
	static String regExFecha = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/((?:19|20)[0-9]{2}|18[0-9]{2})|\\b29\\/02\\/((?:19|20)(?:04|08|[2468][048]|[13579][26])|(?:2000))$";
	
	//VARIABLES GLOBALES
	static int filaLibre;
	static boolean primerInicio = true;

//	static String nombre;  //0
//	static String fechaNacimiento; //1
//	static String rut; //2
//	static String direccion; //3
//	static String telefono; //4
//	static String cantEmpleados; //5
//	static String experiencia; //6
//	static String departamento; //7
//	static String funcion; //8
//	static String nombresuperior; //9


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS DE PRUEBA
		usuarios[0] = new String[]{"Juan", "01/01/1990", "12345678-9", "Calle 1 #123", "+56912345678", "10", "5 años", "Ventas", "Vendedor", "Pedro"};
		usuarios[1] = new String[]{"María", "02/02/1995", "98765432-1", "Calle 2 #456", "+56987654321", "5", "2 años", "Marketing", "Analista", "Sofía"};
		usuarios[2] = new String[]{"Pedro", "03/03/1985", "1-9", "Calle 3 #789", "+56911111111", "20", "10 años", "Finanzas", "Contador", "Carlos"};
		
		menuPrincipal();
		
	}
	
	//REGISTRA USUARIOS EN EL ARRAY OBLIGATORIO 1 DE CADA UNO, 3 USUARIOS EN TOTAL
	public static void registrarUsuario(String[][]listadoUsuario) {
		if(primerInicio) {
			System.out.println("[!] ¡SE HA DETECTADO QUE ESTE ES EL PRIMER INICIO!: DEBEMOS INICIAR CON 3 PEFILES DE USUARIOS PARA CONTINUAR");
			System.out.println("[!] PRIMER PERFIL DE USUARIO A CREAR DEBE SER TIPO CLIENTE\n");
			scanner.nextLine();
			filaLibre = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			guardarCliente();
			
			System.out.println("[!] SEGUNDO PERFIL DE USUARIO A CREAR DEBE SER DE TIPO PROFESIONAL");    		
			filaLibre = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			guardarProfesional();
			
			System.out.println("[!] TERCER PERFIL DE USUARIO A CREAR DEBE SER DE TIPO ADMINISTRATIVO");    		
			filaLibre = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			guardarAdministrativo();
			
			//CAMBIA LA VARIABLE PARA LA PROXIMA VEZ NO OBLIGUE EL INGRESO DE 3 USUARIOS
			primerInicio=false;
			
			//REGRESA AL MENU PRINCIPAL
			menuPrincipal();			
		}else {
			scanner.nextLine();
			filaLibre = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			menuPerfilUsuario();
			menuPrincipal();
		}
	}
	
	//AUTORA: PRISCILA CARRILLO
	public static void menuPrincipal() {
		int opcion = 0;
        
       	System.out.println("-------------------------------------------------------");
       	System.out.println("SISTEMA DE USUARIOS\n");
        System.out.println("[+] Por favor, seleccione una opción:\n");
        System.out.println("\t1. Registrar usuario");
        System.out.println("\t2. Mostrar usuarios");
        System.out.println("\t3. Contar usuarios por categoría");
        System.out.println("\t4. Modificar usuarios");
        System.out.println("\t5. Eliminar usuario");
        System.out.println("\t6. Salir");
        System.out.println("-------------------------------------------------------");
        
        //si se ingresa un número que no está en la lista, debe salir "Error" u "Opción inválida" en la consola//
        
        while(opcion != 6) {   //ciclo while hasta que seleccione la opcion 6//
        	
        opcion = scanner.nextInt();
        
	        switch(opcion) {     //Se usa switch para llamar a la función//
	            case 1:
	            	 System.out.println("Registrando usuario...presione Enter para continuar");
	            	registrarUsuario(usuarios);
	                break;
	            case 2:
	            	System.out.println("Mostrando usuarios...");
	                mostrarUsuarios(usuarios);
	                break;
	            case 3:
	                //contarUsuariosPorCategoria();
	                break;
	            case 4:
	                //modificarUsuario();
	                break;
	            case 5:
	            	eliminarUsuario();
	                break;
	            case 6:
	                System.out.println("Gracias, hasta pronto.");
	                System.exit(0);
	                break;
	            default:
	                System.out.println("[ERROR] Opción inválida. Por favor, seleccione una opción del menú de 1 - 6.");
	                break;            
	        }
        }
	}
	
	//MENÚ SELECCIÓN DE PERFIL
	public static void menuPerfilUsuario() {
		String capturador = "";
		do {

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
				guardarCliente();
				break;
			case "2":
				guardarProfesional();
				break;
			case "3":
				guardarAdministrativo();
				break;
			default:
				System.out.println("[ERROR] Opción ingresada No es válida.");
			}
		}while(!capturador.matches("^[1-3]$"));
	}
	
	//BUSCA EL RUT Y RETORNA TRUE O FALSE, RECIBE RUT COMO ARGUMENTO
	public static boolean existeRut(String rut, String[][]listadoUsuario) {
		for(int i = 0; i < listadoUsuario.length ; i++) {
	        if(rut.equalsIgnoreCase(listadoUsuario[i][2])) {
	            return true;
	        }
	    }
	    return false;
	}
	
	//RETORNA EL PRIMER REGISTRO VACÍO EN EL ARRAY
	public static int posicionRegistroVacio(String[][]listadoUsuario) {
		int posicionVacio = 0;
		for(int i = 0; i < listadoUsuario.length; i++) {
			if(listadoUsuario[i][2] == null || listadoUsuario[i][2].isEmpty()) {
				posicionVacio = i;
				break;
			}else {
				posicionVacio = -1;
			}
		}
		//System.out.println("HE ENCONTRADO LA POSICION " + posicionVacio + " DEL ARRAY DISPONIBLE"); //DEBUG***
		return posicionVacio;
	}
	
	//FUNCION PERMITE ALMACENAR LOS DATOS COMUNES A TODOS LOS PERFILES
	public static void guardarDatosComunes(String[][]usuarios) {
		String capturador = "";
		//RUT: PETICION Y VALIDACION
			do {
				System.out.println("[+] Favor ingrese RUT: [OBLIGATORIO]");
				capturador = scanner.nextLine();
				
				if(capturador.length() == 0) {
				}else if(!capturador.matches(RegExRut)) {
					System.out.println("[ERROR] Formato ingresado no es válido, sólo se permiten dígitos de 6 a 8 un guión y dígito verificador");
				}else if(existeRut(capturador, usuarios)) {
					//EXISTE USUARIO NO PUEDE CONTINUAR
					System.out.println("[ERROR]: RUT ingresado ya existe en la base de datos");
				}else {
					//NO EXISTE USUARIO PUEDE GUARDAR
					//PROCESO DE GUARDADO DE DATOS EN EL ARRAY
					usuarios[filaLibre][2] = capturador;
				}
			}while(capturador.length() == 0
					|| !capturador.matches(RegExRut)
					|| (existeRut(capturador, usuarios) && usuarios[filaLibre][2] != capturador)
					);
			
		//NOMBRE: PETICION Y GUARDADO
				do {
					System.out.println("[+] Favor Ingrese Nombre : [OBLIGATORIO]");
					capturador = scanner.nextLine().trim();
					
					if(capturador.length()==0) {
						System.out.println("[ERROR] Nombre Obligatorio, favor reintente.");
					}else {
						//NOMBRE VÁLIDO -> GUARDAR
						usuarios[filaLibre][0] = capturador;
					}
				}while(capturador.length()==0);
				
		//FECHA NACIMIENTO: PETICION Y GUARDADO
				do {
					System.out.println("[+] Favor Ingrese Fecha Nacimiento : [DD/MM/AAAA]");
					capturador = scanner.nextLine().trim();
					if(!capturador.matches(regExFecha)) {
						System.out.println("[ERROR] Ingrese una fecha válida.");
					}else {
						//FECHA VÁLIDA -> GUARDAR
						usuarios[filaLibre][1] = capturador;
					}
				}while(!capturador.matches(regExFecha));
	}
	
	//ALMACENA LOS DATOS NECESARIOS PARA EL PERFIL CLIENTE
	public static void guardarCliente() {
	String capturador;
	//DIRECCION: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Dirección : [OBLIGATORIO]");
			capturador = scanner.nextLine().trim();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Dirección No puede estar vacío, favor reintente.");
			}else {
				//DIRECCION VALIDA -> GUARDAR
				usuarios[filaLibre][3] = capturador;
			}
		}while(capturador.length() == 0);

	//TELEFONO: PETICION Y GUARDADO

		do {
			System.out.println("[+] Favor Ingrese Teléfono : [OBLIGATORIO]");
			capturador = scanner.nextLine().trim();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Teléfono No puede estar vacío, favor reintente.");
			}else if(!capturador.matches(regExTelefono)){
				System.out.println("[ERROR] Formato ingresado no es válido favor reintente.");
			}else {
				//TELEFONO VALIDO -> GUARDAR
				usuarios[filaLibre][4] = capturador;
			}
		}while(capturador.length() == 0 || !capturador.matches(regExTelefono));
		
	//CANT EMPLEADOS: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Cantidad Empleados : ");
			capturador = scanner.nextLine().trim();
			if(!capturador.matches(regExNumerica)) {
				System.out.println("[ERROR] Sólo se permiten caracteres Numéricos.");
			}else {
				//CANTIDAD EMPLEADOS VALIDO -> GUARDAR
				usuarios[filaLibre][5] = capturador;
			}
		}while(!capturador.matches(regExNumerica));
	}
	
	//ALMACENA LOS DATOS NECESARIOS PARA EL PERFIL PROFESIONAL
	public static void guardarProfesional() {
	String capturador;
	//EXPERIENCIA: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Experiencia en años : ");
			capturador = scanner.nextLine().trim();
			if(!capturador.matches(regExNumerica)) {
				System.out.println("[ERROR] Sólo se permiten carácteres Numéricos.");
			}else {
				//EXPERIENCIA VALIDA -> GUARDAR
				usuarios[filaLibre][6] = capturador;	
			}
		}while(!capturador.matches(regExNumerica));
		
	//DEPARTAMENTO: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Departamento : [OBLIGATORIO]");
			capturador = scanner.nextLine();
			//DEPARTAMENTO VALIDADO -> GUARDAR
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Departamento No puede estar vacío, favor reintente.");
			}else {}
			usuarios[filaLibre][7] = capturador;
		}while(capturador.length() == 0);
	}
	
	//ALMACENA LOS DATOS NECESARIOS PARA EL PERFIL ADMINISTRATIVO
	public static void guardarAdministrativo() {
	String capturador;	
	//FUNCION: PETICION Y GUARDADO
		do {
			System.out.println("[+] Favor Ingrese Función : [OBLIGATORIO]");
			capturador = scanner.nextLine();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Función no puede estar vacío, favor reintente");
			}else {
				//FUNCION VALIDADA -> GUARDAR
				usuarios[filaLibre][8] = capturador;
			}
		}while(capturador.length() == 0);

	//NOMBRE SUPERIOR: PETICION Y GUARDADO
		System.out.println("[+] Favor Ingrese Nombre Superior : ");
		capturador = scanner.nextLine().trim();
		//NOMBRE SUPERIOR -> GUARDAR
		usuarios[filaLibre][9] = capturador;

	}
	
	//AUTOR: ANDRÉS CONTRERAS	
	public static void mostrarUsuarios(String[][] usuarios) {
		for (String[] usuario : usuarios) { //Creacion de variable auxiliar
			if (usuario[2] != null) { // Se buscan los usuarios utilizando la variable rut
				imprimirUsuario(usuario);
			}
		}
		//REGRESA AL MENÚ PRINCIPAL
		menuPrincipal();
	}
	
	//AUTOR: ANDRÉS CONTRERAS
	public static void imprimirUsuario(String[] usuario) {
		for (String campo : usuario) {
			System.out.print(campo + " ");
		}
		System.out.println();
	}
	
	//AUTORA: VALENTINA
    public static void eliminarUsuario(){
    String rutEliminar;
    scanner.nextLine(); //LIBERA EL BUFFER PARA SOLUCIONAR EL ERROR DEL OBJETO SCANNER
    
    	do {
    		//PEDIR RUT
    		System.out.println("[+] Ingrese el RUT del Usuario que desea Eliminar: ");
    		rutEliminar = scanner.nextLine().trim();
    		//VALIDA INGRESO RUT/VACIO/SI EXISTE,ETC
    		if(rutEliminar.length() == 0) {
			}else if(!rutEliminar.matches(RegExRut)) {
				System.out.println("[ERROR] Formato ingresado no es válido, sólo se permiten dígitos de 6 a 8 un guión y dígito verificador");
			}else if(!existeRut(rutEliminar, usuarios)) {
				//EXISTE USUARIO NO PUEDE CONTINUAR
				System.out.println("[ERROR]: RUT ingresado No existe en la base de datos");
			}else {
    			//RUT VALIDO > REALIZAR LOGICA DE BORRADO DE USUARIO
    			eliminarPosicion(usuarios, rutEliminar);
    			menuPrincipal();
			}
    	}while(rutEliminar.length() == 0
				|| !rutEliminar.matches(RegExRut)
				|| (!existeRut(rutEliminar, usuarios)));
    	}
    
    //AUTORA: VALENTINA
    private static void eliminarPosicion(String[][]usuarios, String rutEliminar) {
    	int posicionEliminar = 0;
    	
    	System.out.println("[AVISO] VOY A BORRAR EL RUT " + rutEliminar);
		String[][] arrDestino = new String[100][10]; //DECLARO UN ARRAY TEMPORAL EXACTAMENTE IGUAL AL ORIGINAL
		
		for (int i = 0; i < usuarios.length ; i++ ) {
			if (rutEliminar.equals(usuarios[i][2])) {
				posicionEliminar = i;
				break;
			}
		}
		System.out.println("POSICION A ELIMINAR: " + posicionEliminar);
		
		// Copiar cada fila a su nueva posición en la matriz de destino, excepto la fila que se desea omitir
		for (int i = 0; i < usuarios.length; i++) {
		    if (i == posicionEliminar) {
		        // Dejar la fila en blanco asignando un nuevo array vacío
		        arrDestino[i] = new String[usuarios[i].length];
		    } else {
		        // Copiar la fila a su nueva posición en la matriz de destino
		        System.arraycopy(usuarios[i], 0, arrDestino[i], 0, usuarios[i].length);
		    }
		}
		
		// Copiar los datos del array destino de vuelta al array original sin la fila 5
		for (int i = 0; i < usuarios.length; i++) {
		    if (i == posicionEliminar) {
		        // Dejar la fila en blanco
		        usuarios[i] = new String[usuarios[i].length];
		    } else {
		        // Copiar la fila desde la matriz destino a su nueva posición en la matriz original
		        System.arraycopy(arrDestino[i], 0, usuarios[i], 0, usuarios[i].length);
		    }
		}
    }
}
    	
  	
    	
//        int elementosResiduo = arr.length - ( posicion + 1 );
//        System.arraycopy(arr, 0, arrDestino, 0, posicion);
//        System.arraycopy(arr, posicion + 1, arrDestino, posicion, elementosResiduo);
//        System.out.println("Elementos -- "  + Arrays.toString(arrDestino));

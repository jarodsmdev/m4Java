package m4ABPRO4;

import java.util.Scanner;


public class M4APBRO4 {
	
	//MATRIZ
	static String [][] usuarios = new String[100][10];
	
	//OBJETO SCANNER
	static Scanner scanner = new Scanner(System.in);
	
	//EXPRESIONES REGULARES
	static String regExNumerica = "^[0-9]+$"; //SÓLO ACEPTA CARACTERES NUMÉRICOS
	static String RegExRut = "^\\d{1,8}-[0-9Kk]$"; //CAMBIAR A 6 EL 1 EN PRODUCCCION DEBUG****;
	static String regExTelefono = "\\d{3,}";
	//static String regExTelefono = "^\\d{3}[\\d+()]*$"; //3 DÍGITOS ADICIONALMENTE EL SIGNO +
	//static String regExTelefono = "^\\+?[0-9]{1,3}[-\\s]?\\(?\\d{3}\\)?[-\\s]?\\d{3}[-\\s]?\\d{4}$";
	static String regExFecha = "^(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/((?:19|20)[0-9]{2}|18[0-9]{2})|\\b29\\/02\\/((?:19|20)(?:04|08|[2468][048]|[13579][26])|(?:2000))$";
	static String regSiNo = "^(si|no)$";
	
	//VARIABLES GLOBALES
	static int fila;
	static boolean primerInicio = true;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DATOS DE PRUEBA
		//usuarios[0] = new String[]{"Juan", "01/01/1990", "12345678-9", "Calle 1 #123", "+56912345678", "10", "5 años", "Ventas", "Vendedor", "TERRIBLE JEFE"};
		//usuarios[1] = new String[]{"María", "02/02/1995", "98765432-1", "Calle 2 #456", "+56987654321", "5", "2 años", "Marketing", "Analista", "Sofía"};
		//usuarios[2] = new String[]{"Pedro", "03/03/1985", "1-9", "Calle 3 #789", "+56911111111", "20", "10 años", "Finanzas", "Contador", "Carlos"};
		menuPrincipal();		
	}
	
	//REGISTRA USUARIOS EN EL ARRAY OBLIGATORIO 1 DE CADA UNO, 3 USUARIOS EN TOTAL
	public static void registrarUsuario(String[][]listadoUsuario) {
		if(primerInicio) {
			
			System.out.println("[!] ¡SE HA DETECTADO QUE ESTE ES EL PRIMER INICIO!:\nDEBEMOS INICIAR CON 3 PEFILES DE USUARIOS PARA CONTINUAR\n");
			System.out.println("[!] PRIMER PERFIL DE USUARIO A CREAR DEBE SER TIPO CLIENTE\n");
			//scanner.nextLine();
			fila = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			guardarCliente();
			
			System.out.println("[!] SEGUNDO PERFIL DE USUARIO A CREAR DEBE SER DE TIPO PROFESIONAL\n");    		
			fila = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			guardarProfesional();
			
			System.out.println("[!] TERCER PERFIL DE USUARIO A CREAR DEBE SER DE TIPO ADMINISTRATIVO\n");    		
			fila = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			guardarAdministrativo();
			
			//CAMBIA LA VARIABLE PARA LA PROXIMA VEZ NO OBLIGUE EL INGRESO DE 3 USUARIOS
			primerInicio=false;
			
			//REGRESA AL MENU PRINCIPAL
			menuPrincipal();			
		}else {
			System.out.println("SISTEMA DE USUARIOS\n\t[!] REGISTRAR USUARIO [!]\n");
			//scanner.nextLine();
			fila = posicionRegistroVacio(usuarios);
			guardarDatosComunes(usuarios);
			menuPerfilUsuario();
			menuPrincipal();
		}
	}
	
	//AUTORA: PRISCILA CARRILLO
	public static void menuPrincipal() {
		int opcion;
		String capturador = "";
		
		if(primerInicio) {
			System.out.println("SISTEMA DE USUARIOS\n");
			registrarUsuario(usuarios);
		}
		
		do {
			System.out.println("-------------------------------------------------------");
	       	System.out.println("SISTEMA DE USUARIOS\n\t[!] MENÚ PRINCIPAL [!]\n");
	        System.out.println("[+] Por favor, seleccione una opción:\n");
	        System.out.println("\t1. Registrar usuario");
	        System.out.println("\t2. Mostrar usuarios");
	        System.out.println("\t3. Contar usuarios por categoría");
	        System.out.println("\t4. Modificar usuarios");
	        System.out.println("\t5. Eliminar usuario");
	        System.out.println("\t6. Salir");
	        System.out.println("-------------------------------------------------------");
	        
	        capturador = scanner.nextLine();
	        
	        if(capturador.matches("^[1-6]$")) {
				opcion = Integer.parseInt(capturador);
			}else {
				opcion = 0;			
			}
	        
	        switch(opcion) {     //Se usa switch para llamar a la función//
            case 1:
            	//System.out.println("[!] Registrar usuario...");
            	registrarUsuario(usuarios);
                break;
            case 2:
            	System.out.println("SISTEMA DE USUARIOS\n\t[!] LISTADO DE USUARIOS [!]\n");
            	System.out.println("[!] Mostrando " + totalUsuarios(usuarios) + " usuarios en Total\n");
                mostrarUsuarios(usuarios);
                break;
            case 3:
            	System.out.println("SISTEMA DE USUARIOS\n\t[!] RESUMEN POR CATEGORÍA [!]\n");
            	System.out.println("[!] Resumen de Usuarios: ");
            	contarUsuariosPorCategoria(usuarios);
            	menuPrincipal();
                break;
            case 4:
            	System.out.println("[!]Modificar Usuario: ");
                modificarUsuario();
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
	        
		}while(!capturador.matches("^[1-6]$")); //SÓLO ACEPTA NÚMERO DE 1 AL 6
 
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

	//RETORNA LA POSICION DEL RUT
	public static int posicionRUT(String rut, String[][]listadoUsuario) {
		for (int i = 0; i < listadoUsuario.length ; i++ ) {
			if (rut.equals(listadoUsuario[i][2])) {
				return i;
			}
		}
		return -1;
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
	
	//RETORNA LA CANTIDAD TOTAL DE USUARIOS
	public static int totalUsuarios(String[][]listadoUsuarios) {
		int total = 0;
		for(int i = 0; i < listadoUsuarios.length; i++) {
			if(listadoUsuarios[i][2] != null ) {
				total++;
			}
		}
		if(total == 0){
			primerInicio=true;
		}
		return total;
	}
	
	//FUNCION PERMITE ALMACENAR LOS DATOS COMUNES A TODOS LOS PERFILES
	public static void guardarDatosComunes(String[][]usuarios) {
		String capturador = "";
		//RUT: PETICION Y VALIDACION
			do {
				System.out.println("[+] Favor ingrese RUT:\n[!] Sin puntos y con guión [OBLIGATORIO]");
				capturador = scanner.nextLine().trim().toUpperCase();
				
				if(capturador.length() == 0) {
				}else if(!capturador.matches(RegExRut)) {
					System.out.println("[ERROR] Formato ingresado no es válido, sólo se permiten dígitos de 6 a 8 un guión y dígito verificador");
				}else if(existeRut(capturador, usuarios)) {
					//EXISTE USUARIO NO PUEDE CONTINUAR
					System.out.println("[ERROR]: RUT ingresado ya existe en la base de datos");
				}else {
					//NO EXISTE USUARIO PUEDE GUARDAR
					//PROCESO DE GUARDADO DE DATOS EN EL ARRAY
					usuarios[fila][2] = capturador;
				}
			}while(capturador.length() == 0
					|| !capturador.matches(RegExRut)
					|| (existeRut(capturador, usuarios) && usuarios[fila][2] != capturador)
					);
			
		//NOMBRE: PETICION Y GUARDADO
				do {
					System.out.println("[+] Favor Ingrese Nombre : [OBLIGATORIO]");
					capturador = scanner.nextLine().trim();
					
					if(capturador.length()==0) {
						System.out.println("[ERROR] Nombre Obligatorio, favor reintente.");
					}else {
						//NOMBRE VÁLIDO -> GUARDAR
						usuarios[fila][0] = capturador;
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
						usuarios[fila][1] = capturador;
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
				usuarios[fila][3] = capturador;
			}
		}while(capturador.length() == 0);

	//TELEFONO: PETICION Y GUARDADO

		do {
			System.out.println("[+] Favor Ingrese Teléfono : [OBLIGATORIO]");
			capturador = scanner.nextLine().trim();
			if(capturador.length() == 0) {
				System.out.println("[ERROR] Teléfono No puede estar vacío, favor reintente.");
			}else if(!capturador.matches(regExTelefono)){
				System.out.println("[ERROR] Formato ingresado no es válido favor reintente. [Sólo Números]");
			}else {
				//TELEFONO VALIDO -> GUARDAR
				usuarios[fila][4] = capturador;
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
				usuarios[fila][5] = capturador;
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
				usuarios[fila][6] = capturador;	
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
			usuarios[fila][7] = capturador;
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
				usuarios[fila][8] = capturador;
			}
		}while(capturador.length() == 0);

	//NOMBRE SUPERIOR: PETICION Y GUARDADO
		System.out.println("[+] Favor Ingrese Nombre Superior : ");
		capturador = scanner.nextLine().trim();
		//NOMBRE SUPERIOR -> GUARDAR
		usuarios[fila][9] = capturador;

	}
	
	//AUTOR: ANDRÉS CONTRERAS	
	public static void mostrarUsuarios(String[][] usuarios) {
		for (String[] usuario : usuarios) { //Creacion de variable auxiliar
			if (usuario[2] != null) { // Se buscan los usuarios utilizando la posicion del dato rut en el array
				imprimirUsuario(usuario);
			}
		}
		//REGRESA AL MENÚ PRINCIPAL
		menuPrincipal();
	}
	
	//AUTOR: ANDRÉS CONTRERAS
	public static void imprimirUsuario(String[] usuario) {
		
		//int indiceCabecera = 0;
		//int contadorUsuario = 1;
		
		String[] cabecera = new String[10];
		
		cabecera[0] = "Nombre: ";
		cabecera[1] = "Fecha Nacimiento: ";
		cabecera[2] = "RUT: ";
		cabecera[3] = "Dirección: ";
		cabecera[4] = "Teléfono: ";
		cabecera[5] = "Cantidad Empleados: ";
		cabecera[6] = "Años Experiencia: ";
		cabecera[7] = "Departamento: ";
		cabecera[8] = "Función: ";
		cabecera[9] = "Nombre Superior: ";

		//System.out.println("Usuario " + contadorUsuario + ":");
		
		for (String campo : usuario) {
			if (campo != null) // Remueve los espacios vacios.
				//System.out.print(""+cabecera[indiceCabecera] + campo + " ");
				System.out.print(campo + " || ");
				//indiceCabecera++;
				//contadorUsuario++;
			}
		System.out.println();
	}
	
	//AUTOR: ANDRÉS CONTRERAS
	public static void contarUsuariosPorCategoria(String[][] usuarios) {
		int cantClientes = 0;
	    int cantProfesionales = 0;
	    int cantAdministrativos = 0;

	    for (int i = 0; i < usuarios.length; i++) {
	    	
			if (usuarios[i][2] != null && usuarios[i][3] != null) {
				cantClientes++;
			} else if (usuarios[i][2] != null && usuarios[i][7] != null) {
				cantProfesionales++;
			} else if (usuarios[i][2] != null && usuarios[i][8] != null) {
				cantAdministrativos++;
			}
	    }
	    System.out.println("Cantidad de usuarios por categoría:\n");
	    System.out.println("\tClientes: " + cantClientes);
	    System.out.println("\tProfesionales: " + cantProfesionales);
	    System.out.println("\tAdministrativos: " + cantAdministrativos);
	}
	
	//AUTORA: VALENTINA SALDÍAS
    public static void eliminarUsuario(){
    String rutEliminar;
    System.out.println("SISTEMA DE USUARIOS:\n\t[!] ELIMINAR USUARIO [!]\n");
    //scanner.nextLine(); //LIBERA EL BUFFER PARA SOLUCIONAR EL ERROR DEL OBJETO SCANNER
    
    	do {
    		//PEDIR RUT
    		System.out.println("[+] Ingrese el RUT del Usuario que desea Eliminar: \nIngrese [SALIR] para volver al menú Principal");
    		rutEliminar = scanner.nextLine().trim();
    		//VALIDA INGRESO RUT/VACIO/SI EXISTE,ETC
    		if(rutEliminar.length() == 0) {
    		}else if(rutEliminar.equals("SALIR")) {
    			System.out.println("[!] Volviendo al Menú Principal");
    			menuPrincipal();
			}else if(!rutEliminar.matches(RegExRut)) {
				System.out.println("[ERROR] Formato ingresado no es válido, sólo se permiten dígitos de 6 a 8 un guión y dígito verificador\n");
			}else if(!existeRut(rutEliminar, usuarios)) {
				//EXISTE USUARIO NO PUEDE CONTINUAR
				System.out.println("[ERROR]: RUT ingresado No existe en la base de datos\n");
			}else {
    			//RUT VALIDO > REALIZAR LOGICA DE BORRADO DE USUARIO
    			eliminarPosicion(usuarios, rutEliminar);
    			menuPrincipal();
			}
    	}while(rutEliminar.length() == 0
				|| !rutEliminar.matches(RegExRut)
				|| (!existeRut(rutEliminar, usuarios) && !rutEliminar.equals("SALIR"))
    			);
    	}
    
    //FUNCION FALTANTE MODIFIAR USUARIO
    public static void modificarUsuario() {
    	System.out.println("[FUNCIÓN FALTANTE]YO MODIFICO UN USUARIO");
    	menuPrincipal();
    }
    
    //AUTORA: VALENTINA SALDÍAS
    private static void eliminarPosicion(String[][]usuarios, String rutEliminar) {
    	String capturador = "";
    	int posicionEliminar = 0;
    	
    	System.out.println("[AVISO] PROCESO DE ELIMINACIÓN DEL USUARIO CON RUT: " + rutEliminar +"\n[AVISO] ESTA ACCIÓN NO SE PUEDE REVERTIR\n");
    	do {
    		System.out.println("[+] ¿Está seguro de Eliminar el Usuario? [SI/NO]\n");
    		capturador = scanner.nextLine().trim().toLowerCase();
    		if(!capturador.matches(regSiNo)) {
    			System.out.println("[ERROR] Debe responder [SI] o [NO]\n");
    		}else if(capturador.equalsIgnoreCase("no")){
    			//USUARIO CANCELA LA ELIMINACION
    			System.out.println("[!] Se ha cancelado la Operación");
    		}else {
    			//USUARIO CONFIRMA LA ELIMINACION
    			String[][] arrDestino = new String[100][10]; //DECLARO UN ARRAY TEMPORAL EXACTAMENTE IGUAL AL ORIGINAL
    			
    			posicionEliminar = posicionRUT(rutEliminar, usuarios); //BUSCA LA POSICION DEL REGISTRO PARA ELIMINAR

    	    	//MUESTRA EN PANTALLA EL NOMBRE DEL USUARIO A ELIMINAR ANTES DE ELIMINARLO COMPLETAMENTE
    	    	System.out.println("[!] SE HA ELIMINADO EL USUARIO: " + usuarios[posicionEliminar][0]);
    	    	
    			// COPIA CADA FILA OMITIENDO LA QUE SE DESEA ELIMINAR
    			for (int i = 0; i < usuarios.length; i++) {
    			    if (i == posicionEliminar) {
  
    			    } else {
    			        // COPIA LA FILA A SU NUEVA POSICION
    			        System.arraycopy(usuarios[i], 0, arrDestino[i], 0, usuarios[i].length);
    			    }
    			}
    			
    			// COPIA LOS DATOS DEL ARRAY TEMPORAL HACIA EL ORIGINAL SIN EL REGISTRO ELIMINADO
    			for (int i = 0; i < usuarios.length; i++) {
    			    if (i == posicionEliminar) {
    			        // DEJA LA FILA EN BLANCO
    			        usuarios[i] = new String[usuarios[i].length];
    			    } else {
    			        // COPIA LA FILA DESDE EL ARRAY ORIGINAL AL TEMPORAL
    			        System.arraycopy(arrDestino[i], 0, usuarios[i], 0, usuarios[i].length);
    			    }
    			}
    		}
    	}while(!capturador.matches(regSiNo));
    	
    }
}
    	

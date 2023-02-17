package modulo4;
import java.util.Scanner;

public class Pruebagrupal {

		    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcion = 0;
	        
	       	        	
	            System.out.println("Por favor, seleccione una opcion:");
	            System.out.println("1. Registrar usuario");
	            System.out.println("2. Mostrar usuarios");
	            System.out.println("3. Contar usuarios por categoria");
	            System.out.println("4. Modificar usuarios");
	            System.out.println("5. Eliminar usuario");
	            System.out.println("6. Salir");
	            
	            //si se ingresa un número que no está en la lista, debe salir "Error" u "Opción inválida" en la consola//
	            
	            while(opcion != 6) {   //ciclo while hasta que seleccione la opcion 6//
	            	
	            opcion = sc.nextInt();
	            
	            switch(opcion) {     //Se usa switch para llamar a la función//
	                case 1:
	                    registrarUsuario();
	                    break;
	                case 2:
	                    mostrarUsuarios();
	                    break;
	                case 3:
	                    contarUsuariosPorCategoria();
	                    break;
	                case 4:
	                    modificarUsuario();
	                    break;
	                case 5:
	                    eliminarUsuario();
	                    break;
	                case 6:
	                    System.out.println("Gracias, hasta pronto.");
	                    break;
	                default:
	                    System.out.println("Opción invalida. Por favor, seleccione una opción del menú del 1-6.");
	                    break;            
	            }
	           
	        }
	        
	        sc.close();
	    }
	    
		    public static void registrarUsuario() {
		        // Para mostrar el registro del usuario//
		        System.out.println("Registrando usuario...");
		    }

		    public static void mostrarUsuarios() {
		    	// Para mostrar el usuario// 
		        System.out.println("Mostrando usuarios...");
		    }

		    public static void contarUsuariosPorCategoria() {
		    	// Para mostrar el conteo de usuarios por categoría//
		        System.out.println("Contando usuarios por categoría...");
		    }

		    public static void modificarUsuario() {
		    	// Para mostrar la mofificación de un usuarip//
		        System.out.println("Modificando usuario...");
		    }

		    public static void eliminarUsuario() {
		    	// Para mostrar la eliminacion del usuario//
		        System.out.println("Eliminando usuario...");
		    	
		    	
		    }    
	    
	    	}




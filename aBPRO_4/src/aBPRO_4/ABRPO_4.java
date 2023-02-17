package aBPRO_4;

public class ABRPO_4 {

	static String[][] usuarios = new String[100][10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		mostrarUsuarios(usuarios);
		
		String nombre;
		String fechaNacimiento;
		String rut;
		String direccion;
		String telefono;
		String cantEmpleados;
		String experiencia;
		String departamento;
		String funcion;
		String nombresuperior;
		//USUARIOS DE PRUEBA
		usuarios[0] = new String[]{"Juan", "01/01/1990", "12345678-9", "Calle 1 #123", "+56912345678", "10", "5 años", "Ventas", "Vendedor", "Pedro"};
		usuarios[1] = new String[]{"María", "02/02/1995", "98765432-1", "Calle 2 #456", "+56987654321", "5", "2 años", "Marketing", "Analista", "Sofía"};
		usuarios[2] = new String[]{"Pedro", "03/03/1985", "11111111-1", "Calle 3 #789", "+56911111111", "20", "10 años", "Finanzas", "Contador", "Carlos"};
		
		mostrarUsuarios(usuarios);
		
	}
	
//	 FUNCION PARA MOSTRAR UN SOLO USUARIOS QUE NO ESTAN VACIOS
	 
//	public static void mostrarUsuarios(String [][] usuarios){
//		
//	    for (int i = 0 ; i < usuarios.length; i++) {
//	        if (usuarios[i][2] != null) { // Se buscan los usuarios utilizando la variable rut
//	            System.out.println(usuarios[i][0] + " " + usuarios[i][1] + " " + usuarios[i][2] + " "
//	            + usuarios[i][3] + " " + usuarios[i][4] + " " + usuarios[i][5] + " " + usuarios[i][6]
//	            + usuarios[i][7] + " " + usuarios[i][8] + " " + usuarios[i][9]);
//	        	System.out.println("");
//	        }
//	    }
//	}
//}
	public static void mostrarUsuarios(String[][] usuarios) {
		for (String[] usuario : usuarios) { //Creacion de variable auxiliar
			if (usuario[2] != null) { // Se buscan los usuarios utilizando la variable rut
				imprimirUsuario(usuario);
			}
		}
	}

	public static void imprimirUsuario(String[] usuario) {
		for (String campo : usuario) {
			System.out.print(campo + " ");
		}
		System.out.println();
	}
}

package m4ABPRO7;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//DECLARACION E INICIALIZACION DE ARRAYLIST CAPACITACIONES
		ArrayList<Capacitacion> listaCapacitacion1 = new ArrayList<Capacitacion>();
		
		//DECLARACION E INICIALIZACION DE OBJETO VISITATERRENO
		ArrayList<VisitaTerreno>visitasTerreno1 = new ArrayList<VisitaTerreno>();
		ArrayList<VisitaTerreno>visitasTerreno2 = new ArrayList<VisitaTerreno>();
		
		//DECLARACION E INICIALIZACION DE OBJETO ACCIDENTE
		ArrayList <Accidente> accidentes1 = new ArrayList <Accidente>();
		
		//DECLARACIÓN E INICIALIZACIÓN DE OBJETOS CLIENTE
				//MEDIANTE CONSTRUCTOR VACÍO
				Cliente cliente1 = new Cliente(visitasTerreno1);
				//INICIALIZACIÓN DEL OBJETO cliente1 MEDIANTE MÉTODOS MUTADORES
					cliente1.setRut(123123);
					cliente1.setNombres("Juanito");
					cliente1.setApellidos("Pérez");
					cliente1.setTelefono("913459876");
					cliente1.setAfp("AFP Capital");
					cliente1.setSistemaSalud('2');
					cliente1.setDireccion("Calle Limache #142");
					cliente1.setComuna("Valparaíso");
					cliente1.setEdad(50);
				
				//MEDIANTE CONSTRUCTOR CON PARÁMETROS
				Cliente cliente2 = new Cliente(456454, "Pedro", "Lira", "789456", "AFP CINCO", '1', "Quillota #789", "Valparaíso", 36, listaCapacitacion1, accidentes1, visitasTerreno1);
				
				//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO CLIENTE
				System.out.println(cliente1.toString() + "\n" + cliente2.toString());
				
				System.out.println("\n------");		
				
		
		
		//DECLARACIÓN E INCIALIZACIÓN DE OBJETOS CLIENTE
		//MEDIANTE CONSTRUCTOR VACÍO
		Usuario usuario1 = new Usuario(cliente1); 
		//INICALIZANDO OBJETO USANDO MÉTODOS MUTADORES
			usuario1.setNombreUsuario("LaVioleta");
			usuario1.setFechaNacimiento("19/04/1987");
			usuario1.getCliente().setRut(12345678);
			usuario1.getCliente().setNombres("Violeta");
			usuario1.getCliente().setApellidos("Flores");
			usuario1.getCliente().setTelefono("5678984");
			usuario1.getCliente().setAfp("AFP CUATRO");
			usuario1.getCliente().setSistemaSalud('2');
			usuario1.getCliente().setDireccion("Más allá 404");
			usuario1.getCliente().setComuna("Valparaíso");
			usuario1.getCliente().setEdad(40);
			
			//MEDIANTE CONSTRUCTOR PASANDO PARÁMETROS
			//Usuario usuario2 = new Usuario ("El peter", "23/02/1997", 1233,"Pedro","Lira","1234","AFP CINCO",'1',"Más acá 404","Valparaíso",25);
			Usuario usuario2 = new Usuario("El peter", "23/02/1997", cliente2);
			
			//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO USUARIO
			System.out.println(usuario1.toString() + "\n" + usuario2.toString());

			System.out.println("------");
		
		
		//DECLARACIÓN E INICIALIZACIÓN DE OBJETOS CAPACITACION
		//MEDIANTE CONSTRUCTOR VACÍO
		Capacitacion capacitacion1 = new Capacitacion();
		//INICIALIZACIÓN DEL OBJETO capacitacion1 MEDIANTE MÉTODOS MUTADORES
		capacitacion1.setIdentificador(1);
		//capacitacion1.setRut(123123);
		capacitacion1.setDia("martes");
		capacitacion1.setHora("09:30");
		capacitacion1.setLugar("Casa de Damián");
		capacitacion1.setDuracion(90);
		//capacitacion1.setCantidadAsistentes(8);
		
		//AGREGANDO USUARIO1 AL ARRAY DE CAPACITACION1
		capacitacion1.agregarAsistentes(usuario1);

		//DECLARACIÓN E INICIALIZACIÓN DEL OBJETO CAPACITACIÓN MEDIANTE CONSTRUCTOR CON PARÁMETROS
		Capacitacion capacitacion2 = new Capacitacion(2, "lunes", "16:30", "Hotel O'Higgins", 30);
		//AGREGANDO USUARIO2 A CAPACITACION2
		capacitacion2.agregarAsistentes(usuario1);
		
		//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO CAPACITACION
		System.out.println(capacitacion1.toString() + "\n" + capacitacion2.toString());
		
		
		

		
	
	

	


	//MODIFICACIÓN DE ATRIBUTOS
	usuario1.setFechaNacimiento("29/02/2000");
	cliente1.setAfp("AFP UNO");
	capacitacion1.setDia("miércoles");
	
	System.out.println("\n------");
	
	//DESPLEGANDO DATOS USUARIO1
	System.out.println("\n***Usuarios:***\n");
	System.out.println("USUARIO: " + usuario1.getNombreUsuario());
	System.out.println("FECHA NACIMIENTO: " + usuario1.getFechaNacimiento());
	System.out.println("ASOCIADO A CLIENTE: " + usuario1.getCliente().obtenerNombre());
	System.out.println("---");
	//DESPLEGANDO DATOS USUARIO2
	System.out.println("USUARIO: " + usuario2.getNombreUsuario());
	System.out.println("FECHA NACIMIENTO: " + usuario2.getFechaNacimiento());
	System.out.println("ASOCIADO A CLIENTE: " +usuario2.getCliente().obtenerNombre());
	
	//DESPLEGANDO DATOS CLIENTE 1	
	System.out.println(cliente1.getRut() +"\n"+ cliente1.getNombres() +"\n"+ cliente1.getApellidos() +"\n"+
					      cliente1.getTelefono() +"\n"+ cliente1.getAfp() +"\n"+ cliente1.obtenerSistemaSalud() +"\n"+
				          cliente1.getDireccion() +"\n"+ cliente1.getComuna() +"\n"+ cliente1.getEdad());
	System.out.println("\n");
		
	//DESPLEGANDO DATOS CLIENTE 2
	System.out.println(cliente2.getRut() +"\n"+ cliente2.getNombres() +"\n"+ cliente2.getApellidos() +"\n"+
				          cliente2.getTelefono() +"\n"+ cliente2.getAfp() +"\n"+ cliente2.obtenerSistemaSalud() +"\n"+
				          cliente2.getDireccion() +"\n"+ cliente2.getComuna() +"\n"+ cliente2.getEdad());

	System.out.println("\n-----\n");
	//metodos accesores Capacitacion

		System.out.println("ID: " + capacitacion1.getIdentificador());
		System.out.println("CANTIDAD ASISTENTES: " + capacitacion1.getCantidadAsistentes());
		System.out.println("DÍA: " + capacitacion1.getDia());
		System.out.println("DURACIÓN: " + capacitacion1.getDuracion());
		System.out.println("HORA: " +capacitacion1.getHora());
		System.out.println("LUGAR: " + capacitacion1.getLugar());
		//System.out.println(capacitacion1.toString());
		
		System.out.println("\nUsuarios asociados a capacitacion 1: ");
		for (int i = 0; i < capacitacion1.getUsuarios().size(); i++) {
			
			System.out.println(capacitacion1.getUsuarios().get(i));
		}
		
		System.out.println("\n-----\n");
		//metodos accesores Capacitacion 2

		System.out.println("ID: " + capacitacion2.getIdentificador());
		System.out.println("CANTIDAD ASISTENTES: " + capacitacion2.getCantidadAsistentes());
		System.out.println("DÍA: " + capacitacion2.getDia());
		System.out.println("DURACIÓN: " + capacitacion2.getDuracion());
		System.out.println("HORA: " + capacitacion2.getHora());
		System.out.println("LUGAR: " + capacitacion2.getLugar());
		//System.out.println(capacitacion2.toString());
		
		System.out.println("\nClientes asociados a capacitacion 2: ");
		for (int i = 0; i < capacitacion2.getUsuarios().size(); i++) {
			
			System.out.println(capacitacion2.getUsuarios().get(i) );
		}
	
//		usuario1.getCliente().agregarCapacitaciones(capacitacion2);
//		usuario1.getCliente().agregarCapacitaciones(capacitacion2);
//		usuario1.getCliente().agregarCapacitaciones(capacitacion1);
		System.out.println(usuario1.getCliente().toString());
	
	}
}
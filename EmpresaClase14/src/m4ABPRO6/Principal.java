package m4ABPRO6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//DECLARACIÓN E INCIALIZACIÓN DE OBJETOS CLIENTE
	//MEDIANTE CONSTRUCTOR VACÍO
	Usuarios usuario1 = new Usuarios (); 
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
	Usuarios usuario2 = new Usuarios ("El peter", "23/02/1997", 1233,"Pedro","Lira","1234","AFP CINCO",'1',"Más acá 404","Valparaíso",25);
	
	//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO USUARIO
	System.out.println(usuario1.toString() + "\n" + usuario2.toString());

	System.out.println("------");
	
//DECLARACIÓN E INICIALIZACIÓN DE OBJETOS CLIENTE
	//MEDIANTE CONSTRUCTOR VACÍO
	Cliente cliente1 = new Cliente();
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
	Cliente cliente2 = new Cliente(1234,"Elvis","Tek", "1234567","AFP modelo",'1',"Quillota 123", "Valparaíso",36);
	
	//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO CLIENTE
	System.out.println(cliente1.toString() + "\n" + cliente2.toString());
	
	System.out.println("\n------");
	
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
	capacitacion1.setCantidadAsistentes(8);
	
	//AGREGANDO CLIENTE1 AL ARRAY DE CAPACITACION1
	capacitacion1.getClientes().add(cliente1);
	
	
	//DECLARACIÓN E INICIALIZACIÓN DEL OBJETO CAPACITACIÓN MEDIANTE CONSTRUCTOR CON PARÁMETROS
	Capacitacion capacitacion2 = new Capacitacion(2, "lunes", "16:30", "Hotel O'Higgins", 30, 5);
	//AGREGANDO CLIENTE2 A CAPACITACION2
	capacitacion2.getClientes().add(cliente2);
	
	//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO CAPACITACION
	System.out.println(capacitacion1.toString() + "\n" + capacitacion2.toString());
	


	//MODIFICACIÓN DE ATRIBUTOS
	usuario1.setFechaNacimiento("29/02/2000");
	cliente1.setAfp("AFP UNO");
	capacitacion1.setDia("miércoles");
	
	System.out.println("\n------");
	
	//DESPLEGANDO DATOS
	System.out.println(usuario1.getFechaNacimiento());
	System.out.println(cliente1.getAfp());
	System.out.println(capacitacion1.getDia());
	
	//DESPLEGANDO DATOS CLIENTE 1	
	System.out.println(cliente1.getRut() +"\n"+ cliente1.getNombres() +"\n"+ cliente1.getApellidos() +"\n"+
				      cliente1.getTelefono() +"\n"+ cliente1.getAfp() +"\n"+ cliente1.obtenerSistemaSalud() +"\n"+
			          cliente1.getDireccion() +"\n"+ cliente1.getComuna() +"\n"+ cliente1.getEdad());
	System.out.println("\n");
	
	//DESPLEGANDO DATOS CLIENTE 2
	System.out.println(cliente2.getRut() +"\n"+ cliente2.getNombres() +"\n"+ cliente2.getApellidos() +"\n"+
			          cliente2.getTelefono() +"\n"+ cliente2.getAfp() +"\n"+ cliente2.obtenerSistemaSalud() +"\n"+
			          cliente2.getDireccion() +"\n"+ cliente2.getComuna() +"\n"+ cliente2.getEdad());
	
	}
}
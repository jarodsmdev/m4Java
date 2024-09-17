package m4ABPRO6;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//DECLARACI��N E INCIALIZACI��N DE OBJETOS CLIENTE
	//MEDIANTE CONSTRUCTOR VAC��O
	Usuarios usuario1 = new Usuarios (); 
	//INICALIZANDO OBJETO USANDO M��TODOS MUTADORES
		usuario1.setNombreUsuario("LaVioleta");
		usuario1.setFechaNacimiento("19/04/1987");
		usuario1.getCliente().setRut(12345678);
		usuario1.getCliente().setNombres("Violeta");
		usuario1.getCliente().setApellidos("Flores");
		usuario1.getCliente().setTelefono("5678984");
		usuario1.getCliente().setAfp("AFP CUATRO");
		usuario1.getCliente().setSistemaSalud('2');
		usuario1.getCliente().setDireccion("M��s all�� 404");
		usuario1.getCliente().setComuna("Valpara��so");
		usuario1.getCliente().setEdad(40);
	
	//MEDIANTE CONSTRUCTOR PASANDO PAR��METROS
	Usuarios usuario2 = new Usuarios ("El peter", "23/02/1997", 1233,"Pedro","Lira","1234","AFP CINCO",'1',"M��s ac�� 404","Valpara��so",25);
	
	//INVOCACI��N DE M��TODO toString() PARA CADA OBJETO USUARIO
	System.out.println(usuario1.toString() + "\n" + usuario2.toString());

	System.out.println("------");
	
//DECLARACI��N E INICIALIZACI��N DE OBJETOS CLIENTE
	//MEDIANTE CONSTRUCTOR VAC��O
	Cliente cliente1 = new Cliente();
	//INICIALIZACI��N DEL OBJETO cliente1 MEDIANTE M��TODOS MUTADORES
		cliente1.setRut(123123);
		cliente1.setNombres("Juanito");
		cliente1.setApellidos("P��rez");
		cliente1.setTelefono("913459876");
		cliente1.setAfp("AFP Capital");
		cliente1.setSistemaSalud('2');
		cliente1.setDireccion("Calle Limache #142");
		cliente1.setComuna("Valpara��so");
		cliente1.setEdad(50);
	
	//MEDIANTE CONSTRUCTOR CON PAR��METROS
	Cliente cliente2 = new Cliente(1234,"Elvis","Tek", "1234567","AFP modelo",'1',"Quillota 123", "Valpara��so",36);
	
	//INVOCACI��N DE M��TODO toString() PARA CADA OBJETO CLIENTE
	System.out.println(cliente1.toString() + "\n" + cliente2.toString());
	
	System.out.println("\n------");
	
//DECLARACI��N E INICIALIZACI��N DE OBJETOS CAPACITACION
	//MEDIANTE CONSTRUCTOR VAC��O
	Capacitacion capacitacion1 = new Capacitacion();
	//INICIALIZACI��N DEL OBJETO capacitacion1 MEDIANTE M��TODOS MUTADORES
	capacitacion1.setIdentificador(1);
	//capacitacion1.setRut(123123);
	capacitacion1.setDia("martes");
	capacitacion1.setHora("09:30");
	capacitacion1.setLugar("Casa de Damián");
	capacitacion1.setDuracion(90);
	capacitacion1.setCantidadAsistentes(8);
	
	//AGREGANDO CLIENTE1 AL ARRAY DE CAPACITACION1
	capacitacion1.getClientes().add(cliente1);
	
	
	//DECLARACI��N E INICIALIZACI��N DEL OBJETO CAPACITACI��N MEDIANTE CONSTRUCTOR CON PAR��METROS
	Capacitacion capacitacion2 = new Capacitacion(2, "lunes", "16:30", "Hotel O'Higgins", 30, 5);
	//AGREGANDO CLIENTE2 A CAPACITACION2
	capacitacion2.getClientes().add(cliente2);
	
	//INVOCACI��N DE M��TODO toString() PARA CADA OBJETO CAPACITACION
	System.out.println(capacitacion1.toString() + "\n" + capacitacion2.toString());
	


	//MODIFICACI��N DE ATRIBUTOS
	usuario1.setFechaNacimiento("29/02/2000");
	cliente1.setAfp("AFP UNO");
	capacitacion1.setDia("mi��rcoles");
	
	System.out.println("\n------");
	
	//DESPLEGANDO DATOS
	System.out.println(usuario1.getFechaNacimiento());
	System.out.println(cliente1.getAfp());
	System.out.println(capacitacion1.getDia());
	
	//metodos accesores Capacitacion

	System.out.println(capacitacion1.getIdentificador());
	System.out.println(capacitacion1.getCantidadAsistentes());
	System.out.println(capacitacion1.getDia());
	System.out.println(capacitacion1.getDuracion());
	System.out.println(capacitacion1.getHora());
	System.out.println(capacitacion1.getLugar());
	System.out.println(capacitacion1.toString());
	System.out.println("\nClientes asociados a capacitacion 1: ");
	for (int i = 0; i < capacitacion1.getClientes().size(); i++) {
		
		
		System.out.println(capacitacion1.getClientes().get(i));
	}
	
	//metodos accesores Capacitacion 2

	System.out.println(capacitacion2.getIdentificador());
	System.out.println(capacitacion2.getCantidadAsistentes());
	System.out.println(capacitacion2.getDia());
	System.out.println(capacitacion2.getDuracion());
	System.out.println(capacitacion2.getHora());
	System.out.println(capacitacion2.getLugar());
	System.out.println(capacitacion2.toString());
	System.out.println("\nClientes asociados a capacitacion 2: ");
	for (int i = 0; i < capacitacion2.getClientes().size(); i++) {
		
		
		System.out.println(capacitacion2.getClientes().get(i));
	}
	
	
	
	
	
	}
}
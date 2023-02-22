package m4ABPRO6;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//DECLARACIÓN E INCIALIZACIÓN DE OBJETOS CLIENTE
	Usuarios usuario1 = new Usuarios (); //MEDIANTE CONSTRUCTOR VACÍO
	Usuarios usuario2 = new Usuarios ("El peter", "23/02/1997", 1233,"Pedro","Lira","1234","AFP CINCO",'1',"Más acá 404","Valparaíso",25);
	
	System.out.println(usuario2.toString());
	
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
	
	
	//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO

	System.out.println(usuario1.toString() + "\n" + usuario2.toString());
	
	
	
	//DECLARACIÓN E INICIALIZACIÓN DE OBJETOS CLIENTE
	Cliente cliente1 = new Cliente();
	Cliente cliente2 = new Cliente(1234,"elvis","tek", "1234567","afp modelo",'1',"quillota 123", "valpo",36);
	
	cliente1.setRut(123123);
	cliente1.setNombres("Juanito");
	cliente1.setApellidos("Perez");
	cliente1.setTelefono("913459876");
	cliente1.setAfp("afp capital");
	cliente1.setSistemaSalud('2');
	cliente1.setDireccion("calle limache 142");
	cliente1.setComuna("valpo");
	cliente1.setEdad(50);
	

	System.out.println(cliente1.toString() + "\n" + cliente2.toString());
	
	//DECLARACIÓN E INICIALIZACIÓN DE OBJETOS CAPACITACION
	
	}

}
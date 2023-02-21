package m4ABPRO5;

public class main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//DECLARACIÓN E INCIALIZACIÓN DE OBJETOS CLIENTE
	Cliente cliente1 = new Cliente (); //MEDIANTE CONSTRUCTOR VACÍO
	Cliente cliente2 = new Cliente (1233,"Pedro","Lira","1234","AFP CINCO",'1',"Más acá 404","Valparaíso",25);
	
	cliente1.setrut(1234);
	cliente1.setSistemaSalud('1');
	cliente1.setNombres("Violeta");
	cliente1.setApellidos("Flores");
	cliente1.setTelefono("5678984");
	cliente1.setAfp("AFP CUATRO");
	cliente1.setSistemaSalud('2');
	cliente1.setDireccion("Más allá 404");
	cliente1.setComuna("Valparaíso");
	cliente1.setEdad(40);
	
	
	//INVOCACIÓN DE MÉTODO toString() PARA CADA OBJETO
	System.out.println(cliente1.toString());
	System.out.println("\n");
	System.out.println(cliente2.toString());
	//System.out.println(cliente1.getrut());
	//System.out.println(cliente2);
	
	//DECLARACIÓN E INICIALIZACIÓN OBJETOS USUARIOS
	Usuarios usuario1 = new Usuarios("William Shakespeare", "26/04/1564", 12345678);
	Usuarios usuario2 = new Usuarios("Gabriel Garcia Marquez", "06/03/1927", 34567892);
	Usuarios usuario3 = new Usuarios("Dante Alighieri", "29/05/1265", 98345621);
	Usuarios usuario4 = new Usuarios("Mary Shelly", "30/08/1797", 12456389);
	Usuarios usuario5 = new Usuarios("Bram Stoker", "08/11/1847", 15672083);
	
	System.out.println(usuario1.toString() + "\n" + usuario2.toString() + "\n" + usuario3.toString() + "\n" + usuario4.toString()
	+ "\n" +usuario5.toString());
	
	}

}

package m4ABPRO5;

public class main13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Cliente cliente1 = new Cliente ();
	Cliente cliente2 = new Cliente (123,"pepe","papa","1234","mala",'1',"123hola","valpo",2);
	cliente1.setrut(1234);
	cliente1.setSistemaSalud('1');
	cliente1.setNombres("pepe");
	cliente1.setApellidos("flores");
	System.out.println(cliente1.getrut());
	System.out.println(cliente2);
	
	
	}

}

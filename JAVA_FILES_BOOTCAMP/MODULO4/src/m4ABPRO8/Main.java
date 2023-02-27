package m4ABPRO8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listado listado1 = new Listado();
		
		Usuario usuario1 = new Usuario("FULANITO DEL TAL", "14/12/1999", 123456);
		Usuario usuario2 = new Usuario("PEPITA LA PISTOLERA", "01/01/1995", 111111);
		Usuario usuario3 = new Usuario("CHUPETÍN TRUJILLO", "31/03/2000", 222222);
		Usuario usuario4 = new Usuario("JUAN PUEBLO LOCO", "15/06/1998", 333333);
		Usuario usuario5 = new Usuario("CARLOS DEL RODEO", "12/09/1996", 444444);
		
		listado1.agregarAsesoria(usuario1);
		listado1.agregarAsesoria(usuario2);
		listado1.agregarAsesoria(usuario3);
		listado1.agregarAsesoria(usuario4);
		listado1.agregarAsesoria(usuario5);
		
		Cliente cliente1 = new Cliente(123456,"ELVIS", "TECH", "123456", "AFP A", '1', "QUILLOTA #789", "QUILPUÉ", 25, "ELVISTEC", "29/02/2000");
		Cliente cliente2 = new Cliente(789123,"AITOR", "TILLA", "456123", "AFP B", '1', "PONIENTE #75", "LA CRUZ", 25, "AITOR", "9/01/1999");
		Cliente cliente3 = new Cliente(987654,"ARMANDO", "CASAS", "125984", "AFP C", '2', "ORIENTE #9", "VALPARAÍSO", 25, "ELVISTEC", "25/04/1998");
		Cliente cliente4 = new Cliente(321654,"ELBA", "SURERO", "78952", "AFP D", '1', "LIMACHE #72", "VIÑA DEL MAR", 25, "ELVISTEC", "08/12/1993");
		Cliente cliente5 = new Cliente(147852,"EVITA", "DOLORES", "584269", "AFP E", '2', "QUILPUÉ #23", "VIÑA DEL MAR", 25, "ELVISTEC", "15/10/1995");
		
		listado1.agregarAsesoria(cliente1);
		listado1.agregarAsesoria(cliente2);
		listado1.agregarAsesoria(cliente3);
		listado1.agregarAsesoria(cliente4);
		listado1.agregarAsesoria(cliente5);
		
		Profesional profesional1 = new Profesional("ING AGRÓNOMA", "12/12/1990", "ELZA", "14/02/1990", 123456);
		Profesional profesional2 = new Profesional("ING COMERCIAL", "02/04/1993", "ANA", "14/02/1990", 789456);
		Profesional profesional3 = new Profesional("ING MECÁNICA", "12/11/1998", "AITOR", "14/02/1990", 741258);
		Profesional profesional4 = new Profesional("ING QUIMICA", "23/10/1994", "ELBA", "14/02/1990", 963258);
		Profesional profesional5 = new Profesional("ING INDUSTRIAL", "14/02/1991", "EVITA", "14/02/1990", 852369);
		
		listado1.agregarAsesoria(profesional1);
		listado1.agregarAsesoria(profesional2);
		listado1.agregarAsesoria(profesional3);
		listado1.agregarAsesoria(profesional4);
		listado1.agregarAsesoria(profesional5);
		
		Administrativo administrativo1 = new Administrativo("CONSTRUCCIÓN", 6, "AITOR", "14/03/1998", 123456);
		Administrativo administrativo2 = new Administrativo("ADMINISTRACIÓN", 5, "ELVIS", "14/03/1998", 123456);
		Administrativo administrativo3 = new Administrativo("LOGÍSTICA", 3, "ARMANDO", "14/03/1998", 123456);
		Administrativo administrativo4 = new Administrativo("RECEPCIÓN", 2, "ELBA", "14/03/1998", 123456);
		Administrativo administrativo5 = new Administrativo("OPERACIONES", 1, "EVITA", "14/03/1998", 123456);
		
		listado1.agregarAsesoria(administrativo1);
		listado1.agregarAsesoria(administrativo2);
		listado1.agregarAsesoria(administrativo3);
		listado1.agregarAsesoria(administrativo4);
		listado1.agregarAsesoria(administrativo5);
		
		listado1.mostrarDatos();
		
	}

}

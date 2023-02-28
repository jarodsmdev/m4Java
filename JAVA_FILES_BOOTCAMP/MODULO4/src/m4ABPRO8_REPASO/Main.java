package m4ABPRO8_REPASO;

public class Main {

	public static void main(String[] args) {
		Listado listadoAsesorias = new Listado();
		
		Usuario usuario1 = new Usuario("JUAN", "29/02/1990", 123456);
		Cliente cliente1 = new Cliente(123456,"ELVIS", "TECH", "123456", "AFP A", '1', "QUILLOTA #789", "QUILPUÉ", 25, "ELVISTEC", "29/02/2000");
		Administrativo administrativo1 = new Administrativo("CONSTRUCCIÓN", 5, "AITOR", "14/03/1998", 123456);
		Profesional profesional1 = new Profesional("ING AGRÓNOMA", "12/12/1990", "ELZA", "14/02/1990", 123456);
		
		listadoAsesorias.agregarAsesoria(usuario1);
		listadoAsesorias.agregarAsesoria(cliente1);
		listadoAsesorias.agregarAsesoria(administrativo1);
		listadoAsesorias.agregarAsesoria(profesional1);
		
		listadoAsesorias.mostrarDatos();
		
		
	}

}

package m4ABPRO8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listado listado1 = new Listado();
		
		Cliente cliente1 = new Cliente("ELVIS TECH");
		Cliente cliente2 = new Cliente("ELVIS TECH");
		Cliente cliente3 = new Cliente("ELVIS TECH");
		Cliente cliente4 = new Cliente("ELVIS TECH");
		Cliente cliente5 = new Cliente("ELVIS TECH");
		
		listado1.agregarAsesorias(cliente1);
		listado1.agregarAsesorias(cliente2);
		listado1.agregarAsesorias(cliente3);
		listado1.agregarAsesorias(cliente4);
		listado1.agregarAsesorias(cliente5);
		
		Profesional profesional1 = new Profesional("ELZA PALLO", "ING AGRÓNOMA", "12/12/12");
		Profesional profesional2 = new Profesional("ELZA PALLO", "ING AGRÓNOMA", "12/12/12");
		Profesional profesional3 = new Profesional("ELZA PALLO", "ING AGRÓNOMA", "12/12/12");
		Profesional profesional4 = new Profesional("ELZA PALLO", "ING AGRÓNOMA", "12/12/12");
		Profesional profesional5 = new Profesional("ELZA PALLO", "ING AGRÓNOMA", "12/12/12");
		
		listado1.agregarAsesorias(profesional1);
		listado1.agregarAsesorias(profesional2);
		listado1.agregarAsesorias(profesional3);
		listado1.agregarAsesorias(profesional4);
		listado1.agregarAsesorias(profesional5);
		
		Administrativo administrativo1 = new Administrativo("ARMANDO CASAS", "CONSTRUCCIÓN", 5);
		Administrativo administrativo2 = new Administrativo("ARMANDO CASAS", "CONSTRUCCIÓN", 5);
		Administrativo administrativo3 = new Administrativo("ARMANDO CASAS", "CONSTRUCCIÓN", 5);
		Administrativo administrativo4 = new Administrativo("ARMANDO CASAS", "CONSTRUCCIÓN", 5);
		Administrativo administrativo5 = new Administrativo("ARMANDO CASAS", "CONSTRUCCIÓN", 5);
		
		listado1.agregarAsesorias(administrativo1);
		listado1.agregarAsesorias(administrativo2);
		listado1.agregarAsesorias(administrativo3);
		listado1.agregarAsesorias(administrativo4);
		listado1.agregarAsesorias(administrativo5);
		
		listado1.mostrarDatos();
		
	}

}

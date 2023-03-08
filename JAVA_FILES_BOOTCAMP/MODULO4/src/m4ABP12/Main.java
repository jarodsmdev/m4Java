package m4ABP12;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador trabajador1 = new Trabajador();
		
		trabajador1.setNombres("Armando");
		trabajador1.setApellidos("Casas");
		trabajador1.setRun("123456-7");
		trabajador1.setEdad(35);
		
		Trabajador trabajador2 = new Trabajador("Alam", "Brito", "456789-0", 36);
		trabajador2.agregarCargasFamiliares("4562114-5","Carga del T3", "Apellido Carga", trabajador2.getRun(),1, 36);
		
		Trabajador trabajador3 = new Trabajador("Elba", "Surero", "4562114-5", 25);
		trabajador3.agregarCargasFamiliares("4562114-5","Carga del T3", "Apellido Carga", trabajador3.getRun(),1, 36);
		trabajador3.agregarCargasFamiliares("45646-9","2 Carga del T3", "Apellido Carga 2", trabajador3.getRun(),1, 26);


		
		//System.out.println(carga1);
		
		System.out.println("------");
		System.out.println(trabajador1.toString());
		System.out.println("------");
		System.out.println(trabajador2.toString());
		trabajador2.mostrarCargasFamiliares();
		System.out.println("------");
		System.out.println(trabajador3.toString());
		trabajador3.mostrarCargasFamiliares();
		
	}
}

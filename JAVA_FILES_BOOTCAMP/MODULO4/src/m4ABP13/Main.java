package m4ABP13;


public class Main {

	public static void main(String[] args) {
		//CREAR 3 OBJETOS DE TIPO TRABAJADOR Y SETEE SUS DATOS USANDO MÉTODOS SETTER
		Trabajador trabajador1 = new Trabajador();
		
		trabajador1.setNombres("Armando");
		trabajador1.setApellidos("Casas");
		trabajador1.setRun("123456-7");
		trabajador1.setEdad(35);
		
		Trabajador trabajador2 = new Trabajador();
		trabajador2.setNombres("Aitor");
		trabajador2.setApellidos("Tilla");
		trabajador2.setRun("456123-8");
		trabajador2.setEdad(52);
		
		Trabajador trabajador3 = new Trabajador();
		trabajador3.setNombres("Armando");
		trabajador3.setApellidos("Bronca");
		trabajador3.setRun("789123-4");
		trabajador3.setEdad(47);
		
		// DESPLIEGUE POR PANTALLA LOS TRABAJADORES USANDO EL MÉTODO TOSTRING()
		System.out.println(trabajador1.toString());
		System.out.println("---");
		System.out.println(trabajador2.toString());
		System.out.println("---");
		System.out.println(trabajador3.toString());
		
		//5 OBJETOS TIPO CARGAFAMILIAR USANDO CONSTRUCTOR PARAMETRIZADO
		CargaFamiliar carga1 = new CargaFamiliar("741852-7", "Juan Carlos", "Bodoque", trabajador1.getRun(), 3, 25);
		CargaFamiliar carga2 = new CargaFamiliar("456123-8", "Juanín Juan", "Harry", trabajador2.getRun(), 2, 36);
		CargaFamiliar carga3 = new CargaFamiliar("789123-4", "Calcetín", "Con Rombos Man", trabajador3.getRun(), 2, 29);
		CargaFamiliar carga4 = new CargaFamiliar("741852-7", "Guaripolo", "SIN APELLIDO", trabajador1.getRun(), 1, 28);
		CargaFamiliar carga5 = new CargaFamiliar("741852-7", "Patana", "Tufillo", trabajador1.getRun(), 1, 31);
	
		//3 MODIFICACIÓNES USANDO SETTERS
		carga1.setEdad(26);
		carga2.setParentesco(3);
		trabajador3.setNombres("Amador");

		//DESPLIEGE DATOS DE CADA CARGA FAMILIAR USANDO MÉTODOS ACCESORES
		//DATOS CARGA 1
		System.out.println("\n>CARGA 1:\n" + "RUT: "+ carga1.getRunCarga() +"\nNOMBRE: " + carga1.getNombres() + "\nAPELLIDOS: " + carga1.getApellidos() + "\nRUT FAMILIAR: " + carga1.getRunFamiliar() + "\nPARENTESCO: " + carga1.mostrarParentesco() + "\nEdad: " + carga1.getEdad());

		System.out.println("\n>CARGA 2:\n" + "RUT: "+ carga2.getRunCarga() +"\nNOMBRE: " + carga2.getNombres() + "\nAPELLIDOS: " + carga2.getApellidos() + "\nRUT FAMILIAR: " + carga2.getRunFamiliar() + "\nPARENTESCO: " + carga2.mostrarParentesco() + "\nEdad: " + carga2.getEdad());

		System.out.println("\n>CARGA 3:\n" + "RUT: "+ carga3.getRunCarga() +"\nNOMBRE: " + carga3.getNombres() + "\nAPELLIDOS: " + carga3.getApellidos() + "\nRUT FAMILIAR: " + carga3.getRunFamiliar() + "\nPARENTESCO: " + carga3.mostrarParentesco() + "\nEdad: " + carga3.getEdad());

		System.out.println("\n>CARGA 4:\n" + "RUT: "+ carga4.getRunCarga() +"\nNOMBRE: " + carga4.getNombres() + "\nAPELLIDOS: " + carga4.getApellidos() + "\nRUT FAMILIAR: " + carga4.getRunFamiliar() + "\nPARENTESCO: " + carga4.mostrarParentesco() + "\nEdad: " + carga4.getEdad());

		System.out.println("\n>CARGA 5:\n" + "RUT: "+ carga5.getRunCarga() +"\nNOMBRE: " + carga5.getNombres() + "\nAPELLIDOS: " + carga5.getApellidos() + "\nRUT FAMILIAR: " + carga5.getRunFamiliar() + "\nPARENTESCO: " + carga5.mostrarParentesco() + "\nEdad: " + carga5.getEdad());
	}



}

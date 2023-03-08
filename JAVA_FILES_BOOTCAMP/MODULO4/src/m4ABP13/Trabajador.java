
/**
 * @author Leonel Briones Palacios
 */
package m4ABP13;

import java.util.ArrayList;

public class Trabajador {
	//ATRIBUTOS
	private String nombres;
	private String apellidos;
	private String run;
	private int edad;
	private ArrayList<CargaFamiliar> listaCargas = new ArrayList<CargaFamiliar>();
	
	
	//MÉTODOS ACCESORES Y MODIFICADORES
	public String getNombres() {
		return nombres;
	}
	
	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	
	public String apellidos() {
		return apellidos;
	}
	
	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getRun() {
		return run;
	}
	
	/**
	 * 
	 * @param run
	 */
	public void setRun(String run) {
		this.run = run;
	}
	
	public int getEdad() {
		return edad;
	}
	
	/**
	 * 
	 * @param edad
	 */
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//MÉTODO CONSTRUCTOR SIN ARGUMENTOS
	public Trabajador(){
		
	}
	
	public Trabajador(String nombres, String apellidos, String run, int edad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = run;
		this.edad = edad;
	}
	
	//MÉTODO CONSTRUCTOR PARAMETRIZADO
	/**
	 * 
	 * @param nombres
	 * @param apellidos
	 * @param rut
	 * @param edad
	 */
	public Trabajador(String nombres,
				String apellidos,
				String run, int edad,
				String runCarga,
				String nombreCarga,
				String apellidoCarga,
				int parentesco,
				int edadCarga) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.run = run;
		this.edad = edad;
		CargaFamiliar carga = new CargaFamiliar(run, nombreCarga, apellidoCarga, runCarga, parentesco, edadCarga);
		listaCargas.add(carga);
	}
	
	/**
	 * 
	 * @return nombre y apellido del trabajador
	 */
	public String nombreCompleto() {
		return nombres + " " + apellidos;
	}
	
	/**
	 * 
	 * @return int unicamente digitos del run
	 */
	public int descomponerRun() {
		return Integer.parseInt(run.split("-")[0]);
	}
	
	@Override
	public String toString() {
		return "Trabajador: " + nombreCompleto() + " | RUT sin Guión: " + descomponerRun() +"\nNombres: " + nombres + ", \nApellidos: " + apellidos +
				", \nRUT: " + run + ",\nEdad: " + edad ;
	}
	
	
	public void agregarCargasFamiliares(String runCarga,
										String nombres,
										String apellidos, 
										String runFamiliar,
										int parentesco,
										int edad) {
		CargaFamiliar carga = new CargaFamiliar(runCarga, nombres, apellidos, runFamiliar, parentesco, edad);
		listaCargas.add(carga);
	}
	
	public void mostrarCargasFamiliares() {
		for(CargaFamiliar carga: listaCargas) {
			carga.toString();
		}

	}
}

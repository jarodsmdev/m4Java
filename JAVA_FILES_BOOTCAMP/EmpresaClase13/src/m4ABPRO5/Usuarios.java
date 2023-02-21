package m4ABPRO5;

/**
 * @author Leonel Briones, Andrés Contreras, 
 * Priscila Carrillo, Kevin Moreno, Valentina Saldías
 * @version 21/02/2023
 */

public class Usuarios {
	/** Creacion de la clase USUARIOS */
	private String nombreUsuario;
	/** Se definen los atributos de la clase */
	private String fechaNacimiento;
	private int Run;

	public Usuarios(){} /** metodo constructor vacio */

	/**
	 * Método Constructor que recibe todos los atributos de la clase como parametros
	 */
	public Usuarios(String nombreUsuario, String fechaNacimiento, int Run) {
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.Run = Run;
	}

	/** Aqui se crean los setters de los atributos de la clase */
	/**
	 * 
	 * @param nombreUsuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * 
	 * @param Run
	 */
	public void setRun(int Run) {
		this.Run = Run;
	}

	/** Aqui se crean los getters de los atributos de la clase */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public int getRun() {
		return Run;
	}

	@Override
	public String toString() {
		return "\nUsuario:\n" + nombreUsuario + "\n" + fechaNacimiento + "\n" + Run;
	}
}

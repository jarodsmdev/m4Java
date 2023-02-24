package m4ABPRO7;

/**
 * @author Leonel Briones, Priscila Carrillo,
 * Andrés Contreras, Kevin Moreno, Valentina Saldías
 * @version 21/02/2023
 */

/** Creacion de la clase USUARIOS */
public class Usuario {
	/** Se definen los atributos de la clase */
	private String nombreUsuario;
	private String fechaNacimiento;
	private Cliente cliente;


	/** metodo constructor vacio */
	public Usuario(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Método Constructor que recibe todos los atributos de la clase como parametros
	 */
	public Usuario(String nombreUsuario, String fechaNacimiento, Cliente cliente) {
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.cliente = cliente;
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

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/** Aqui se crean los getters de los atributos de la clase */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String mostrarEdad() {
		return "El usuario tiene: " + cliente.getEdad() + " años.";

	}

	@Override
	public String toString() {
		return "\nUsuario:\n" + nombreUsuario + "\n" + fechaNacimiento + "\n" + mostrarEdad();
	}
	
}
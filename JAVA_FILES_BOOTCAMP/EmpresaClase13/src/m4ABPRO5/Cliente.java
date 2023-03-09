/**
 * @author Leonel Briones, Andrés Contreras, 
 * Priscila Carrillo, Kevin Moreno, Valentina Saldías
 * @version 21/02/2023
 */

package m4ABPRO5;

public class Cliente {
	

	// ATRIBUTOS
	
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private char sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;

	// Método Contructor
	
	public Cliente() {
	};
/**
 * Constructor que recibe los atributos de la clase Clientes
 * @param rut
 * @param nombres
 * @param apellidos
 * @param telefono
 * @param afp
 * @param sistemaSalud
 * @param direccion
 * @param comuna
 * @param edad
 */
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, char sistemaSalud,
			String direccion, String comuna, int edad) {
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
// cierre del constructor
	}
/**
 * 
 * @return retorna rut.
 */
	public int getrut() { 
		return this.rut;
	}
	
	/**
	 * 
	 * @param rut
	 */
	public void setrut(int rut) {
		this.rut = rut;
	}
	
	public String getNombres() {
		return this.nombres;
	}
	
	/**
	 * 
	 * @param nombres
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	
	/**
	 * 
	 * @param apellidos
	 */
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	public String getTelefono() {
		return this.telefono;
	}
	
	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono=telefono;
	}
	
	public String getAfp() {
		return this.afp;
	}
	
	/**
	 * 
	 * @param afp
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}
	
	public char getSistemaSalud () {
		return sistemaSalud;
	}
	
	/**
	 * 
	 * @param sistemaSalud
	 */
	public void setSistemaSalud (char sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	
	public String getComuna() {
		return this.comuna;
	}
	
	/**
	 * 
	 * @param comuna
	 */
	public void setComuna (String comuna) {
		this.comuna = comuna;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Cliente: \nrut: " + rut + ", \nnombres: " + nombres +
				", \napellidos: " + apellidos + ", \ntelefono: " + telefono +
				", \nafp: " + afp + ", \nsistemaSalud: " + sistemaSalud +
				", \ndireccion: " + direccion + ", \ncomuna: " + comuna +
				", \nedad: " + edad;
	}

}

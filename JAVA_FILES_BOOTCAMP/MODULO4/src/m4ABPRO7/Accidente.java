package m4ABPRO7;
/**
 * @author Leonel Briones, Priscila Carrillo,
 * Andrés Contreras, Kevin Moreno, Valentina Saldías
 * @version 24/02/2023
 */
public class Accidente {
	private int idNumeroAccidente; 
	private String dia; 
	private String hora; 
	private String lugar; 
	private String origen; 
	private String consecuencias; 
	
	/** metodo constructor vacio */
	public Accidente() {
		
	}
	/** metodo constructor con atributos como parametros*/
	public Accidente(int idNumeroAccidente, String dia, String hora, String lugar, String origen, String consecuencias) {
		this.idNumeroAccidente = idNumeroAccidente;
		this.dia = dia ;
		this.hora = hora;
		this.lugar = lugar; 
		this.origen = origen; 
		this.consecuencias = consecuencias;
	}
	
	/** @param ID numero accidente */
	public void setIdNumeroAccidente(int idNumeroAccidente) {
		this.idNumeroAccidente = idNumeroAccidente;
	}
	public int getIdNumeroAccidente(int idNumeroAccidente) {
		return idNumeroAccidente;
	}
	
	/** @param dia*/
	public void setDia(String dia) {
		this.dia = dia; 
	}
	public String getDia(String dia) {
		return dia; 
	}
	
	/** @param hora*/
	public void setHora(String hora) {
		this.hora = hora; 
	}
	public String getHora(String hora) {
		return hora; 
	}
	
	/** @param lugar*/
	public void setLugar(String lugar) {
		this.lugar = lugar; 
	}
	public String getLugar(String lugar) {
		return lugar; 
	}
	
	/** @param origen*/
	public void setOrigen(String origen) {
		this.origen = origen; 
	}
	public String getOrigen(String origen) {
		return origen;
	}
	
	/** @param consecuencias*/
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	public String getConsecuencias(String consecuencias) {
		return consecuencias;
	}
}

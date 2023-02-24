package m4ABPRO7;
/**
 * @author Leonel Briones, Priscila Carrillo,
 * Andrés Contreras, Kevin Moreno, Valentina Saldías
 * @version 24/02/2023
 */
public class Revision {
	private int idRevision;
	private String nombreRevision; 
	private String detallesRevisar; 
	private char estado; 
	
	/** metodo constructor sin parametros*/
	public Revision() {}
	
	/** metodo constructor con los atributos como parametros*/
	public Revision(int idRevision, String nombreRevision, String detallesRevisar, char estado) {
		this.idRevision = idRevision;
		this.nombreRevision = nombreRevision;
		this.detallesRevisar = detallesRevisar;
		this.estado = estado; 
	}
	
	/** @param ID revision*/
	public void setIdRevision(int IdRevision) {
		this.idRevision = idRevision;
	}
	public int getIdRevision(int IdRevision ) {
		return idRevision;
	}
	
	/** @param nombre alusivo a la revision*/
	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	public String getNombreRevision(String nombreRevision) {
		return nombreRevision;
	}
	
	/** @param  detalles para revisar*/
	public void setDetallesRevisar(String detallesRevisar) {
		this.detallesRevisar = detallesRevisar;
	}
	public String getDetallesRevisar(String detallesRevisar) {
		return detallesRevisar;
	}
	
	/** @param  estado 1(sin problemas) 2(con observaciones) 3(no aprueba)*/
	public void setEstado(char estado) {
		this.estado = estado; 
	}
	public char getEstado(char estado) {
		return estado;
	}
	
	public String mostrarEstado(char estado) {
		String mensaje;
		switch (estado) {
		case 1:
			mensaje = "Sin problemas";
			break;
		case 2:
			mensaje = "Con observaciones";
			break;
		case 3:
			mensaje = "no aprueba";
			break;
		default:
			mensaje = "NO DEBERÍA MOSTRAR ESTE MENSAJE";
			break;
		}
		return mensaje;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", nombreRevision=" + nombreRevision + ", detallesRevisar="
				+ detallesRevisar + ", estado=" + estado + "]";
	}
	
	
}


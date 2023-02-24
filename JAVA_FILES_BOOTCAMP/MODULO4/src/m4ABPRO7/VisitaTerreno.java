package m4ABPRO7;

import java.util.ArrayList;

/**
 * @author Leonel Briones, Priscila Carrillo,
 * Andrés Contreras, Kevin Moreno, Valentina Saldías
 * @version 24/02/2023
 */
public class VisitaTerreno {
	private int idVisitaTerreno;
	private String dia;
	private String hora; 
	private String lugar;
	private String comentarios;
	private ArrayList<Revision> revisiones;
	
	/** MÉTODO CONSTRUCTOR PREDETERMINADO*/
	public VisitaTerreno(ArrayList<Revision> revisiones) {
		this.revisiones = revisiones;
	}
	
	/** MÉTODO CONSTRUCTOR PARAMETRIZADO*/
	public VisitaTerreno(int idVisitaTerreno, String dia, String hora, String lugar, String comentarios,
			ArrayList<Revision> revisiones) {
		this.idVisitaTerreno = idVisitaTerreno;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.revisiones = revisiones;
	}
	
	/** @param ID visita terreno*/
	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	
	public int getIdVisitaTerreno(int idVisitaTerreno) {
		return idVisitaTerreno;
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
	
	/** @param comentarios*/
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios; 
	}
	public String getComentarios(String comentarios) {
		return comentarios;
	}
	
	public ArrayList<Revision> getRevisiones() {
		return revisiones;
	}
	
	public void setRevisiones(ArrayList<Revision> revisiones) {
		this.revisiones = revisiones;
	}
	
}

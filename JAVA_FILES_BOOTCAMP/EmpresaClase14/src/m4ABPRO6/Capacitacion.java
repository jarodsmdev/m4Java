package m4ABPRO6;

import java.util.ArrayList;

public class Capacitacion {
	
	//ATRIBUTOS
	private int identificador;
	//private int rut;
	private String dia;
	private String hora;
	private String lugar;
	private int duracion;
	private int cantidadAsistentes;
	private ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
	
	//MÉTODOS CONSTRUCTORES
	public Capacitacion() {}
	
	public Capacitacion(int identificador, String dia, String hora, String lugar, int duracion) {
		this.identificador = identificador;
		//this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = listaUsuarios.size();
	}

	@Override
	public String toString() {
		return "\nCapacitacion: \nIdentificador: " + identificador + ", \nDia: " + dia + ",\nHora: " + hora
				+ ", \nLugar: " + lugar + ", \nDuración: " + duracion + ", \nCantidad Asistentes: " + cantidadAsistentes + "\n" + mostrarDetalle();
	}

	//MÉTODOS ACCESORES Y MUTADORES

	public int getIdentificador() {return identificador;}

	public void setIdentificador(int identificador) {this.identificador = identificador;}

	public String getDia() {return dia;}

	public void setDia(String dia) {this.dia = dia;}

	public String getHora() {return hora;}

	public void setHora(String hora) {this.hora = hora;}

	public String getLugar() {return lugar;}

	public void setLugar(String lugar) {this.lugar = lugar;}

	public int getDuracion() {return duracion;}

	public void setDuracion(int duracion) {this.duracion = duracion;}

	public int getCantidadAsistentes() {return cantidadAsistentes;}
	
	public void agregarAsistentes(Usuarios usuario) {
		getUsuarios().add(usuario);
		cantidadAsistentes = listaUsuarios.size();
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	//Relación de agregación con clientes 
	public ArrayList<Usuarios> getUsuarios(){
		return listaUsuarios;
	}
	
	public String mostrarDetalle() {
		return "La capacitación será en " + lugar + " a las " + hora + " de día " + dia + ", y durará " + duracion + " minutos.";
	}
	
}

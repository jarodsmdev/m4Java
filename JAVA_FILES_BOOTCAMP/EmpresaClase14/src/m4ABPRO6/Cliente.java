package m4ABPRO6;
import java.util.Set;

import java.util.ArrayList;

public class Cliente {
	
	//ATRIBUTOS
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private char sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	private int cantCapacitaciones = 0; 
	private ArrayList<Capacitacion> listaCapacitaciones = new ArrayList<Capacitacion>();
	
	//MÉTODO CONSTRUCTORES
	public Cliente() {

	}
	
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, char sistemaSalud, String direccion, String comuna, int edad) {
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.cantCapacitaciones = listaCapacitaciones.size();
	}

	@Override
	public String toString() {
		return "\nCliente: \nRUT: " + rut + ", \nNombres: " + nombres + ", \nApellidos: " + apellidos + ",\nTelefono: " + telefono + ", \nAFP: " + obtenerSistemaSalud() + ", \nSistema Salud: " + sistemaSalud + ", \nDirección: " + direccion + ", \nComuna: " + comuna	+ ", \nEdad: " + edad + ", \nCantidad de Capacitaciones: " + cantCapacitaciones;
	}
	
	//MÉTODOS ACCESORES Y MUTADORES
	public int getRut() {return rut;}
	
	public void setRut(int rut) {this.rut = rut;}
	
	public String getNombres() {return nombres;}
	
	public void setNombres(String nombres) {this.nombres = nombres;}
	
	public String getApellidos() {return apellidos;}
	
	public void setApellidos(String apellidos) {this.apellidos = apellidos;}
	
	public String getTelefono() { return telefono;}	
	public void setTelefono(String telefono) {this.telefono = telefono;}
	
	public String getAfp() {return afp;}
	
	public void setAfp(String afp) {this.afp = afp;}
	
	public char getSistemaSalud() {return sistemaSalud;}
	
	public void setSistemaSalud(char sistemaSalud) {this.sistemaSalud = sistemaSalud;}
	
	public String getDireccion() {return direccion;}
	
	public void setDireccion(String direccion) {this.direccion = direccion;}
	
	public String getComuna() {return comuna;}
	
	public void setComuna(String comuna) {this.comuna = comuna;}
	
	public int getEdad() {return edad;}
	
	public void setEdad(int edad) {this.edad = edad;}
	
	public void setCantCapacitaciones(int cantCapacitaciones) {
		this.cantCapacitaciones = cantCapacitaciones;
	}
	public int getCantCapacitaciones(int cantCapacitaciones) {
		return cantCapacitaciones;
	}
	//
	public String obtenerNombre() {
		return nombres + " " + apellidos;
	}
	
	public String obtenerSistemaSalud() {
		if(sistemaSalud == '1') {
			return "FONASA";
		}
		return "ISAPRE";
	}
	public void agregarCapacitaciones(Capacitacion nuevaCapacitacion) {
		if (true) {
			listaCapacitaciones.add(nuevaCapacitacion);
			cantCapacitaciones++;
		}
		System.out.println("El cliente ha tomado " + listaCapacitaciones.size() + " capacitaciones.");
	}

}

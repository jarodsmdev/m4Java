package m4ABPRO7;

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
	ArrayList<Capacitacion>listaCapacitaciones = new ArrayList<Capacitacion>();
	ArrayList<Accidente> accidentes = new ArrayList<Accidente>();
	ArrayList<VisitaTerreno> visitasTerreno = new ArrayList<VisitaTerreno>();

	
	//MÉTODO CONSTRUCTOR PREDETERMINADO
	public Cliente(ArrayList<VisitaTerreno> visitasTerreno) {
		this.visitasTerreno = visitasTerreno;
	}
	
	//MÉTODO CONSTRUCTOR PARAMETRIZADO
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, char sistemaSalud,
			String direccion, String comuna, int edad, ArrayList<Capacitacion> listaCapacitaciones,
			ArrayList<Accidente> accidentes, ArrayList<VisitaTerreno> visitaTerrenos) {
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.listaCapacitaciones = listaCapacitaciones;
		this.accidentes = accidentes;
		this.visitasTerreno = visitaTerrenos;
	}




	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", edad=" + edad + ", cantCapacitaciones=" + cantCapacitaciones + ", listaCapacitaciones="
				+ listaCapacitaciones + ", accidentes=" + accidentes + ", visitasTerreno=" + visitasTerreno + "]";
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

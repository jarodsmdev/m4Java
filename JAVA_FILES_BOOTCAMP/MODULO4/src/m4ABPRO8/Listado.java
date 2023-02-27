package m4ABPRO8;

import java.util.ArrayList;

public class Listado{
	ArrayList<Asesoria>listadoAsesorias = new ArrayList<Asesoria>();

	public Listado() {
	}
	
	public void agregarAsesorias(Asesoria objAsesoria) {
		listadoAsesorias.add(objAsesoria);
	}
	
	public void mostrarDatos() {
		for(Asesoria elemento: listadoAsesorias) {
			elemento.analizarUsuario();
		}
	}
	

}

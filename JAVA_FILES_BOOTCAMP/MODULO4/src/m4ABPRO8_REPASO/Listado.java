package m4ABPRO8_REPASO;

import java.util.ArrayList;

public class Listado {
	ArrayList<Asesoria>listaAsesoria = new ArrayList<Asesoria>(); 
	
	public void agregarAsesoria(Asesoria asesoria) {
		listaAsesoria.add(asesoria);
	}
	
	public void mostrarDatos() {
		for(Asesoria asesoria: listaAsesoria) {
			asesoria.analizarUsuario();
		}
	}
}

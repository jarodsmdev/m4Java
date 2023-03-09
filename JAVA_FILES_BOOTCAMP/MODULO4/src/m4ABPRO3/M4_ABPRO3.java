package m4ABPRO3;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
import java.util.Collections;

import javax.swing.JOptionPane;

public class M4_ABPRO3 {
	static int cantAsistentes;
	static String[] arrDatosCapacitacion = new String[5]; // DECLARA ARRAY CON LOS DATOS DE LA CAPACITACION

	public static void main(String[] args) {

		capturarDatosCapacitacion();
		ArrayList<Integer> ArrNotasAsistentes = ingresoAsistentes(); // nombre y nota
		mostrarDatos();
		calcularPromedio(ArrNotasAsistentes);
		calcularMax(arryNotas);

	}

	public static void capturarDatosCapacitacion() {
		// PIDE LOS DATOS EN PANTALLA AL USUARIO CON UN INPUT/PROMPT

		// VALIDACION DE DIA NO VACIO
		String valdia = "";
		do {
			valdia = JOptionPane.showInputDialog("Ingrese el dia");
			if (valdia == null) {
				System.out.println("Ha presionado Cancelar");
				System.exit(0);
			} else if (valdia.length() == 0) {
				System.out.println("[ERROR] no puede estar vacío");
			} else {
				arrDatosCapacitacion[0] = valdia;

			}
		} while (valdia.length() == 0);

		// VALIDA FORMATO HORA, VACIO, Y NULO
		String horaCapacitacion = "";
		do {
			horaCapacitacion = JOptionPane.showInputDialog("Ingrese el hora (HH:MM)");
			if (horaCapacitacion == null) {
				System.out.println("Ha presionado Cancelar");
				System.exit(0);
			} else if (horaCapacitacion.length() == 0) {
				System.out.println("[ERROR] No puede estar vacío.");
			} else if (horaCapacitacion.matches("^([0-1][0-9]|2[0-3]):[0-5][0-9]$")) {
				arrDatosCapacitacion[1] = horaCapacitacion;
			} else {
				System.out.println("[ERROR] El formato no es correcto");
			}
		} while (horaCapacitacion.length() == 0 || !horaCapacitacion.matches("^([0-1][0-9]|2[0-3]):[0-5][0-9]$")
				|| horaCapacitacion == null);

		// VALIDA LUGAR NO ESTE VACIO
		String valLugar = "";
		do {
			valLugar = JOptionPane.showInputDialog("Ingrese el lugar");
			if (valLugar == null) {
				System.out.println("Ha presionado Cancelar");
				System.exit(0);
			} else if (valLugar.length() == 0) {
				System.out.println("no puede estar vacio");
			} else {
				arrDatosCapacitacion[2] = valLugar;

			}

		} while (valLugar.length() == 0);

		// VALIDACION DURACION EN MINUTOS
		String duracionMinutos = "";
		do {

			duracionMinutos = JOptionPane.showInputDialog("Ingrese la duracion");
			if (duracionMinutos == null) {
				System.out.println("Ha presionado Cancelar");
				System.exit(0);
			} else if (isNumeric(duracionMinutos)) {
				arrDatosCapacitacion[3] = duracionMinutos;
			} else {
				System.out.println("[ERROR] Favor ingrese sólo números");
			}
		} while (isNumeric(duracionMinutos) == false);

		// VALIDA CANTIDAD ASISTENTES
		String validasis = "";
		do {
			validasis = JOptionPane.showInputDialog("Ingrese cantidad asistentes");
			if (validasis == null) {
				System.out.println("Ha presionado Cancelar");
				System.exit(0);
			}else if(!isNumeric(validasis) || validasis.trim().length()== 0){
				System.out.println("[ERROR] Sólo caraceres numéricos");
			} else if (Integer.parseInt(validasis) == 0 || validasis.trim().length()==0) {
				System.out.println("no puede ingresar 0");
			} else if (isNumeric(validasis) && Integer.parseInt(validasis) > 0) {
				arrDatosCapacitacion[4] = validasis;
				break;
			} else {
				System.out.println("Error: ponga solo numeros naturales!");
			}
		} while (!isNumeric(validasis) || Integer.parseInt(validasis)==0);
	}

	// FUNCIÓN DE INGRESO DE ASISTENTES
	static ArrayList<Integer> arryNotas = new ArrayList<Integer>();

	public static ArrayList<Integer> ingresoAsistentes() {
		cantAsistentes = Integer.parseInt(arrDatosCapacitacion[4]);
		String capturaNota = "";
		String capturaNombre = "";
		int contador = 1;

		ArrayList<String> arrNombres = new ArrayList<String>();

		// CALIFICACION

		for (int i = 0; i < cantAsistentes; i++) {

			// CAPTURA DE NOMBRE
			do {
				capturaNombre = JOptionPane.showInputDialog("Ingrese nombre del Asistente #" + contador);
				if (capturaNombre == null) {
					System.out.println("Se ha presionado cancelar");
					System.exit(0);// CIERRO LA EJECUCIÓN
				} else if (capturaNombre.length() == 0) {
					System.out.println("[ERROR] No puede estar vacío");
				} else {
					// NOMBRE VÁLIDO
					arrNombres.add(capturaNombre);
				}
			} while (capturaNombre.length() == 0 || capturaNota == null);

			// CAPTURA DE NOTAS
			do {
				capturaNota = JOptionPane
						.showInputDialog("Ingrese nota del Asistente #" + contador + "\nrango [1 - 7] ");
				// VALOR INVÁLIDO
				if (capturaNota == null) {
					System.out.println("Se ha presionado cancelar ");
					System.exit(0);// CIERRO LA EJECUCIÓN
				} else if (capturaNota.length() == 0) {
					System.out.println("[ERROR] No puede estar vacío");
				} else if (!capturaNota.matches("^[1-7]$")) {
					System.out.println("[ERROR] Valor debe ser 1 - 7");
				} else {
					// VALOR VÁLIDO
					// System.out.println(capturaNota);
					arryNotas.add(Integer.parseInt(capturaNota));

					contador++;
				}
			} while (!capturaNota.matches("^[1-7]$") || capturaNota.length() == 0 || capturaNota == null);

		}
		return arryNotas;

	}

	// FUNCION PARA CALCULAR PROMEDIO
	public static double calcularPromedio(ArrayList<Integer> arryNotas) {
		int totalSuma = 0;
		for (int i = 0; i < cantAsistentes; i++) {
			Integer tmpNota = arryNotas.get(i);
			totalSuma += (tmpNota);
		}
		// System.out.println(totalSuma); //DEBUG
		double promedio = totalSuma / cantAsistentes;
		System.out.println("PROMEDIO: " + promedio);
		return promedio;

	}

	private static void mostrarDatos() {
		// DECLARACIÓN DE ARRAY PARA ESTABLECER LOS MENSAJES
		String[] mensajes = new String[5];

		// INICIALIZAR ARRAY CON LOS MENSAJES
		mensajes[0] = "Día Capacitación: ";
		mensajes[1] = "Hora acordada: ";
		mensajes[2] = "Lugar Seleccionado: ";
		mensajes[3] = "Duración en minutos: ";
		mensajes[4] = "Cantidad Asistentes: ";

		// MOSTRAR DATOS EN CONSOLA
		for (int i = 0; i < mensajes.length; i++) {
			System.out.print(mensajes[i] + arrDatosCapacitacion[i] + "\n");

		}

	}

	public static void calcularMax(ArrayList<Integer> maxNota) {
		System.out.println("La nota maxima fue: " + Collections.max(maxNota));
		System.out.println("La nota minima fue: " + Collections.min(maxNota));
	}

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}

	}
}

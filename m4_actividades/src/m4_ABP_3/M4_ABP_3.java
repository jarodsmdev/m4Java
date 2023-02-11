package m4_ABP_3;
import java.util.Scanner;

public class M4_ABP_3 {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int i = 0;
	boolean leerManual = false;
	boolean cuidadoSeguridad = false;
	String capturador = "";
	
	Scanner sc = new Scanner(System.in);
	
	// VALIDAR TRABAJADOR ACCIDENTADO
	i = 0; capturador = "";
	do {
		ShowMessage("[" + i +"]¿El trabajador cuida los procedimientos de seguridad? \n[Responda 'si' o 'no']\n>");
		capturador = sc.nextLine(); //captura texto en consola
		capturador = capturador.toLowerCase().trim(); //transforma texto a minusculas y quita espacios al inicio y fin del string
		cuidadoSeguridad = ValidarCondicion(capturador);
		i++;
	}while(capturador.length()==0 || (!capturador.equals("si") && !capturador.equals("no")));
	
	// VALIDAR LECTURA DEL MANUAL INTERNO DE SEGURIDAD
	i = 0; capturador = ""; //RESETAR VARIABLES AUXILIARES
	do {
		ShowMessage("[" + i +"]¿El trabajador ha leído el manual interno de seguridad? \n[Responda 'si' o 'no']\n");
		capturador = sc.nextLine();
		capturador = capturador.toLowerCase().trim();
		leerManual = ValidarCondicion(capturador);
		i++;
	}while(capturador.length()==0 || (!capturador.equals("si") && !capturador.equals("no")));
	
	
	// RESOLUCIÓN EN BASE A LAS RESPUESTAS ANTERIORES
	if (cuidadoSeguridad == false || leerManual == false) {
	
		ShowMessage("Existen grandes probabilidades de que sufra un accidente." );
		
	} else {
		ShowMessage("Gracias por seguir las normas de seguridad");
	}
	sc.close();
	ShowMessage("**FIN PROGRAMA**");
	}
	
	//FUNCIÓN PARA MOSTRAR MENSAJE POR CONSOLA
	private static String ShowMessage(String message) {
		System.out.println(message);
		return message;
	}
	
	//FUNCION PARA INCIALIZAR LAS VARIABLES
	private static boolean ValidarCondicion(String capturador) {
		boolean variable;
		if(capturador.equals("si")) {
			variable = true;
		}else {
			variable = false;
		}
		return variable;
	} 

	//FUNCIÓN PARA CAPTURAR TEXTO POR CONSOLA
//	private static String CaptureText(String capturador, Scanner scanner) {
//		capturador = "";
//		capturador = scanner.nextLine();
//		capturador = capturador.toLowerCase().trim();
//		return capturador;
//	}
	
	
}
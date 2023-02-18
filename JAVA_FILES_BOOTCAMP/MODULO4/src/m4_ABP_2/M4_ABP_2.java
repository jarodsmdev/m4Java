package m4_ABP_2;
import java.util.Scanner;

public class M4_ABP_2 {
    public static void main(String[] args) {

        Scanner scanText = new Scanner(System.in); //Instancia de clase Scanner
        boolean out_country = false; //Declaración e inicialización de out_country
        boolean close_infections = false; // Declaración e inicialización de close_infections
        int pcr_result = 0; // Declaración de variable (SE CALCULARÁ CON MATH.RANDOM)
        String textCapture = ""; //Declaración e inicializacion de textCapture
        
        
        ShowMessage("**Inicio Programa**");

        //bloque si ha salido del pais
        do{
            ShowMessage("¿Usted ha salido del país?"); //Muestra mensaje en pantalla
            textCapture = scanText.nextLine().trim().toLowerCase();
            if(textCapture.equals("si")){
                out_country = true;
            }else{
                out_country = false;
            }
        }while(textCapture.length() == 0 || (!textCapture.equals("si") && !textCapture.equals("no")));

        // SALIÓ DEL PAÍS
        if(out_country){
            ShowMessage("Debe estar 14 días en observación");
            do{
                ShowMessage("Con un examen de PCR NEGATIVO, puede volver a la normalidad, sin estar en observación\n>¿Desea realizarlo?");
                textCapture = scanText.nextLine().trim().toLowerCase();
                if(textCapture.equals("si")){
                    close_infections = true;
                }else{
                    close_infections = false;
                }
            }while(textCapture.length() == 0 || (!textCapture.equals("si") && !textCapture.equals("no")));

            //DESEA HACER PCR
            if(textCapture.equals("si")){
                //SIMULA UN RESULTADO PCR 50% PROBABILIDADES ENTRE 0 Y 1
                pcr_result = (int)(Math.random()*2);
        
                //Valida resultado de pcr_result POSITIVO/NEGATIVO
                if(pcr_result == 1){
                    //RESULTADO POSITIVO
                    ShowMessage("\n+-----------------------------------+\n| Resultado PCR: [+] POSITIVO [+]   |\n| DEBE HACER CUARENTENA OBLIGATORIA |\n+-----------------------------------+");
                }else{
                    //RESULTADO NEGATIVO
                    ShowMessage("\n+---------------------------------+\n| Resultado PCR: [-] NEGATIVO [-] |\n| PUEDE VOLVER A LA NORMALIDAD    |\n+---------------------------------+");
                }
            }else{
                //USUARIO NO DESEA HACER PCR
                ShowMessage("***Debe hacer cuarentena OBLIGATORIA por 14 días.***");
            };

        //NO SALIÓ DEL PAIS
        }else{
            // PREGUNTAR POR CONTACTO ESTRECHO
            do{
                //MUESTRA PREGUNTA EN CONSOLA
                ShowMessage("¿Ha tenido contacto con alguien que haya estado con síntomas?");
                //CAPTURA RESPUESTA DEL USUARIO POR CONSOLA
                textCapture = scanText.nextLine().trim().toLowerCase();
                // VALIDA RESPUESTA SI O NO Y MODIFICA LA VARIABLE close_infections TRUE O FALSE SEGUN CORRESPONDA
                if(textCapture.equals("si")){
                    close_infections = true;
                }else{
                    close_infections = false;
                };
            //MANIENE EL BUCLE MIENTRAS LA RESPUESTA VACÍA, O SEA DISTINTA A SI O NO    
            }while(textCapture.length()== 0 || (!textCapture.equals("si") && !textCapture.equals("no")));
            
            //CONDICIONAL RESPUESTA SI O NO
            if (close_infections == true){
                //CASO DE TENER CONTACTO ESTRECHO
                ShowMessage("Debe realizarse examen PCR para volver a la normalidad.");
            }else{
                //CASO DE NO TENER CONTACTO ESRECHO
                ShowMessage("No es necesario hacer cuarentena, ni realizar examen PCR.");
            };
        }
        // ShowMessage("OUT COUNTRY : " + out_country);
        // ShowMessage("CLOSE INFECTION : " + close_infections);
        // ShowMessage("PCR RESULT : " + pcr_result);
        ShowMessage("CLOSE INFECTION : " + close_infections);
        ShowMessage("**Fin Programa**");
        //CERRAR EL OBJETO SCANTEXT DE TIPO SCANNER
        scanText.close();
    }

    // FUNCIÓN PARA MOSTRAR MENSAJE EN PANTALLA (STRING)
    private static String ShowMessage(String message){
        System.out.println(message);
        return message;
    }
    
    
}
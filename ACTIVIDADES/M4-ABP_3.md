# M4-ABP_3

---

## Planteamiento de Problema

Una compañía de seguros ha elaborado una sesión de lluvia de ideas, en las que se han planteado ciertas observaciones que se desea analizar prontamente. A fin de ordenar las ideas, se ha solicitado:

1. Formalizar la frase.
2. ¿Es posible representar el resultado anterior como un algoritm? De ser posible, transfórmelo a código Java atomizando las frases y asignando un valor de verdad; en caso contrario, justifique por qué no se puede hacer.

**La frase en cuestión es:**
*“Si un trabajador no cuida los procedimientos de seguridad, ocurrirá un accidente. Si el trabajador no lee el manual de seguridad interno sucedería lo mismo. El trabajador no ha sufrido incidentes.*
*De ahí concluimos que ha seguido todos los procedimientos de seguridad, y ha leído el manual de seguridad interno”.*

    P : El trabajador cuida los procedimientos de seguridad
    Q : El trabajador lee el manual de seguridad interno
    R : Ocurre un accidente

    Entonces, la frase se puede expresar como:

    (┐P v ┐Q) → R ^ ┐R → (P ^ Q)

Se interpreta de la siguiente manera:

1. Si el trabajador no cuida los procedimientos de seguridad o no lee el manual de seguridad interno (┐P v ┐Q), entonces ocurrirá un accidente (R).
2. Si el trabajador no ha sufrido incidentes (┐R), entonces ha seguido todos los procedimientos de seguridad y ha leido el manual de seguridad interno (P ^ Q).

.

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
    
        //FUNCION PARA LAS CONDICIONAES
        private static boolean ValidarCondicion(String capturador) {
            boolean variable;
            if(capturador.equals("si")) {
                variable = true;
            }else {
                variable = false;
            }
            return variable;
        } 

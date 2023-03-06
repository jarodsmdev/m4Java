package m4POOdiagnostico;

import java.util.ArrayList;
import java.util.Scanner;

public class Huevo extends Tablero{
    int fila;
    int columna;
    int puntaje;

    public Huevo(){}

    public int getFila(){
        return fila;
    }
    public void setFila(int coorX){
        fila = coorX;
    }
    public int getColumna(){
        return columna;
    }
    public void setColumna(int coorY){
        columna = coorY;
    }
    
    static ArrayList<Integer>puntajeObtenido = new ArrayList<Integer>();

    
    public static void lanzarHuevo(){
        System.out.println("\nEs tu turno de lanzar huevos");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa la coordenada X: ");
            x = input.nextInt();
            System.out.print("Ingresa la coordenada Y: ");
            y = input.nextInt();

            if ((x >= 0 && x < 15) && (y >= 0 && y < 15)) //intento valido
            {
                if (matrix[x][y] == 'T') //si es que le pega a un Trupalla
                {
                    System.out.println("Boom! Le achuntaste a un Trupalla");
                    matrix[x][y] = 'H'; //Hit mark
                    puntajeObtenido.add(1);
                }
                else if(matrix[x][y] == 'C') {
                	System.out.println("BOOM! le diste a un Caguano");
                	matrix[x][y] = 'H';
                	puntajeObtenido.add(2);
                }
                else if(matrix[x][y] == 'K') {
                	System.out.println("POW! le diste a una Kromi");
                	puntajeObtenido.add(3);
                }
                }
                else if (matrix[x][y] == ' ' || matrix[x][y] == 'H') {
                    System.out.println("Sorry, no golpeaste nada");
                    matrix[x][y] = '~';
                }
                else if ((x < 0 || x >= 15) || (y < 0 || y >= 15))  //intento invalido
                	System.out.println("No puedes poner coordenadas que no se encuentran dentro del tablero");
            }
        while((x < 0 || x >= 15) || (y < 0 || y >= 15));  //keep re-prompting till valid guess
    }
}

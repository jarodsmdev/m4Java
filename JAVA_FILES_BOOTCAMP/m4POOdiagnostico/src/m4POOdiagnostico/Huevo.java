package m4POOdiagnostico;

import java.util.ArrayList;
import java.util.Scanner;


public class Huevo extends Tablero{
    int fila;
    int columna;
    int puntaje;

    /**
     * Constructor de la clase Huevo.
     */
    public Huevo(){}

    /**
     * Devuelve la fila donde se encuentra el huevo en el tablero.
     * @return La fila del huevo.
     */
    public int getFila(){
        return fila;
    }

    /**
     * Establece la fila donde se encuentra el huevo en el tablero.
     * @param coorX La nueva fila del huevo.
     */
    public void setFila(int coorX){
        fila = coorX;
    }

    /**
     * Devuelve la columna donde se encuentra el huevo en el tablero.
     * @return La columna del huevo.
     */
    public int getColumna(){
        return columna;
    }

    /**
     * Establece la columna donde se encuentra el huevo en el tablero.
     * @param coorY La nueva columna del huevo.
     */
    public void setColumna(int coorY){
        columna = coorY;
    }
<<<<<<< HEAD
    
    static ArrayList<Integer>puntajeObtenido = new ArrayList<Integer>();

}
   
=======




}
>>>>>>> 163b4f4fc9f076cb53d854144a573065e6e3f62b

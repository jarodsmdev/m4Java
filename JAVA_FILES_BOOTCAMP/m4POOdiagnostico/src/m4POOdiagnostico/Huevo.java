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

}
   
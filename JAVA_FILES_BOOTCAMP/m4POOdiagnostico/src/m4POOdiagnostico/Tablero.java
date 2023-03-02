package m4POOdiagnostico;

import java.util.ArrayList;

public class Tablero {
    char [][] matrix = new char[15][15];
    Carro[] listaCarro = new Carro[18];
    //ArrayList <Carro> listaCarro = new ArrayList<Carro>();
    ArrayList <Huevo> listaHuevo = new ArrayList<Huevo>();

    public void crearCarro(){
        Carro kromi1 = new Kromi();
        Carro kromi2 = new Kromi();
        Carro kromi3 = new Kromi();

        Carro caguano1 = new Caguano();
        Carro caguano2 = new Caguano();
        Carro caguano3 = new Caguano();
        Carro caguano4 = new Caguano();
        Carro caguano5 = new Caguano();
    
        Carro trupalla1 = new Trupalla();
        Carro trupalla2 = new Trupalla();
        Carro trupalla3 = new Trupalla();
        Carro trupalla4 = new Trupalla();
        Carro trupalla5 = new Trupalla();
        Carro trupalla6 = new Trupalla();
        Carro trupalla7 = new Trupalla();
        Carro trupalla8 = new Trupalla();
        Carro trupalla9 = new Trupalla();
        Carro trupalla10 = new Trupalla();
    }

    public void lanzarHuevo(int coorX, int coorY){
        Huevo huevo = new Huevo();
        huevo.setFila(coorX);
        huevo.setColumna(coorY);
        listaHuevo.add(huevo);
        //TODO: CALCULAR PUNTAJE
        //TODO: PINTAR EN MATRIX
    }

}

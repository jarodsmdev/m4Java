package m4POOdiagnostico;

import java.util.ArrayList;

public class Tablero {
    static char [][] matrix = new char[15][15];
    static Carro[] listaCarro = new Carro[17];
    //ArrayList <Carro> listaCarro = new ArrayList<Carro>();
    ArrayList <Huevo> listaHuevo = new ArrayList<Huevo>();

    /**
     * CREA LOS OBJETOS Y LOS AÑADE AL ARRAY ListaCarro()
     */
    public void crearCarro(){
    	//DEFINIMOS CANTIDAD DE CARROS
    	int kromis = 3;
    	int caguanos = 5;
    	int trupallas = 10;
    	int indicePosicion = 0;
    	
    	//CREA OBJETOS KROMI Y LO AÑADE AL ARRAY
    	for(int i = 0; i < kromis; i++) {
    		Carro kromi = new Kromi();
    		listaCarro[indicePosicion] = kromi;
    		i++;
    	}
    	//CREA OBJETOS CAGUANO Y LO AÑADE AL ARRAY
    	for(int i = 0; i < caguanos; i++) {
    		Carro caguano = new Caguano();
    		listaCarro[indicePosicion] = caguano;
    		i++;
    	}
    	//CREA OBJETOS TRUPALLA Y LO AÑADE AL ARRAY
    	for(int i = 0; i < trupallas; i++) {
    		Carro trupalla = new Trupalla();
    		listaCarro[indicePosicion] = trupalla;
    		i++;
    	}
    	      
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

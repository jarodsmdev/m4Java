package m4POOdiagnostico;

import java.util.ArrayList;

public class Ubicacion extends Carro {
	public static int numFilas = 15;
    public static int numCols = 15;
    @Override
    public ArrayList<int[][]> getCoordenadas() {
    	// TODO Auto-generated method stub
    	return super.getCoordenadas();
    };
    static int totalCarros = 17;
    
    

	public static String[][] plano = new String[numFilas][numCols];
	
	  public static void ponerCarros(){
	        System.out.println("\nSe estan creando los carros");
	        //se asignan lugares random a los barcos 
	        
	        for (int i = 1; i <= 17; ) {
	            int x = (int)(Math.random() * 10);
	            int y = (int)(Math.random() * 10);

	            if((x >= 0 && x < numFilas) && (y >= 0 && y < numCols) && (plano[x][y] == " "))
	            {
	                plano[x][y] =   "x";
	                System.out.println(i + " Trupalla insertado correctamente");
	                i++;
	            }
	        }
	        imprimirMapa();
	    }


}

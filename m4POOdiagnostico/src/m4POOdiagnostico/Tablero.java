package m4POOdiagnostico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tablero {
    private char [][] matrix;
    private Carro[] listaCarro = new Carro[18];
    private ArrayList<Integer>puntajeObtenido ;
    //ArrayList <Carro> listaCarro = new ArrayList<Carro>();
    ArrayList <Huevo> listaHuevo = new ArrayList<Huevo>();

    
    public Tablero() {
    	//ARRAY PUNTAJE
        puntajeObtenido = new ArrayList<Integer>();
        
    	//INICIALIZAR EL TABLERO VACÍO
    	matrix = new char[15][15];
    	 for(int i = 0; i < matrix.length; i++) {
             for(int j = 0; j < matrix[i].length; j++) {
                 matrix[i][j] = ' ';
             }
         }
    }
    
//    public int puntaje(ArrayList<Integer> puntajeObtenido) {
//    int suma = 0;
//    for (int i = 0; i < puntajeObtenido.size(); i++) {
//        suma += puntajeObtenido.get(i);
//    	}
//   return suma;
//    	}	
    
    // Suma los puntos obtenidos 
    public int puntaje() {
        int suma = 0;
        for (int i = 0; i < puntajeObtenido.size(); i++) {
            suma += puntajeObtenido.get(i);
        }
        return suma;
    }
    
    /**
     * CREA LOS OBJETOS Y LOS AÑADE AL ARRAY ListaCarro()
     */
    public void crearCarros(){
    	//DEFINIMOS CANTIDAD DE CARROS
    	int kromis = 3;
    	int caguanos = 5;
    	int trupallas = 10;
    	int indicePosicion = 0;
    	
    	//CREA OBJETOS KROMI Y LO AÑADE AL ARRAY
    	for(int i = 0; i < kromis; i++) {
    		Carro kromi = new Kromi();
    		listaCarro[indicePosicion] = kromi;
    		ubicarKromi();
    		indicePosicion++;
    	}
    	//CREA OBJETOS CAGUANO Y LO AÑADE AL ARRAY
    	for(int i = 0; i < caguanos; i++) {
    		Carro caguano = new Caguano();
    		listaCarro[indicePosicion] = caguano;
    		ubicarCaguano();
    		indicePosicion++;
    	}
    	//CREA OBJETOS TRUPALLA Y LO AÑADE AL ARRAY
    	for(int i = 0; i < trupallas; i++) {
    		Carro trupalla = new Trupalla();
    		listaCarro[indicePosicion] = trupalla;
    		ubicarTrupalla();
    		indicePosicion++;
    	}      
    }
    
    public void ubicarKromi() {
    	//3 METROS Y VERTICAL
    	int x = (int)(Math.random() * 13);
    	int y = (int)(Math.random() * 15);
    	
    	if(matrix[x][y] == ' ' && matrix[x+1][y] == ' ' && matrix[x+2][y] == ' ') {
    		matrix[x][y] = 'K';
    		matrix[x+1][y] = 'K';
    		matrix[x+2][y] = 'K';
    	}else {
    		while(true) {
    	    	x = (int)(Math.random() * 13);
    	    	y = (int)(Math.random() * 15);
    	    	if (matrix[x+1][y] == ' ' && matrix[x+2][y] == ' ') {
                    matrix[x][y] = 'K';
                    matrix[x+1][y] = 'K';
                    matrix[x+2][y] = 'K';
                    break;  // Salir del ciclo while si se ha colocado el elemento correctamente
                }
    		}
    	}
    }
    
    public void ubicarCaguano() {
    	//2 METROS Y HORIZONTAL
    	int x = (int)(Math.random() * 15);
    	int y = (int)(Math.random() * 14);
    	
    	if(matrix[x][y] == ' ' && matrix[x][y+1] == ' ') {
    		matrix[x][y] = 'C';
    		matrix[x][y+1] = 'C';
    	}else {
    		while(true) {
    	    	x = (int)(Math.random() * 15);
    	    	y = (int)(Math.random() * 14);
    	    	if (matrix[x][y] == ' ' && matrix[x][y+1] == ' ') {
                    matrix[x][y] = 'C';
                    matrix[x][y+1] = 'C';
                    break;  // Salir del ciclo while si se ha colocado el elemento correctamente
                }
    		}
    	}
    }
    
    public void ubicarTrupalla(){
    	//1 METRO
    	int x = (int)(Math.random() * 15);
    	int y = (int)(Math.random() * 15);
    	
    	if(matrix[x][y] == ' ') {
    		matrix[x][y] = 'T';

    	}else {
    		while(true) {
    	    	x = (int)(Math.random() * 15);
    	    	y = (int)(Math.random() * 15);
    	    	if (matrix[x][y] == ' ') {
                    matrix[x][y] = 'T';
                    break;  // Salir del ciclo while si se ha colocado el elemento correctamente
                }
    		}
    	}
    }
    
    public void mostrarPlano() {   	
    	//SUPERIOR DEL PLANO
    	System.out.print("  ");
        for(int i = 0; i < matrix.length; i++)
        	if(i<=9) {
        		System.out.print(String.format("%2d", i));
        		
        	}else {
        		System.out.print(i);
        	}
        System.out.println();
    	//CENTRO DEL PLANO
    	 for(int i = 0; i < matrix.length; i++) {
    		 for(int j = 0; j < matrix[i].length; j++) {
    			 if (j == 0) {
    	                System.out.print(String.format("%2d", i) + "|" + matrix[i][j] + "|");
    	            } else if (j == matrix[i].length - 1) {
    	                System.out.print(matrix[i][j] + "|");
    	            } else {
    	                System.out.print(matrix[i][j] + "|");
    	            }
             }
             System.out.println();
    		 }
    }
  	   
    public void lanzarHuevo(){
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
    
    public void menu() {
		Scanner input = new Scanner(System.in);
		int opciones;

		do {
			System.out.println("MENU");
			System.out.println("1. Crear tablero");
			System.out.println("2. Lanzar huevo");
			System.out.println("3. Mostrar tablero");
			System.out.println("4. Calcular puntaje");
			System.out.println("5. Salir");
			System.out.print("Elige una opción: ");
			//opciones = input.nextInt();
			
	        try {
	            opciones = input.nextInt();
	        } catch (InputMismatchException e) {
	            opciones = 0; // Asignamos un valor por defecto
	            input.nextLine(); // Limpiamos el buffer de entrada
	            System.out.println("Error: debes ingresar un número del 1 al 5.");
	        }
			switch (opciones) {
			case 1:
				System.out.println("Crear Carros");
				break;
			case 2:
				System.out.println("Lanzar Huevo");
				lanzarHuevo();
				break;
			case 3:
				System.out.println("Mostrar Tablero");
				break;
			case 4:
				System.out.println("Calcular Puntaje");
				System.out.println("El puntaje total obtenido es: " + puntaje());
				break;
			case 5:
				System.out.println("Fin del juego");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		} while (opciones != 5);

	

	}

}

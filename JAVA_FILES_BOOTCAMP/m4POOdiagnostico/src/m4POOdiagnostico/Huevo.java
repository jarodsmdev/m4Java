package m4POOdiagnostico;

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

    
    public static void lanzarHuevo(){
        System.out.println("\nEs tu turno de lanzar huevos");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa la coordenada X: ");
            x = input.nextInt();
            System.out.print("Ingresa la coordenada Y: ");
            y = input.nextInt();

            if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols)) //valid guess
            {
                if (matrix[x][y] == 'x') //if computer ship is already there; computer loses ship
                {
                    System.out.println("Boom! Le achuntaste a un barco");
                    grid[x][y] = '!'; //Hit mark
                    --BattleShips.computerShips;
                }
                }
                else if (grid[x][y] == " ") {
                    System.out.println("Sorry, no golpeaste nada");
                    grid[x][y] = "-";
                }
                else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))  //invalid guess
                	System.out.println("No puedes poner coordenadas que no se encuentran dentro del tablero");
            }
        while((x < 0 || x >= numRows) || (y < 0 || y >= numCols));  //keep re-prompting till valid guess
    }
}

package m4POOdiagnostico;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
/**
 * La clase Tablero representa el tablero de juego.
 */
public class Tablero {
    private String[][] matrix; // Matriz que representa el tablero.
    private ArrayList<Integer> puntajeObtenido; // Lista que almacena el puntaje obtenido.
    ArrayList<Carro> listaCarro = new ArrayList<Carro>(); // Lista que almacena los carros en el tablero.
    ArrayList<Huevo> listaHuevo = new ArrayList<Huevo>(); // Lista que almacena los huevos en el tablero.

    /**
     * Constructor de la clase Tablero. Inicializa la matriz del tablero vacía.
     */
    public Tablero() {
        puntajeObtenido = new ArrayList<Integer>(); // Inicializa la lista de puntaje vacía.
        matrix = new String[15][15]; // Crea la matriz del tablero de tamaño 15x15.

        // Inicializa todas las posiciones del tablero con un espacio vacío.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = " ";
            }
        }
    }

    /**
     * Método que crea los carros en el tablero y los agrega a la lista de carros.
     */
    public void crearCarros() {
        int kromis = 3; // Cantidad de carros tipo Kromi.
        int caguanos = 5; // Cantidad de carros tipo Caguano.
        int trupallas = 10; // Cantidad de carros tipo Trupalla.
        int indicePosicion = 0; // Índice para agregar los carros a la lista.

        // Crea los carros tipo Kromi y los agrega a la lista de carros.
        for (int i = 0; i < kromis; i++) {
            ubicarKromi(); // Ubica el carro Kromi en una posición aleatoria del tablero.
            indicePosicion++; // Incrementa el índice de posición.
        }

        // Crea los carros tipo Caguano y los agrega a la lista de carros.
        for (int i = 0; i < caguanos; i++) {
            Carro caguano = new Caguano(); // Crea un nuevo carro tipo Caguano.
            listaCarro.add(caguano); // Agrega el carro Caguano a la lista de carros.
            ubicarCaguano(); // Ubica el carro Caguano en una posición aleatoria del tablero.
            indicePosicion++; // Incrementa el índice de posición.
        }

        // Crea los carros tipo Trupalla y los agrega a la lista de carros.
        for (int i = 0; i < trupallas; i++) {
            Carro trupalla = new Trupalla(); // Crea un nuevo carro tipo Trupalla.
            listaCarro.add(trupalla); // Agrega el carro Trupalla a la lista de carros.
            ubicarTrupalla(); // Ubica el carro Trupalla en una posición aleatoria del tablero.
            indicePosicion++; // Incrementa el índice de posición.
        }
    }

    /**

     Este método se encarga de ubicar una instancia de la clase Kromi en una posición aleatoria dentro de la matriz del juego.
     La posición debe ser horizontal y ocupar tres celdas contiguas en una misma fila.
     Si la posición aleatoria elegida no cumple con los requisitos, el método intenta encontrar una nueva posición hasta que lo logra.
     Después de ubicar la Kromi, se agrega a la lista de carros del juego y se asignan sus coordenadas y otros atributos.
     */
    public void ubicarKromi() {
        //3 METROS Y VERTICAL
        int x = (int) (Math.random() * 13);
        int y = (int) (Math.random() * 15);
        int[][] punto = new int[3][2];

        if (matrix[x][y] == " " && matrix[x + 1][y] == " " && matrix[x + 2][y] == " ") {
            matrix[x][y] = "K";
            matrix[x + 1][y] = "K";
            matrix[x + 2][y] = "K";

        } else {
            while (true) {
                x = (int) (Math.random() * 13);
                y = (int) (Math.random() * 15);
                if (matrix[x + 1][y] == " " && matrix[x + 2][y] == " ") {
                    matrix[x][y] = "K";
                    matrix[x + 1][y] = "K";
                    matrix[x + 2][y] = "K";
                    break;  // Salir del ciclo while si se ha colocado el elemento correctamente
                }
            }
        }
        punto[0][0] = x;
        punto[0][1] = y;

        punto[1][0] = x + 1;
        punto[1][1] = y;

        punto[2][0] = x + 2;
        punto[2][1] = y;

        Carro kromi = new Kromi();
        listaCarro.add(kromi);
        ArrayList<int[][]> listaCoordenadas = new ArrayList<>();
        listaCoordenadas.add(punto);
        kromi.setCoordenadas(listaCoordenadas);
        kromi.setCantOcupantes(getRandom(15, 0));
        kromi.setFechaIngreso("14/01/1999");
    }
    /**

     Método para ubicar dos caguamas en la matriz de juego de forma aleatoria.
     Las caguamas ocupan dos espacios contiguos horizontalmente.
     Si los espacios elegidos aleatoriamente no están vacíos, se repite el proceso hasta encontrar dos espacios contiguos vacíos.
     */
    public void ubicarCaguano() {
        //2 METROS Y HORIZONTAL
        int x = (int) (Math.random() * 15);
        int y = (int) (Math.random() * 14);

        if (matrix[x][y] == " " && matrix[x][y + 1] == " ") {
            matrix[x][y] = "C";
            matrix[x][y + 1] = "C";
        } else {
            while (true) {
                x = (int) (Math.random() * 15);
                y = (int) (Math.random() * 14);
                if (matrix[x][y] == " " && matrix[x][y + 1] == " ") {
                    matrix[x][y] = "C";
                    matrix[x][y + 1] = "C";
                    break;  // Salir del ciclo while si se ha colocado el elemento correctamente
                }
            }
        }
    }
    /**

     Este método ubica una Trupalla en una posición aleatoria dentro de una matriz de 15x15.
     Si la posición aleatoria ya está ocupada por otro elemento en la matriz, el método seguirá buscando una posición libre.
     Si encuentra una posición libre, colocará la Trupalla en esa posición.
     @return void
     */

    public void ubicarTrupalla() {
        //1 METRO
        int x = (int) (Math.random() * 15);
        int y = (int) (Math.random() * 15);

        if (matrix[x][y] == " ") {
            matrix[x][y] = "T";

        } else {
            while (true) {
                x = (int) (Math.random() * 15);
                y = (int) (Math.random() * 15);
                if (matrix[x][y] == " ") {
                    matrix[x][y] = "T";
                    break;  // Salir del ciclo while si se ha colocado el elemento correctamente
                }
            }
        }
    }
    /**

     Este método muestra en consola una representación visual de una matriz en la que se encuentra un huevo.
     La matriz es de 15x15 y cada celda puede contener un huevo ("H") o estar vacía (" ").
     El método muestra en la parte superior de la matriz los números correspondientes a las columnas y a la izquierda los números correspondientes a las filas.
     Si una celda contiene un huevo, el método lo muestra como "H" y si está vacía, muestra un espacio en blanco.
     @return void
     */

    public void mostrarHuevo() {

     //    horizontal numeros
        System.out.print("  ");
        for (int i = 0; i < matrix.length; i++) {
            if (i <= 14) {
                System.out.print(String.format("%2d ", i));
            } else {
                System.out.print(i);
            }
        }
        System.out.println();

//


        // vertical numeros
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("H")) {
                    if (j == 0) {
                        System.out.print(String.format("%2d", i) + "|");
                    }
                    System.out.print(matrix[i][j]);
                } else {
                    if (j == 0) {
                        System.out.print(String.format("%2d", i) + "| ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.print("|");
            }
            System.out.println();
        }

    }
    /**

     Este método muestra en consola una representación visual de una matriz de 15x15.
     El método muestra en la parte superior de la matriz los números correspondientes a las columnas y a la izquierda los números correspondientes a las filas.
     Cada celda de la matriz contiene un elemento que puede ser un tanque ("T"), una trupalla ("H"), un huevo ("H"), una pared ("#") o estar vacía (" ").
     El método muestra cada elemento en su respectiva celda, separados por un "|".
     @return void
     */

        public void mostrarPlano() {


        //SUPERIOR DEL PLANO
        System.out.print("  ");
        for (int i = 0; i < matrix.length; i++)
            if (i <= 9) {
                System.out.print(String.format("%2d", i));

            } else {
                System.out.print(i);
            }
        System.out.println();
        //CENTRO DEL PLANO
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
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

    /**

     Método que permite al jugador lanzar un huevo en una coordenada del tablero.
     Si el jugador acierta en una nave, se actualiza el puntaje del jugador y se marca la casilla como acertada.
     Si el jugador no acierta en ninguna nave, se marca la casilla como fallida.
     Se muestra el estado actual del tablero después de cada intento.
     */
    public void lanzarHuevo() {
        System.out.println("\nEs tu turno de lanzar huevos");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Ingresa la coordenada X: ");
            x = input.nextInt();
            if (x < 0 || x > 14) {
                System.out.println("Ingresa una coordenada X que este dentro del tablero");
            } else {
                System.out.print("Ingresa la coordenada Y: ");
                y = input.nextInt();
                if (y < 0 || y > 14) {
                    System.out.println("Ingresa una coordenada Y que este dentro del tablero");
                }
            }

            if ((x >= 0 && x < 15) && (y >= 0 && y < 15)) //intento valido
            {
                if (matrix[x][y] == "T") //si es que le pega a un Trupalla
                {
                    System.out.println("Boom! Le achuntaste a un Trupalla");
                    matrix[x][y] = "H"; //Hit mark
                    puntajeObtenido.add(1);
                    System.out.println("+1 punto"); //DEBUG
                    mostrarPlano();

                } else if (matrix[x][y] == "C") {
                    System.out.println("BOOM! le diste a un Caguano");
                    matrix[x][y] = "H";
                    puntajeObtenido.add(2);
                    System.out.println("+2 puntos"); //DEBUG
                    if ((matrix[x][y] == "H" && matrix[x][y + 1] == "H") || (matrix[x][y] == "H" && matrix[x][y - 1] == "H")) {
                        System.out.println("Felicidades! Hundiste un Caguano");
                        puntajeObtenido.add(7);
                        System.out.println("+7 puntos"); //DEBUG
                    }
                    mostrarPlano();
                } else if (matrix[x][y] == "K") {
                    System.out.println("POW! le diste a una Kromi");
                    matrix[x][y] = "H";
                    puntajeObtenido.add(3);
                    if ((matrix[x][y] == "H" && matrix[x + 1][y] == "H" && matrix[x + 2][y] == "H") ||
                            (matrix[x][y] == "H" && matrix[x - 1][y] == "H" && matrix[x - 2][y] == "H") ||
                            (matrix[x][y] == "H" && matrix[x + 1][y] == "H" && matrix[x - 1][y] == "H")) {
                        System.out.println("Felicidades! Hundiste una Kromi");
                        puntajeObtenido.add(10);
                        System.out.println("+10 puntos"); //DEBUG
                    }
                    mostrarPlano();
                } else if (matrix[x][y] == " " || matrix[x][y] == "H") {
                    System.out.println("Sorry, no golpeaste nada");
                    //matrix[x][y] = '~';
                    matrix[x][y] = "H";
                    mostrarPlano();
                } else if ((x < 0 || x >= 15) || (y < 0 || y >= 15))  //intento invalido
                    System.out.println("No puedes poner coordenadas que no se encuentran dentro del tablero");
            }
        }
        while ((x < 0 || x >= 15) || (y < 0 || y >= 15));  //keep re-prompting till valid guess
    }

    /**
     * metodo suma de puntaje
     */
    public void puntaje() {
        int suma = 0;
        for (int i = 0; i < puntajeObtenido.size(); i++) {
            suma += puntajeObtenido.get(i);
        }
        System.out.println("El puntaje total obtenido es: " + suma);
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
                    int contadorHuevos = 0;
                    while (true) {
                        lanzarHuevo();
                        contadorHuevos++;
                        System.out.print("¿Deseas lanzar otro huevo? (s/n): ");
                        String respuesta = input.next();
                        if (respuesta.trim().equalsIgnoreCase("s")) {
                            continue;
                        } else if (respuesta.trim().equalsIgnoreCase("n")) {
                            System.out.println("Se lanzaron " + contadorHuevos + " huevos.");
                            break;
                        } else {
                            System.out.println("Respuesta inválida. Por favor ingrese 's' o 'n'.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Mostrar Tablero");
                    mostrarHuevo();

                    break;
                case 4:
                    System.out.println("Calcular Puntaje");
                    puntaje();
                    break;
                case 5:
                    System.out.println("Fin del juego");
                    puntaje();
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opciones != 5);


    }

    public static int getRandom(int max, int min) {
        Random num = new Random();
        return num.nextInt(max + min);
    }
}

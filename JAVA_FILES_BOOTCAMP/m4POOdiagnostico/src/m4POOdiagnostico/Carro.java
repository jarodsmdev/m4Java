package m4POOdiagnostico;

import java.util.ArrayList;

public class Carro {
    private int cantOcupantes;
    private String fechaIngreso;
    private ArrayList<int[][]> coordenadas;

    // Constructor por defecto sin parámetros.

    public Carro(){}

    /**
     * Constructor que recibe como parámetros la cantidad de ocupantes y fecha de ingreso del carro.
     * @param cantOcupantes La cantidad de ocupantes del carro.
     * @param fechaIngreso La fecha de ingreso del carro.
     */
    public Carro(int cantOcupantes, String fechaIngreso) {
        this.cantOcupantes = cantOcupantes;
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Método para obtener la cantidad de ocupantes del carro.
     * @return La cantidad de ocupantes del carro.
     */
    public int getCantOcupantes(){
        return cantOcupantes;
    }

    /**
     * Método para establecer la cantidad de ocupantes del carro.
     * @param cantOcupantes La cantidad de ocupantes del carro.
     */
    public void setCantOcupantes(int cantOcupantes){
        this.cantOcupantes = cantOcupantes;
    }

    /**
     * Método para obtener la fecha de ingreso del carro.
     * @return La fecha de ingreso del carro.
     */
    public String getFechaIngreso(){
        return fechaIngreso;
    }

    /**
     * Método para establecer la fecha de ingreso del carro.
     * @param fechaIngreso La fecha de ingreso del carro.
     */
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Método para obtener las coordenadas del carro en el tablero.
     * @return Las coordenadas del carro en el tablero.
     */
    public ArrayList<int[][]> getCoordenadas(){
        return coordenadas;
    }

    /**
     * Método para establecer las coordenadas del carro en el tablero.
     * @param coordenadas Las coordenadas del carro en el tablero.
     */
    public void setCoordenadas(ArrayList<int[][]> coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * Método para mostrar los datos del carro, incluyendo la cantidad de ocupantes y la fecha de ingreso.
     */
    public void mostrarDatos() {
        System.out.println("Ocupantes: " + cantOcupantes);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
    }

    /**
     * Método para representar el objeto carro en formato de cadena de texto.
     * @return El objeto carro representado en formato de cadena de texto.
     */
    @Override
    public String toString() {
        return "Carro [cantOcupantes=" + cantOcupantes + ", fechaIngreso=" + fechaIngreso + "]";
    }


}
package m4POOdiagnostico;

import java.util.ArrayList;

public class Carro {
    private int cantOcupantes;
    private String fechaIngreso;
    private ArrayList<int[][]> coordenadas;

    //CONSTRUCTOR
    public Carro(){}
    
    public Carro(int cantOcupantes, String fechaIngreso) {
    	this.cantOcupantes = cantOcupantes;
    	this.fechaIngreso = fechaIngreso;
    }

    public int getCantOcupantes(){
        return cantOcupantes;
    }
    public void setCantOcupantes(int cantOcupantes){
        this.cantOcupantes = cantOcupantes;
    }
    public String getFechaIngreso(){
        return fechaIngreso;
    }
    public void setFechaIngreso(String fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    public ArrayList<int[][]> getCoordenadas(){
        return coordenadas;
    }
    public void setCoordenadas(ArrayList<int[][]> coordenadas) {
        this.coordenadas = coordenadas;
    }
    //METODO MOSTRAR DATOS
    public void mostrarDatos() {
        System.out.println("Ocupantes: " + cantOcupantes);
        System.out.println("Fecha de ingreso: " + fechaIngreso);
        //System.out.println("Ubicación en el tablero: (" + getCoordenadas() + ", " + getCoordenadas() + ")");
        
    }
    
    @Override
    public String toString() {
    	return "Carro [cantOcupantes=" + cantOcupantes + ", fechaIngreso=" + fechaIngreso + "]";
    }  
}

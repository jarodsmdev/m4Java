package m4POOdiagnostico;

import java.util.ArrayList;

public class Carro {
    int cantOcupantes;
    String fechaIngreso;
    ArrayList<int[][]> coordenadas;

    //CONSTRUCTOR
    public Carro(){}

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

}

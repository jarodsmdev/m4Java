package m4POOdiagnostico;

public class Kromi extends Carro {
    int agnioFabricacion;
    String marca;

    //CONSTRUCTOR PREDETERMINADO
    public Kromi(){}

    public int getAgnio(){
        return agnioFabricacion;
    }
    public void setAgnio(int agnio){
        this.agnioFabricacion = agnio;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
}

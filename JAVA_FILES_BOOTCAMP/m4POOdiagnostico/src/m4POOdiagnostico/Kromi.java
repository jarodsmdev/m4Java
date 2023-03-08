package m4POOdiagnostico;

public class Kromi extends Carro {
    int agnioFabricacion;
    String marca;
    

    //CONSTRUCTOR PREDETERMINADO
    public Kromi(){}
    
    public Kromi(int cantOcupantes, String fechaIngreso, int agnioFabricacion, String marca) {
    	super(cantOcupantes, fechaIngreso);
    	this.agnioFabricacion = agnioFabricacion;
    	this.marca = marca;
    };
    
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
    public String toString() {
    	return "\nKromi" + "\n Año de Fabricación: " + agnioFabricacion + "Marca: " + marca;
    }
}

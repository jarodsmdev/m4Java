package m4POOdiagnostico;

public class Caguano extends Carro{

    int alcanceTiro;
    String colorConfeti;


//CONSTRUCTOR

public Caguano(){};

public Caguano(int cantOcupantes, String fechaIngreso, int alcanceTiro, String colorConfeti) {
	super(cantOcupantes, fechaIngreso);
	this.alcanceTiro = alcanceTiro;
	this.colorConfeti = colorConfeti;
};

public int getAlcanceTiro(){
    return alcanceTiro;
}
public void setAlcanceTiro(int alcanceTiro){
    this.alcanceTiro = alcanceTiro;
}
public String getColorConfeti(){
    return colorConfeti;
}
public void setColorConfeti(String colorConfeti){
    this.colorConfeti = colorConfeti;
}
}
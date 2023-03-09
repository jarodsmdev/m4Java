package HerenciaPolimorfismo;

public class Oviparo extends Animal implements iDomestico{
	boolean esVertebrado;
	String medioTransporte;
	
	public Oviparo() {}
	
	public Oviparo(int numeroExtremidades,
						String especie,
						String tipoAlimentacion,
						boolean esVertebrado,
						String medioTransporte) {
		super(numeroExtremidades, especie, tipoAlimentacion);
		this.esVertebrado = esVertebrado;
		this.medioTransporte = medioTransporte;
	}
	
	@Override
	public void esDomestico() {};
}

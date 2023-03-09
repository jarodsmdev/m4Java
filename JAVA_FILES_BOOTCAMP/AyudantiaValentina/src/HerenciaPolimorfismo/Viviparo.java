package HerenciaPolimorfismo;

public class Viviparo extends Animal implements iDomestico{
	boolean esMamifero;
	String pelaje;
	
	public Viviparo() {}
	
	public Viviparo(boolean esMamifero,
						String pelaje,
						int numeroExtremidades,
						String especie,
						String tipoAlimentacion) {
		super(numeroExtremidades, especie, tipoAlimentacion);
		this.esMamifero = esMamifero;
		this.pelaje = pelaje;
	}
	@Override
	public void esDomestico() {}
}

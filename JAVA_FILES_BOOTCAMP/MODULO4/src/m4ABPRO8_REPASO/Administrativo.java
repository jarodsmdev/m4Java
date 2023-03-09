package m4ABPRO8_REPASO;

public class Administrativo extends Usuario{
	private String area;
	private int experienciaPrevia;
	
	public Administrativo() {}
	
	public Administrativo(String area, int experienciaPrevia, String nombreUsuario, String fechaNacimiento, int rut) {
		super(nombreUsuario, fechaNacimiento, rut);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public int getExperienciaPrevia() {
		return experienciaPrevia;
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Administrativo area=" + area + ", experienciaPrevia=" + experienciaPrevia);
	}
}

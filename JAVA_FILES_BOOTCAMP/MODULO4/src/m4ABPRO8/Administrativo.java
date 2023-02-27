package m4ABPRO8;

public class Administrativo extends Usuario{
	private String area;
	private int experienciaPrevia;
	
	public Administrativo(String nombreUsuario, String area, int experienciaPrevia) {
		super(nombreUsuario);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Yo soy un Administrativo \nMi nombre de Usuario es: " + getNombreUsuario() + "\nMi área es: " + area + "\nTengo: " + experienciaPrevia + " años de Experiencia Previa");
	}
}

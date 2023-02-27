package m4ABPRO8;

public class Profesional extends Usuario{
	private String titulo;
	private String fechaIngreso;
	
	public Profesional(String nombreUsuario, String titulo, String fechaIngreso) {
		super(nombreUsuario);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	};
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Yo soy un Profesional\nMi nombre de usuario es: " + getNombreUsuario() + "\nMi título es: " + titulo + "\nMi fecha de ingreso es: " + fechaIngreso);
	}
}

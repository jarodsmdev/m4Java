package m4ABPRO8;

public class Profesional extends Usuario{
	private String titulo;
	private String fechaIngreso;
	
	public Profesional() {}

	public Profesional(String titulo, String fechaIngreso, String nombreUsuario, String fechaNacimiento, int rut) {
		super(nombreUsuario, fechaNacimiento, rut);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Profesional titulo=" + titulo + ", fechaIngreso=" + fechaIngreso);
	}
}

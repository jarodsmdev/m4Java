package m4ABPRO8;

public class Usuario implements Asesoria {
	private String nombreUsuario;
	
	public Usuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("Mi nombre de usuario es: " + nombreUsuario);
	}
	
}

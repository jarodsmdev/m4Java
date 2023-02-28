package m4ABPRO8_REPASO;

public class Usuario implements Asesoria{

	private String nombreUsuario;
	private String fechaNacimiento;
	private int rut;

	//CONSTRUCTOR POR DEFECTO
	public Usuario() {}
	
	//CONSTRUCTOR PARAMETRIZADO
	public Usuario(String nombreUsuario, String fechaNacimiento, int rut) {
		this.nombreUsuario = nombreUsuario;
		this.fechaNacimiento = fechaNacimiento;
		this.rut = rut;
	}
	
	//MÉTODOS ACCESORES
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public int getRut() {
		return rut;
	}
	
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de Usuario: " + nombreUsuario);
	}


}

package m4ABPRO8;

public class Cliente extends Usuario {
	//ATRIBUTOS
	private int rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private char sistemaSalud;
	private String direccion;
	private String comuna;
	private int edad;
	
	//METODOS CONSTRUCTOR POR DEFECTO
	public Cliente() {}

	//METODO CONSTRUCTOR PARAMETRIZADO
	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, char sistemaSalud,
			String direccion, String comuna, int edad, String nombreUsuario, String fechaNacimiento) {
		super(nombreUsuario, fechaNacimiento, rut);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}
	
	//MÉTODOS ACCESORES
	public int getRut() {
		return rut;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getAfp() {
		return afp;
	}

	public char getSistemaSalud() {
		return sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Cliente rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud=" + sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad );
	}

	
}

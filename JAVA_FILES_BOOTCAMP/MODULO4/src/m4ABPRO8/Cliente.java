package m4ABPRO8;

public class Cliente extends Usuario {

	public Cliente(String nombreUsuario) {
		super(nombreUsuario);
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Soy Cliente y mi nombre de usuario es: " + getNombreUsuario());
	}
}

package m4ABP13;

public class CargaFamiliar{
	//ATRIBUTOS
	private String runCarga;
	private String nombres;
	private String apellidos;
	private String runFamiliar; //RUT TRABAJADOR
	private int parentesco;
	private int edad;
	
	//MÉTODO CONSTRUCTOR PREDETERMINADO
	public CargaFamiliar() {};
	
	public CargaFamiliar(String runFamiliar, String runCarga, int parentezco) {
		this.runFamiliar = runFamiliar;
		this.runCarga = runCarga;
		this.parentesco = parentezco;
	}
	
	//MÉTODO CONSTRUCTOR PARAMETRIZADO
	public CargaFamiliar(String runCarga,
							String nombres,
							String apellidos,
							String runFamiliar,
							int parentesco,
							int edad) {
		this.runCarga = runCarga;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.runFamiliar = runFamiliar;
		this.parentesco = parentesco;
		this.edad = edad;
	}
	
	//MÉTODOS ACCESORES
	public String getRunCarga() {
		return runCarga;
	}
	public void setRunCarga(String runCarga) {
		this.runCarga = runCarga;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getRunFamiliar(){
		return runFamiliar;
	}
	public void setRunFamiliar(String runFamiliar){
		this.runFamiliar = runFamiliar;
	}

	public int getParentesco() {
		return parentesco;
	}
	public void setParentesco(int parentesco) {
		this.parentesco = parentesco;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String mostrarParentesco() {

		switch(parentesco){
			case 1:
				return "CÓNYUGE";
			case 2:
				return "HIJO/A";
			case 3:
				return "OTRO";
			default:
				return "NO DEBERÍA MOSTRAR ESTE MENSAJE";
		}
	}
	

	@Override
	public String toString() {
		return "\nCarga Familiar: \n"+ runFamiliar +"\nRun Carga: " + runCarga + ",\nNombres: " + nombres + ", \nApellidos: " + apellidos	+ ",\nParentesco: " + mostrarParentesco() + ",\nEdad: " + edad;
	}
	
}

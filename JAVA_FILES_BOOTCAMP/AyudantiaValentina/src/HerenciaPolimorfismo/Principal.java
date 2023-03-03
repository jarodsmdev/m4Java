package HerenciaPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		Animal animal1 = new Viviparo();
		Animal animal2 = new Viviparo();
		Animal animal3 = new Viviparo();
		
		Animal animal4 = new Viviparo(true, "PELUDO", 4, "PERRO", "DE TODO");
		Animal animal5 = new Viviparo(true, "SIN PELOS", 3, "ELEFANTE", "DE TODO");
		Animal animal6 = new Viviparo(true, "POCO PELO", 2, "GATO", "DE TODO");
		
		
		Animal animal7 = new Oviparo(4, "NO SÉ", "COME TIERRA", false, "ACUÁTICO");
		Animal animal8 = new Oviparo(3, "NO SÉ", "COME PECES", false, "ACUÁTICO");
		Animal animal9 = new Oviparo(0, "NO SÉ", "COME ALGAS", true, "ACUÁTICO");
		
		Animal animal10 = new Oviparo();
		Animal animal11 = new Oviparo();
		Animal animal12 = new Oviparo();
		
		Animal perro = new Viviparo();
		Animal gato = new Viviparo();
		Animal lagartija = new Viviparo();
		Animal caballo = new Viviparo();
		Animal gato2 = new Viviparo();
		Animal lagartija2 = new Viviparo();
		
		Animal pez = new Oviparo();
		Animal pulpo = new Oviparo();
		Animal ave = new Oviparo();
		Animal pez2 = new Oviparo();
		Animal ave2 = new Oviparo();
		Animal pulpo2= new Oviparo();
		

	}

}

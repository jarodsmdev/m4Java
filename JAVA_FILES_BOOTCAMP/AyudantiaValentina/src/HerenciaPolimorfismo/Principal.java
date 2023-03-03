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
		
		Animal perro = new Viviparo(true, "PELUDO", 4, "CANINA", "COME DE TODO");
		Animal gato = new Viviparo(true, "PELUDO", 4, "FELINA", "COME PEZ");
		Animal oveja = new Viviparo(true, "PELUDA", 4, "NO SE", "COME PASTO");
		Animal caballo = new Viviparo(true, "PELAJE CORTO", 4, "EQUINA", "COME PASTO");
		Animal cabra = new Viviparo(true, "PELUDA", 4, "NO SÉ", "COME PASTO");
		Animal vacas = new Viviparo(true, "PELAJE CORTO", 4, "¿VACUNA?", "COME PASTO");
		
		Animal pez = new Oviparo(1, "PEZ", "NO SÉ", true, "ACUÁTICO" );
		Animal pulpo = new Oviparo(8, "NO SÉ", "NO SÉ",false, "ACUÁTICO" );
		Animal pollo = new Oviparo(2, "AVE", "MAÍZ", true, "TERRESTRE");
		Animal cocodrilo = new Oviparo(5, "REPTIL", "CARNE", true, "ACUÁTICO");
		Animal pinguino = new Oviparo(4, "PINGÜINO", "PECES", true, "ACUÁTICO/TERRESTRE");
		Animal pulpo2= new Oviparo();
		

	}

}

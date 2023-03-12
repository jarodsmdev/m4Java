/**
 * @authors Valentina Saldías, Priscila Carrillo, Andrés Contreras, Kevin Moreno, Leonel Briones
 */
package m4POOdiagnostico;

/**
 * La clase Kromi es una subclase de Carro que representa un modelo específico de automóvil.
 *
 * Tiene atributos adicionales como el año de fabricación y la marca.
 */
public class Kromi extends Carro {

    /** El año de fabricación del Kromi. */
    int agnioFabricacion;

    /** La marca del Kromi. */
    String marca;

    /**
     * Constructor predeterminado de Kromi.
     */
    public Kromi(){}

    /**
     * Crea un objeto Kromi con los parámetros dados.
     *
     * @param cantOcupantes La cantidad de ocupantes del Kromi.
     * @param fechaIngreso La fecha de ingreso del Kromi al taller.
     * @param agnioFabricacion El año de fabricación del Kromi.
     * @param marca La marca del Kromi.
     */
    public Kromi(int cantOcupantes, String fechaIngreso, int agnioFabricacion, String marca) {
        super(cantOcupantes, fechaIngreso);
        this.agnioFabricacion = agnioFabricacion;
        this.marca = marca;
    };

    /**
     * Obtiene el año de fabricación del Kromi.
     *
     * @return El año de fabricación del Kromi.
     */
    public int getAgnio(){
        return agnioFabricacion;
    }

    /**
     * Establece el año de fabricación del Kromi.
     *
     * @param agnio El año de fabricación del Kromi.
     */
    public void setAgnio(int agnio){
        this.agnioFabricacion = agnio;
    }

    /**
     * Obtiene la marca del Kromi.
     *
     * @return La marca del Kromi.
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Establece la marca del Kromi.
     *
     * @param marca La marca del Kromi.
     */
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * Devuelve una representación en cadena de texto del objeto Kromi.
     *
     * @return Una cadena que contiene el tipo de vehículo, el año de fabricación y la marca del Kromi.
     */
    public String toString() {
        return "\nKromi" + "\n Año de Fabricación: " + agnioFabricacion + "Marca: " + marca;
    }
}
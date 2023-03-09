/**
 * @authors Valentina Saldías, Priscila Carrillo, Andrés Contreras, Kevin Moreno, Leonel Briones
 */

package m4POOdiagnostico;



/**

 La clase Caguano representa un tipo de carro utilizado en una batalla de confeti.

 Hereda los atributos de la clase Carro.
 */
public class Caguano extends Carro{

    /** El alcance máximo del tiro de confeti del Caguano */
    int alcanceTiro;

    /** El color del confeti que lanza el Caguano */
    String colorConfeti;

//CONSTRUCTOR

    /**

     Constructor por defecto de la clase Caguano.
     */
    public Caguano(){};
    /**

     Constructor de la clase Caguano con parámetros.
     @param cantOcupantes La cantidad de ocupantes que puede tener el Caguano.
     @param fechaIngreso La fecha de ingreso del Caguano al campo de batalla.
     @param alcanceTiro El alcance máximo del tiro de confeti del Caguano.
     @param colorConfeti El color del confeti que lanza el Caguano.
     */
    public Caguano(int cantOcupantes, String fechaIngreso, int alcanceTiro, String colorConfeti) {
        super(cantOcupantes, fechaIngreso);
        this.alcanceTiro = alcanceTiro;
        this.colorConfeti = colorConfeti;
    };
    /**

     Método para obtener el alcance máximo del tiro de confeti del Caguano.
     @return El alcance máximo del tiro de confeti del Caguano.
     */
    public int getAlcanceTiro(){
        return alcanceTiro;
    }
    /**

     Método para establecer el alcance máximo del tiro de confeti del Caguano.
     @param alcanceTiro El nuevo alcance máximo del tiro de confeti del Caguano.
     */
    public void setAlcanceTiro(int alcanceTiro){
        this.alcanceTiro = alcanceTiro;
    }
    /**

     Método para obtener el color del confeti que lanza el Caguano.
     @return El color del confeti que lanza el Caguano.
     */
    public String getColorConfeti(){
        return colorConfeti;
    }
    /**

     Método para establecer el color del confeti que lanza el Caguano.
     @param colorConfeti El nuevo color del confeti que lanza el Caguano.
     */
    public void setColorConfeti(String colorConfeti){
        this.colorConfeti = colorConfeti;
    }
}
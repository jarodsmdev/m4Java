package m4POOdiagnostico;
/**

 La clase Trupalla representa un tipo de carro que se utiliza para fines militares.

 Hereda atributos y métodos de la clase Carro.
 */
public class Trupalla extends Carro{

    /**

     Nivel de armadura de la Trupalla.
     */
    private int nivelArmadura;
    /**

     Nombre del chofer de la Trupalla.
     */
    private String chofer;
    /**

     Constructor vacío de la clase Trupalla.
     */
    public Trupalla(){}
    /**

     Retorna el nivel de armadura de la Trupalla.
     @return nivel de armadura de la Trupalla.
     */
    public int getNivelArmadura(){
        return nivelArmadura;
    }
    /**

     Asigna el nivel de armadura de la Trupalla.
     @param nivelArmadura el nivel de armadura de la Trupalla.
     */
    public void setNivelArmadura(int nivelArmadura){
        this.nivelArmadura = nivelArmadura;
    }
    /**

     Retorna el nombre del chofer de la Trupalla.
     @return el nombre del chofer de la Trupalla.
     */
    public String getChofer(){
        return chofer;
    }
    /**

     Asigna el nombre del chofer de la Trupalla.
     @param chofer el nombre del chofer de la Trupalla.
     */
    public void setChofer(String chofer){
        this.chofer = chofer;
    }
}
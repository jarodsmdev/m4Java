package m4ABPRO5;

/**
 * @author Leonel Briones, Andrés Contreras, 
 * Priscila Carrillo, Kevin Moreno, Valentina Saldías
 * @version 21/02/2023
 */
public class Capacitacion {

    private int numero;
    private int rut;
    private String dia;
    private String hora;
    private String duracion;
    private int cantidadAsi;

    //contructor vacio
    public Capacitacion() {
    }

    //contructor completo

    /**
     * 
     * @param numero
     * @param rut
     * @param dia
     * @param hora
     * @param duracion
     * @param cantidadAsi
     */
    public Capacitacion(int numero, int rut, String dia, String hora, String duracion, int cantidadAsi) {
        this.numero = numero;
        this.rut = rut;
        this.dia = dia;
        this.hora = hora;
        this.duracion = duracion;
        this.cantidadAsi = cantidadAsi;
    }


    //MÉTODOS ACCESORES: GETTER Y SETTER

    public int getNumero() {
        return this.numero;
    }
    
    /**
     * 
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getrut() {
        return this.rut;
    }
    
    /**
     * 
     * @param rut
     */
    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getdia() {
        return this.dia;
    }

    /**
     * 
     * @param dia
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return this.hora;
    }

    /**
     * 
     * @param hora
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDuracion() {
        return duracion;
    }

    /**
     * 
     * @param duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadAss() {
        return cantidadAsi;
    }

    /**
     * 
     * @param cantidadAsi
     */
    public void setCantidadAss(int cantidadAsi) {
        this.cantidadAsi = cantidadAsi;
    }

    @Override
    public String toString() {
        return "Capacitacion: " + "\nnumero : " + numero + "\nrut: " + rut + "\ndia: " + dia + "\nhora: " + hora + "\nduracion: " + duracion + "\nCantidad asistentes: " + cantidadAsi;
    }


}

import java.io.Serializable;
/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Modelar Voluntariado 
 */

public class Voluntariado implements Serializable {
    private String Hora;
    private String Fecha;
    private String Lugar;


    /**
     *constructor
    */
    public Voluntariado(){
        Hora = "";
        Fecha = "";
        Lugar = "";
    }


    /**
     * Función para cambiar Lugar de la Voluntariado
     * @param Lugar Cadena con Lugar de la Voluntariado
     */
    public void setLugar(String Lugar){
        this.Lugar = Lugar;
    }


    /**
     * Funcion para obtener Lugar de la Voluntariado
     * @return Devuelve Lugar de la Voluntariado
     */
    public String getLugar(){
        return Lugar;
    }   
    
    /**
     * Funcion para obtener Hora del voluntariado
     * @return Devuelve hora del voluntariado
     */
    
    public void setHora(String Hora){
        this.Hora = Hora;
    }

    public String getHora(){
        return Lugar;
    }   
    


    /**
     * Función para cambiar Fecha de la Voluntariado
     * @param Fecha Cadena con Fecha de la Voluntariado
     */
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }

    /**
     * Funcion para obtener Fecha de la Voluntariado
     * @return Devuelve Fecha de la Voluntariado
     */
    public String getFecha(){
        return Fecha;
    }   

    /**
     * Funcion para concatenar y mostrar datos de voluntariado
     * @return Devuelve datos de voluntariado
     */
    public String toString(){
        return "Lugar : " + Lugar + "  "
            + "Fecha : " + Fecha + "  "
            + "Hora : " + Hora ;
    }
    }

import java.util.ArrayList;

/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Modelar Colectas futuras
 */

public class Colecta{
    private ArrayList<String> Material;
    private String Fecha;
    private String Lugar;


    /**
     *constructor
    */
    public Colecta(){
        Material = new ArrayList<String>();
        Fecha = "";
        Lugar = "";
    }

    /**
     * Función para cambiar Material de la Colecta 
     * @param index Indice de material a cambiar
     * @param Material Cadena con Material de la Colecta
     * No usar si el arraylist esta vacio
     */
    public void setMaterial(int index, String Material){
        this.Material.set(index, Material);
    }

    /**
     * Anadir material al arraylist
     * @param Material Material a agregar
     */
    public void newMaterial(String Material){
        this.Material.add(Material);
    }

    /**
     * Funcion para obtener Material de la Colecta
     * @return Devuelve Materiales de la Colecta
     */
    public ArrayList<String> getMaterial(){
        return Material;
    }   


    /**
     * Función para cambiar Fecha de la Colecta
     * @param Fecha Cadena con Fecha de la Colecta
     */
    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }

    /**
     * Funcion para obtener Fecha de la Colecta
     * @return Devuelve Fecha de la Colecta
     */
    public String getFecha(){
        return Fecha;
    }   


    /**
     * Función para cambiar Lugar de la Colecta
     * @param Lugar Cadena con Lugar de la Colecta
     */
    public void setLugar(String Lugar){
        this.Lugar = Lugar;
    }

    /**
     * Funcion para obtener Lugar de la Colecta
     * @return Devuelve Lugar de la Colecta
     */
    public String getLugar(){
        return Lugar;
    }   


    /**
     * Método que devuelve los datos de la colecta
     * @return Devuelve los datos de la colecta
     */

    public String toString(){

        return "\nLugar: " + Lugar
                + "\nFecha: " + Fecha
                + "\nMateriales: " + Material.get(0);
    }
}
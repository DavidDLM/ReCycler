import java.util.ArrayList;

/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Modelar perfil de Empresa
 */

public class Empresa{
    private String NombreEmpresa;
    private String Correo;
    private String Telefono;
    private String Direccion;
    private ArrayList<String> Material;

    /**
     *constructor
    */
    public Empresa(){
        NombreEmpresa = "";
        Correo = "";
        Telefono = "";
        Direccion = "";
        Material = new ArrayList<String>();
    }

    /**
     * Función para cambiar NombreEmpresa del Empresa
     * @param NombreEmpresa Cadena con NombreEmpresa del Empresa
     */
    public void setNombreEmpresa(String NombreEmpresa){
        this.NombreEmpresa = NombreEmpresa;
    }

    /**
     * Funcion para obtener NombreEmpresa del Empresa
     * @return Devuelve NombreEmpresa del Empresa
     */
    public String getNombreEmpresa(){
        return NombreEmpresa;
    }  
    
    /**
     * Función para cambiar Correo del Empresa
     * @param Correo Cadena con Correo del Empresa
     */
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }

    /**
     * Funcion para obtener Correo del Empresa
     * @return Devuelve Correo del Empresa
     */
    public String getCorreo(){
        return Correo;
    }   


    /**
     * Función para cambiar Telefono del Empresa
     * @param Telefono Cadena con Telefono del Empresa
     */
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }

    /**
     * Funcion para obtener Telefono del Empresa
     * @return Devuelve Telefono del Empresa
     */
    public String getTelefono(){
        return Telefono;
    }  


    /**
     * Función para cambiar Direccion del Empresa
     * @param Direccion Cadena con Direccion del Empresa
     */
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    /**
     * Funcion para obtener Direccion del Empresa
     * @return Devuelve Direccion del Empresa
     */
    public String getDireccion(){
        return Direccion;
    }   


    /**
     * Función para cambiar Material de la Empresa material
     * @param index Indice de material a cambiar
     * @param Material Cadena con Material de la Empresa
     * NO USAR CUANDO ARRAYLIST ESTE VACIO
     */
    public void setMaterial(int index, String Material){
        this.Material.set(index, Material);
    }

    /**
     * Funcion para anadir material al arraylist
     * @param Material Material a agregar
     */
    public void newMaterial(String Material){
        this.Material.add(Material);
    }

    /**
     * Funcion para obtener Material de la Empresa
     * @return Devuelve Materiales de la Empresa
     */
    public ArrayList<String> getMaterial(){
        return Material;
    }   

    /**
     * Funcion que devuelve un string con datos del Empresa
     * @return Devuelve String con datos del Empresa
     */
    public String toString(){
        return "\nEmpresa: " + NombreEmpresa
                + "\nCorreo electronico: " + Correo
                + "\nNumero telefonico: " + Telefono
                + "\nDireccion del domicilio: " + Direccion
                + "\nMaterial: " + Material.get(0)
                ;

    }
}
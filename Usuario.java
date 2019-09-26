import java.io.Serializable;
/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Modelar perfil de usuario
 */

public class Usuario implements Serializable { //Se implementa serializable
    private String UserName;
    private String Contrasena;
    private String Correo;
    private String Telefono;
    private String Direccion;
    private String Nombre;

    /**
     *constructor
    */
    public Usuario(String usuario1, String contrasena1, String correo1, String telefono1, String direccion1, String nombre1){
        UserName = usuario1;
        Contrasena = contrasena1;
        Correo = correo1;
        Telefono = telefono1;
        Direccion = direccion1;
        Nombre = nombre1;
    }
    /**
     *constructor
    */
    public Usuario(){
        UserName = "";
        Contrasena = "";
        Correo = "";
        Telefono = "";
        Direccion = "";
        Nombre = "";
    }
    

    /**
     * Función para cambiar UserName del usuario
     * @param UserName Cadena con UserName del usuario
     */
    public void setUserName(String UserName){
        this.UserName = UserName;
    }

    /**
     * Funcion para obtener UserName del usuario
     * @return Devuelve UserName del usuario
     */
    public String getUserName(){
        return UserName;
    }  

    /**
     * Función para cambiar Contrasena del usuario
     * @param Contrasena Cadena con Contrasena del usuario
     */
    public void setContrasena(String Contrasena){
        this.Contrasena = Contrasena;
    }

    /**
     * Funcion para obtener Contrasena del usuario
     * @return Devuelve Contrasena del usuario
     */
    public String getContrasena(){
        return Contrasena;
    }   

    
    /**
     * Función para cambiar Correo del usuario
     * @param Correo Cadena con Correo del usuario
     */
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }

    /**
     * Funcion para obtener Correo del usuario
     * @return Devuelve Correo del usuario
     */
    public String getCorreo(){
        return Correo;
    }   


    /**
     * Función para cambiar Telefono del usuario
     * @param Telefono Cadena con Telefono del usuario
     */
    public void setTelefono(String Telefono){
        this.Telefono = Telefono;
    }

    /**
     * Funcion para obtener Telefono del usuario
     * @return Devuelve Telefono del usuario
     */
    public String getTelefono(){
        return Telefono;
    }  


    /**
     * Función para cambiar Direccion del usuario
     * @param Direccion Cadena con Direccion del usuario
     */
    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }
    
    /**
     * Funcion para obtener Direccion del usuario
     * @return Devuelve Direccion del usuario
     */
    public String getDireccion(){
        return Direccion;
    }   


    /**
     * Función para cambiar Nombre del usuario
     * @param Nombre Cadena con Nombre del usuario
     */
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    /**
     * Funcion para obtener Nombre del usuario
     * @return Devuelve Nombre del usuario
     */
    public String getNombre(){
        return Nombre;
    }   

    /**
     * Funcion que devuelve un string con datos del usuario
     * @return Devuelve String con datos del usuario
     */
    public String toString(){
        return "\nUsuario: " + UserName
                + "\nContrasena: " + Contrasena
                + "\nNombre: " + Nombre
                + "\nCorreo electronico: " + Correo
                + "\nNumero telefonico: " + Telefono
                + "\nDireccion del domicilio: " + Direccion;

    }
}
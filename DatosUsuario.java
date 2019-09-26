/**
 * @author  Grupo Re-Cycler
 * @date 18-08-2019
 * Universidad del Valle de Guatemala
 * Datos Usuario 
 */
public class DatosUsuario {
	private String UserName;
    private String Contrasena;
    private String Correo;
    private String Telefono;
    private String Direccion;
    
    public DatosUsuario() {
    	UserName =  "";
    	Contrasena = "";
    	Correo = "";
    	Telefono = "";
    	Direccion = "";
    }
    public String UserName() {
		UserName = UsuarioGUI.tfUsuario.getText();
		return UserName;	
    }
    public String Contrasena() {
		Contrasena = UsuarioGUI.pfContrasena.getText();
		return Contrasena;
    }
    public String Correo() {
		Correo = UsuarioGUI.tfCorreo.getText();
		return Correo;
    }
    public String Telefono() {
		Telefono = UsuarioGUI.tfTelefono.getText();
		return Telefono;
    }
    public String Direccion() {
		Direccion = UsuarioGUI.tfDireccion.getText();
		return Direccion;
    }
}

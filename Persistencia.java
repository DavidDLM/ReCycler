/**
* Create the TXT archive
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Persistencia {
	
	public Persistencia(Usuario u) throws FileNotFoundException, IOException, ClassNotFoundException {

		Usuario u1 = new Usuario(null,null,null,null,null,null);
		DatosUsuario usuario1 = new DatosUsuario();
	
		u1.setUserName(usuario1.UserName());
		u1.setContrasena(usuario1.Contrasena());
		u1.setCorreo(usuario1.Correo());
		u1.setTelefono(usuario1.Telefono());
		u1.setDireccion(usuario1.Direccion());
	
		//ObjectOutputStream
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Datos.txt"));
		out.writeObject(u1);
			
			
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Datos.txt"));
		Usuario u2 = (Usuario) in.readObject();
	}
			
}
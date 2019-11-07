/**
* Create the TXT archive
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Persistencia {
	
	public Persistencia() {
		
	
	}

	public void escribirArchivo(List<Usuario> listaUsuarios) {
		FileWriter fichero  = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("Usuarios.txt",true);
			pw = new PrintWriter(fichero);
			String linea = "";
			for(Usuario user:listaUsuarios) {
				linea = "Usuario: " + user.getUserName() +"," + user.getNombre() + "," + user.getContrasena() +","+user.getTelefono() +
						"," +user.getDireccion()+","+user.getCorreo();
				pw.println(linea);
						}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fichero.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void escribirVoluntariado(List<Voluntariado> listaVoluntariado) {
		
		FileWriter fichero  = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("BaseVoluntariados.txt",true);
			pw = new PrintWriter(fichero);
			String linea = "";
			for(Voluntariado vol: listaVoluntariado) {
				linea = "Voluntariado: " + vol.getFecha() +","+ vol.getHora() + ","+vol.getLugar();
				pw.println(linea);
						}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fichero.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void escribirColecta(List<Colecta> listaColectas) {
		
		FileWriter fichero  = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("BaseColectas.txt",true);
			pw = new PrintWriter(fichero);
			String linea = "";
			for(Colecta col: listaColectas) {
				linea = "Colecta: " + col.getFecha() +  ","+col.getLugar();
				pw.println(linea);
						}
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fichero.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
			
}

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author  Grupo Re-Cycler
 * @date 23-08-2019
 * Universidad del Valle de Guatemala
 * Modelador de aplicaciÃƒÂ³n Re-cycler
 */



/**
 * Declarar las clases como un Arraylist
 */
public class Aplicacion{
    static ArrayList<Empresa> empresas;
    static Usuario usuario;
    static ArrayList<Voluntariado> voluntariados;
    static ArrayList<Colecta> colectas;
    static ArrayList<String> usuarios = new ArrayList<String>();
	static ArrayList<String> contrasenas = new ArrayList<String>();
    static ArrayList <String> fechas;
    static ArrayList <String> fechascolectas;
	/*private Archivos es;*/

    public Aplicacion (){
        empresas = new ArrayList<Empresa>();
        usuario = new Usuario();
        voluntariados = new ArrayList<Voluntariado>();
        colectas = new ArrayList<Colecta>();
        fechas =  new ArrayList <String>();
        fechascolectas = new ArrayList <String>();
    }

    /**
     * MÃƒÂ©todo para obtener la lista de empresas
     * @return ArrayList con las empresas
     */
    public ArrayList<Empresa> getEmpresa(){
        return empresas;
        }
    
    /**
     * MÃƒÂ©todo para obtener objeto de usuario
     * @return Objeto de tipo usuario
     */  
    public Usuario getUsuario(){
        return usuario;
        }

    /**
     * MÃƒÂ©todo para obtener la lista de voluntariados
     * @return ArrayList con los voluntariados
     */
    public ArrayList<Voluntariado> getVoluntariado(){
        return voluntariados;
        }

    /**
     * MÃƒÂ©todo para obtener la lista de colectas
     * @return ArrayList con las colectas
     */
    public ArrayList<Colecta> getColecta(){
        return colectas;
        }
    public ArrayList<String> getFechas() {
		return fechas;
	}

	public void setFechas(ArrayList<String> fechas) {
		this.fechas = fechas;
	}
	
	

	public ArrayList<String> getFechascolectas() {
		return fechascolectas;
	}

	public void setFechascolectas(ArrayList<String> fechascolectas) {
		this.fechascolectas = fechascolectas;
	}


    /**
     * MÃƒÂ©todo para agregar nueva empresa al ArrayList de empress.
     * @param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea agregar
     * @param Correo Corereo de la empresa de reciclaje que el usuario desea agregar
     * @param Telefono Telefono de la empresa de reciclaje que el usuario desea agregar
     * @param Direccion Direccion de la empresa de reciclaje que el usuario desea agregar
     */
    public void setNewEmpresa(String NombreEmpresa, String Correo, String Telefono, String Direccion ){
        /**
         * Se crea un objeto de tipo Empresa
         */
        Empresa Business = new Empresa();
        /**
         * Todos los sets de Empresa para el objeto Business
         */
        Business.setNombreEmpresa(NombreEmpresa);
        Business.setCorreo(Correo);
        Business.setTelefono(Telefono);
        Business.setDireccion(Direccion);
        /** 
         * Se agrega al arraylist Empresas el array Business
         */
        empresas.add(Business);
        
    }

    /** 
     * MÃƒÂ©todo para cambiar los datos de una empresa existente
     * @param x Indice de la empresa de la cual se quiere cambiar la informaciÃƒÂ³n
     * @param NombreEmpresa Nombre de la empresa de reciclaje que el usuario desea modificar
     * @param Correo Corereo de la empresa de reciclaje que el usuario desea modificar
     * @param Telefono Telefono de la empresa de reciclaje que el usuario desea modificar
     * @param Direccion Direccion de la empresa de reciclaje que el usuario desea modificar
     */
    public void modificarEmpresa(int x, String NombreEmpresa, String Correo, String Telefono, String Direccion){
        /**
         * Se crea un objeto de tipo Empresa
         */
        Empresa Business = new Empresa();
        /**
         * Todos los sets de Empresa para el objeto Business
         */
        Business.setNombreEmpresa(NombreEmpresa);
        Business.setCorreo(Correo);
        Business.setTelefono(Telefono);
        Business.setDireccion(Direccion);
        /**
         * Se sustituye los nuevos datos "Business" en la posiciÃƒÂ³n elegida del arraylist empresas
         */
        empresas.set(x,Business);
        
    }


    /**MÃƒÂ©todo para setear los datos del usuario
     * @param Username Username del usuario 
     * @param ContraseÃƒÂ±a ContraseÃƒÂ±a que el usuario desee
     * @param Correo Correo que el usuario desea agregar
     * @param Telefono Telefono que el usuario desea agregar
     * @param Direccion Direccion que el usuario desea agregar
     * @param Nombre Nombre del usuario que desee registrar
     */
    
    //public void setUsuario(String UserName, String Contrasena, String Correo, String Telefono, String Direccion, String Nombre){
    //    usuario.setUserName(UserName);
     //   usuario.setContrasena(Contrasena);
      //  usuario.setCorreo(Correo);
      //  usuario.setTelefono(Telefono);
      //  usuario.setDireccion(Direccion);
      //  usuario.setNombre(Nombre);
   // }



    /** MÃƒÂ©todo para agregar nuevo voluntariado
     * @param Lugar = Lugar del voluntaridao que el usuario desea agregar
     * @param Fecha = Fecha del voluntariado que el usuario desea agregar
     */
    public void setNewVoluntariado(String Lugar, String Fecha, String Hora){
        /**
         * Se crea un objeto de tipo Voluntariado
         */
        Voluntariado Voluntariado = new Voluntariado();
        /**
         * Todos los sets de Voluntariado para el objeto Business
         */
        Voluntariado.setLugar(Lugar);
        Voluntariado.setFecha(Fecha);
        Voluntariado.setHora(Hora);
        /**
         * Se agrega al arraylist Empresas el array Business
         */
        voluntariados.add(Voluntariado);
    }

    /** MÃƒÂ©todo para cambiar los datos de un voluntariado existente
     * @param x nÃƒÂºmero de la posiciÃƒÂ³n del voluntariado que se desea cambiar la informaciÃƒÂ³n
     * @param Lugar Lugar del voluntariado que el usuario desea modificar
     * @param Fecha Fecha del voluntariado que el usuario desea modificar
     */
    public void modificarVoluntariado(int x,String Lugar, String Fecha){
        /**
         * Se crea un objeto de tipo Voluntariado
         */
        Voluntariado Business = new Voluntariado();
        /** 
         * Todos los sets de Voluntariado para el objeto Business
         */
        Business.setLugar(Lugar);
        Business.setFecha(Fecha);
        /**
         * Se sustituye los nuevos datos "Business" en la posiciÃƒÂ³n x del arraylist voluntariados
         */
        voluntariados.set(x,Business);
    }




    /** MÃƒÂ©todo para agregar nueva colecta
     * @param Material de reciclaje que el usuario desea agregar a la Colecta
     * @param Fecha Fecha de la colectan de reciclaje que el usuario desea agregar
     * @param Lugar Lugar de la colecta de reciclaje que el usuario desea agregar
     */
    public void setNewColecta(String Material, String Fecha, String Lugar){
        /**
         * Se crea un objeto de tipo Colecta
         */
        Colecta Business = new Colecta();
        /**
         * Todos los sets de Colecta para el objeto Business
         */
        Business.newMaterial(Material);
        Business.setFecha(Fecha);
        Business.setLugar(Lugar);
        /**
         * Se agrega al arraylist Empresas el array Business
         */
        colectas.add(Business);
    }

    /**
     * Setter para colecta especÃƒÂ­fica
     * @param x PosiciÃƒÂ³n (indice) de colecta a modificar
     * @param Material Material a recolectar en colecta
     * @param Fecha Fecha en la que se darÃƒÂ¡ la colecta
     * @param Lugar Lugar en el que se realizarÃƒÂ¡ la colecta
     */
    public void modificarColecta(int x, String Material, String Fecha, String Lugar){
        /**
         * Se crea un objeto de tipo Colecta
         */
        Colecta Business = new Colecta();
        /**
         * Todos los sets de Empresa para el objeto Business
         */
        Business.setMaterial(0, Material);
        Business.setFecha(Fecha);
        Business.setLugar(Lugar);
        /**
         * Se sustituye los nuevos datos "Business" en la posiciÃƒÂ³n x del arraylist colectas
         */
        colectas.set(x,Business);
    }



    /**
     * MÃƒÂ©todo toString (concatena los atributos del objeto en un string)
     * @return String con datos de empresas
     */
    public String toString(){
        String PrintEmpresa = "\nEmpresas: " + empresas.toString();
        String PrintUsuario = "\nUsuario: " + usuario.toString();
        String PrintVoluntariados = "\nVoluntariados: " + voluntariados.toString();
        String PrintColectas = "\nColectas: " + colectas.toString();

        return PrintEmpresa + PrintUsuario + PrintVoluntariados + PrintColectas;

    }
    
    /**
     * MÃƒÂ©todo para calcular ganancia  del material a reciclar
     * @return ganancia
     */
    public static String getcalculadora (String material, float cantidad) {
    	double ganancia=0;
    	
    	if (material == "Metal") {
    		ganancia = cantidad *0.79;
    	}
    		
    	else if (material == "Plastico") {
    		ganancia = cantidad*0.50;
    	}
    	
    	else if (material =="Vidrio") {
    		ganancia = cantidad*0.24;
    	}
    	else if  (material =="Papel") {
    		ganancia = cantidad * 1.19;
    	}
    	return String.valueOf(ganancia);
    		
    		
    	}
    /**
     * MÃƒÂ©todo para validar numeros
     * @return boolean
     */
    public boolean getvalidacion (String valor) {
    	float numero;
    	try
    	{
    		numero = Float.parseFloat(valor);
    		return true;
    	}
    	catch (Exception e) {
    		return false;
    	}
    }
    
    /**
     * MÃƒÂ©todo para obtener informacion de empresas de reciclaje
     * @return String
     */
    public String getinformacionempresas() {
    	return ("**CODIGUA**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Servicio a domicilio\n" + 
    			"\n" + 
    			"Telefono:\n" + 
    			"30452302|22789503\n" + 
    			"\n" + 
    			"Horario:\n" + 
    			"7:00 a.m. a 5:00 p.m.\n" + 
    			"\n" + 
    			"UbicaciÃ³n\n" + 
    			"Avenida Petapa 42-21 zona 12 \n" + 
    			"\n" + 
    			"**Red EcolÃ³gica**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Recicla tus hojas usadas\n" + 
    			"\n" + 
    			"TelÃ©fono\n" + 
    			"24271360\n" + 
    			"\n" + 
    			"UbicaciÃ³n\n" + 
    			"KilÃ³metro 8 Carretera al Atlantico, Zona 18 \n" + 
    			"\n" + 
    			"**Recicladora La Joya**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Reciben papel, cartÃ³n, cartulina, latas, plastico\n" + 
    			"\n" + 
    			"Telefono:\n" + 
    			"24481286|24482178\n" + 
    			"\n" + 
    			"Ubicacion:\n" + 
    			"1era. Calle 1-85 Colonia Los Alamos zona 6 de San Miguel Petapa\n" + 
    			"");
    	
    }
    /**
     * MÃƒÂ©todo para obtener informacion de los creadores
     * @return String
     */
    public String getinformacionsobrenosotros() {
    	return ("Somos alumnos de la\n" + 
    			"Universidad del valle que \n" + 
    			"trabajamos en un proyecto para \n" + 
    			"asi poder resolver alguna problematica \n" + 
    			"del pais, al analizar que es\n" + 
    			"lo que afectaba mas al paÃ­s \n" + 
    			"determinamos que nadie \n" + 
    			"reciclaba, por lo tanto\n" + 
    			" decidimos realizar este programa\n" + 
    			"para incentivar a los demas a \n" + 
    			"reciclar.");
}
    /**
     * MÃƒÂ©todo para obtener las preguntas mas frecuentes
     * @return String
     */
    public String getpreguntasfrecuentes() {
    	return("======PREGUNTAS FRECUENTES======\n" + 
    			"\n" + 
    			"Pregunta: Â¿Hay otros idiomas disponibles?\n" + 
    			"Respuesta: No por el momento, ya que \n" + 
    			"en el paÃ­s el idioma mÃ¡s popular es\n" + 
    			"el espaÃ±ol, no consideramos necesario\n" + 
    			"agregar otro idioma mientras que no\n" + 
    			"nos expandamos a otro paÃ­s\n" + 
    			"\n" + 
    			"Pregunta: Â¿PorquÃ© deberÃ­a reciclar?\n" + 
    			"Respuesta: Porque el la contaminaciÃ³n\n" + 
    			"mata al planeta y reciclando puedes \n" + 
    			"reducirla.\n" + 
    			"\n" + 
    			"Pregunta: Â¿CÃ³mo puedo ayudar mÃ¡s?\n" + 
    			"Respuesta: Trata de usar productos \n" + 
    			"biodegradables.");
    	
    }
     public void IngresarUsuario(String x){
    	usuarios.add(x);
    }
    public void IngresarContrasena(String x) {
    	contrasenas.add(x);
    }

	public ArrayList<String> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<String> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<String> getContrasenas() {
		return contrasenas;
	}

	public void setContrasenas(ArrayList<String> contrasenas) {
		this.contrasenas = contrasenas;
	}
	public String Usuarios(String x) {
		String mensaje ="";
		for(String j: usuarios) {
			mensaje += j;
		}
		if(mensaje.contains(x)) {
			mensaje = x;
		}
		return mensaje;
		}
		
	
	
	public String Contrasenas(String x) {
		String mensaje ="";
		for(String j: contrasenas) {
			mensaje += j;
		}
		if(mensaje.contains(x)) {
			mensaje = x;
		}
		return mensaje;
		}
	
	/*public void Escribir()
	{
		String m = "";
		for(String l: usuarios)
			m+= l.toString();
		for(String l: contrasenas)
			m+= l.toString();
		es = new Archivos(m);
	}*/
	public String MostrarLista() {
		String m = "";
		for(int i = 0 ; i < usuarios.size(); i++) {
			m += usuarios.get(i);
			
		}
		return m;
	}
	    public static boolean EmailCorrecto(String email) {
       
        boolean valido = false;
        
        Pattern patronEmail = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{2,})$");
   
        Matcher mEmail = patronEmail.matcher(email.toLowerCase());
        if (mEmail.matches()){
           valido = true; 
        }
        return valido;
    }

  //metodo para validar correo electronio
    public boolean isEmail(String correo) {
    Pattern pat = null;
    Matcher mat = null;
    pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
    mat = pat.matcher(correo);
    if (mat.find()) {
    System.out.println("[" + mat.group() + "]");
    return true;
    }else{
    return false;
    }
    }
    
    public boolean VerificarEmail(String correo) {
    	boolean validar = false;
    	if(correo.contains("@")) {
    		validar = true;
    	}
    	else {
    		validar = false;
    	}
		return validar;
    	
    }
	
	 public boolean ValidarContrasena(String contrasena) {
    	boolean validar = false;
    	if(contrasena.length() >= 6) {
    		validar = true;
    	}
    	else {
    		validar = false;
    	}
		return validar;
    }



}



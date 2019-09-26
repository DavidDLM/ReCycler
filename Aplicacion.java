import java.util.ArrayList;
/**
 * @author  Grupo Re-Cycler
 * @date 23-08-2019
 * Universidad del Valle de Guatemala
 * Modelador de aplicación Re-cycler
 */



/**
 * Declarar las clases como un Arraylist
 */
public class Aplicacion{
    private ArrayList<Empresa> empresas;
    private Usuario usuario;
    private ArrayList<Voluntariado> voluntariados;
    private ArrayList<Colecta> colectas;

    public Aplicacion (){
        empresas = new ArrayList<Empresa>();
        usuario = new Usuario();
        voluntariados = new ArrayList<Voluntariado>();
        colectas = new ArrayList<Colecta>();
    }

    /**
     * Método para obtener la lista de empresas
     * @return ArrayList con las empresas
     */
    public ArrayList<Empresa> getEmpresa(){
        return empresas;
        }
    
    /**
     * Método para obtener objeto de usuario
     * @return Objeto de tipo usuario
     */  
    public Usuario getUsuario(){
        return usuario;
        }

    /**
     * Método para obtener la lista de voluntariados
     * @return ArrayList con los voluntariados
     */
    public ArrayList<Voluntariado> getVoluntariado(){
        return voluntariados;
        }

    /**
     * Método para obtener la lista de colectas
     * @return ArrayList con las colectas
     */
    public ArrayList<Colecta> getColecta(){
        return colectas;
        }

    /**
     * Método para agregar nueva empresa al ArrayList de empress.
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
     * Método para cambiar los datos de una empresa existente
     * @param x Indice de la empresa de la cual se quiere cambiar la información
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
         * Se sustituye los nuevos datos "Business" en la posición elegida del arraylist empresas
         */
        empresas.set(x,Business);
        
    }


    /**Método para setear los datos del usuario
     * @param Username Username del usuario 
     * @param Contraseña Contraseña que el usuario desee
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



    /** Método para agregar nuevo voluntariado
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

    /** Método para cambiar los datos de un voluntariado existente
     * @param x número de la posición del voluntariado que se desea cambiar la información
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
         * Se sustituye los nuevos datos "Business" en la posición x del arraylist voluntariados
         */
        voluntariados.set(x,Business);
    }




    /** Método para agregar nueva colecta
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
        Business.setMaterial(0, Material);
        Business.setFecha(Fecha);
        Business.setLugar(Lugar);
        /**
         * Se agrega al arraylist Empresas el array Business
         */
        colectas.add(Business);
    }

    /**
     * Setter para colecta específica
     * @param x Posición (indice) de colecta a modificar
     * @param Material Material a recolectar en colecta
     * @param Fecha Fecha en la que se dará la colecta
     * @param Lugar Lugar en el que se realizará la colecta
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
         * Se sustituye los nuevos datos "Business" en la posición x del arraylist colectas
         */
        colectas.set(x,Business);
    }



    /**
     * Método toString (concatena los atributos del objeto en un string)
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
     * Método para calcular ganancia  del material a reciclar
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
     * Método para validar numeros
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
     * Método para obtener informacion de empresas de reciclaje
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
    			"Ubicaci�n\n" + 
    			"Avenida Petapa 42-21 zona 12 \n" + 
    			"\n" + 
    			"**Red Ecol�gica**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Recicla tus hojas usadas\n" + 
    			"\n" + 
    			"Tel�fono\n" + 
    			"24271360\n" + 
    			"\n" + 
    			"Ubicaci�n\n" + 
    			"Kil�metro 8 Carretera al Atll�ntico, Zona 18 \n" + 
    			"\n" + 
    			"**Recicladora La Joya**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Reciben papel, cart�n, cartulina, latas, pl�stico\n" + 
    			"\n" + 
    			"Telefono:\n" + 
    			"24481286|24482178\n" + 
    			"\n" + 
    			"Ubicacion:\n" + 
    			"1era. Calle 1-85 Colonia Los �lamos zona 6 de San Miguel Petapa\n" + 
    			"");
    	
    }
    /**
     * Método para obtener informacion de los creadores
     * @return String
     */
    public String getinformacionsobrenosotros() {
    	return ("Somos alumnos de la\n" + 
    			"Universidad del valle que \n" + 
    			"trabajamos en un proyecto para \n" + 
    			"asi poder resolver alguna problematica \n" + 
    			"del pais, al analizar que es\n" + 
    			"lo que afectaba mas al pa�s \n" + 
    			"determinamos que nadie \n" + 
    			"reciclaba, por lo tanto\n" + 
    			" decidimos realizar este programa\n" + 
    			"para incentivar a los demas a \n" + 
    			"reciclar.");
}
    /**
     * Método para obtener las preguntas mas frecuentes
     * @return String
     */
    public String getpreguntasfrecuentes() {
    	return("======PREGUNTAS FRECUENTES======\n" + 
    			"\n" + 
    			"Pregunta: �Hay otros idiomas disponibles?\n" + 
    			"Respuesta: No por el momento, ya que \n" + 
    			"en el pa�s el idioma m�s popular es\n" + 
    			"el espa�ol, no consideramos necesario\n" + 
    			"agregar otro idioma mientras que no\n" + 
    			"nos expandamos a otro pa�s\n" + 
    			"\n" + 
    			"Pregunta: �Porqu� deber�a reciclar?\n" + 
    			"Respuesta: Porque el la contaminaci�n\n" + 
    			"mata al planeta y reciclando puedes \n" + 
    			"reducirla.\n" + 
    			"\n" + 
    			"Pregunta: �C�mo puedo ayudar m�s?\n" + 
    			"Respuesta: Trata de usar productos \n" + 
    			"biodegradables.");
    	
    }
}
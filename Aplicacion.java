import java.util.ArrayList;
/**
 * @author  Grupo Re-Cycler
 * @date 23-08-2019
 * Universidad del Valle de Guatemala
 * Modelador de aplicaciÃ³n Re-cycler
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
     * MÃ©todo para obtener la lista de empresas
     * @return ArrayList con las empresas
     */
    public ArrayList<Empresa> getEmpresa(){
        return empresas;
        }
    
    /**
     * MÃ©todo para obtener objeto de usuario
     * @return Objeto de tipo usuario
     */  
    public Usuario getUsuario(){
        return usuario;
        }

    /**
     * MÃ©todo para obtener la lista de voluntariados
     * @return ArrayList con los voluntariados
     */
    public ArrayList<Voluntariado> getVoluntariado(){
        return voluntariados;
        }

    /**
     * MÃ©todo para obtener la lista de colectas
     * @return ArrayList con las colectas
     */
    public ArrayList<Colecta> getColecta(){
        return colectas;
        }

    /**
     * MÃ©todo para agregar nueva empresa al ArrayList de empress.
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
     * MÃ©todo para cambiar los datos de una empresa existente
     * @param x Indice de la empresa de la cual se quiere cambiar la informaciÃ³n
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
         * Se sustituye los nuevos datos "Business" en la posiciÃ³n elegida del arraylist empresas
         */
        empresas.set(x,Business);
        
    }


    /**MÃ©todo para setear los datos del usuario
     * @param Username Username del usuario 
     * @param ContraseÃ±a ContraseÃ±a que el usuario desee
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



    /** MÃ©todo para agregar nuevo voluntariado
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

    /** MÃ©todo para cambiar los datos de un voluntariado existente
     * @param x nÃºmero de la posiciÃ³n del voluntariado que se desea cambiar la informaciÃ³n
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
         * Se sustituye los nuevos datos "Business" en la posiciÃ³n x del arraylist voluntariados
         */
        voluntariados.set(x,Business);
    }




    /** MÃ©todo para agregar nueva colecta
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
     * Setter para colecta especÃ­fica
     * @param x PosiciÃ³n (indice) de colecta a modificar
     * @param Material Material a recolectar en colecta
     * @param Fecha Fecha en la que se darÃ¡ la colecta
     * @param Lugar Lugar en el que se realizarÃ¡ la colecta
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
         * Se sustituye los nuevos datos "Business" en la posiciÃ³n x del arraylist colectas
         */
        colectas.set(x,Business);
    }



    /**
     * MÃ©todo toString (concatena los atributos del objeto en un string)
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
     * MÃ©todo para calcular ganancia  del material a reciclar
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
     * MÃ©todo para validar numeros
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
     * MÃ©todo para obtener informacion de empresas de reciclaje
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
    			"Ubicación\n" + 
    			"Avenida Petapa 42-21 zona 12 \n" + 
    			"\n" + 
    			"**Red Ecológica**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Recicla tus hojas usadas\n" + 
    			"\n" + 
    			"Teléfono\n" + 
    			"24271360\n" + 
    			"\n" + 
    			"Ubicación\n" + 
    			"Kilómetro 8 Carretera al Atlantico, Zona 18 \n" + 
    			"\n" + 
    			"**Recicladora La Joya**\n" + 
    			"\n" + 
    			"Caracteristica principal:\n" + 
    			"Reciben papel, cartón, cartulina, latas, plastico\n" + 
    			"\n" + 
    			"Telefono:\n" + 
    			"24481286|24482178\n" + 
    			"\n" + 
    			"Ubicacion:\n" + 
    			"1era. Calle 1-85 Colonia Los Alamos zona 6 de San Miguel Petapa\n" + 
    			"");
    	
    }
    /**
     * MÃ©todo para obtener informacion de los creadores
     * @return String
     */
    public String getinformacionsobrenosotros() {
    	return ("Somos alumnos de la\n" + 
    			"Universidad del valle que \n" + 
    			"trabajamos en un proyecto para \n" + 
    			"asi poder resolver alguna problematica \n" + 
    			"del pais, al analizar que es\n" + 
    			"lo que afectaba mas al país \n" + 
    			"determinamos que nadie \n" + 
    			"reciclaba, por lo tanto\n" + 
    			" decidimos realizar este programa\n" + 
    			"para incentivar a los demas a \n" + 
    			"reciclar.");
}
    /**
     * MÃ©todo para obtener las preguntas mas frecuentes
     * @return String
     */
    public String getpreguntasfrecuentes() {
    	return("======PREGUNTAS FRECUENTES======\n" + 
    			"\n" + 
    			"Pregunta: ¿Hay otros idiomas disponibles?\n" + 
    			"Respuesta: No por el momento, ya que \n" + 
    			"en el país el idioma más popular es\n" + 
    			"el español, no consideramos necesario\n" + 
    			"agregar otro idioma mientras que no\n" + 
    			"nos expandamos a otro país\n" + 
    			"\n" + 
    			"Pregunta: ¿Porqué debería reciclar?\n" + 
    			"Respuesta: Porque el la contaminación\n" + 
    			"mata al planeta y reciclando puedes \n" + 
    			"reducirla.\n" + 
    			"\n" + 
    			"Pregunta: ¿Cómo puedo ayudar más?\n" + 
    			"Respuesta: Trata de usar productos \n" + 
    			"biodegradables.");
    	
    }


}

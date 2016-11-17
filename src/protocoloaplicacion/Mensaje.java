/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocoloaplicacion;

/**
 *
 * @author Francisco
 */
public class Mensaje implements Protocolo{
    
    protected String header="";
    protected Protocolo SP;
    protected Datos data = null;
    protected Protocolo CRLF;
    
    public Mensaje(String cabecera, Datos data){
        
        this.header = cabecera;
        this.data = data;
    }
    
    public byte[]toByteArray(){
    
        String mensaje = header +SP+data.toString()+CRLF;
        return mensaje.getBytes();  
    }
    
    
    
}
/**Clase que contendrá los datos
 * 
 * @author Francisco, Ángel
 */
class Datos{
    
    protected int id;
    protected String rutina;
    /**Constructor que monta los datos que crea el servidor como respuesta a  una 
     * petición del cliente
     * 
     * @param id identificador de usuario asociado a una rutina y dieta correspondiente
     * @param rutina String que contendrá la rutina (en el futuro puede ser una clase rutina)
     */
    public Datos(int id, String rutina){
    
        this.id = id;
        this.rutina = rutina;
    
    }
    /**Constructor que monta los datos cuando el cliente envia una petición al servidor
     * 
     * @param id identificador de usuario
     */
    public Datos(int id){
        this.id = id;
    }

    /**Este método permite mostrar la información completa del objeto
     * 
     * @return 
     */
    public String toString(){
        return String.valueOf(id)+" "+rutina;
    }
     
}


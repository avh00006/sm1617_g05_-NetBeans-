/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package protocoloaplicacion;

/** Clase que contiene el mensaje 
 *
 * @author Francisco,Ángel
 */
public class Mensaje implements Protocolo{
    
    protected String header="";
    protected Datos data = null;
    
    /**Constructor para el mensaje
     * 
     * @param cabecera contiene los identificadores de la cabecera
     * @param data variable para los datos del mensaje
     */
    public Mensaje(String cabecera, Datos data){
        
        this.header = cabecera;
        this.data = data;
    }
    
    /**Método que devuelve un array de bytes
     * 
     * @return devuelve el mensaje en un array de bytes
     */
    public byte[]toByteArray(){
    
        String mensaje = header +SP+data.toString()+CRLF;
        return mensaje.getBytes();  
    }
    
    
    /**Este método permite mostrar la información completa del objeto
     * 
     * @return devuelve un string con el mensaje
     */
    public String toString(){
        
        return header+SP+data+CRLF;
        
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
     * @return devuelve un String con el identificador de usuario y la rutina
     */
    public String toString(){
        return String.valueOf(id)+" "+rutina;
    }
     
}


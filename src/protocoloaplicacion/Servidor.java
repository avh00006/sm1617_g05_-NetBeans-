package protocoloaplicacion;

import java.io.IOException;
import java.net.*;

/**Clase abstracta que implementa el servidor
 * 
 * @author Francisco, Ángel
 */
public abstract class Servidor implements Protocolo{


	static ServerSocket mServidor = null;
        
        /**Método abstracto para el registro en la aplicación
         * 
         * @param nombre define el nombre del usuario
         * @param apell define los apellidos del usuario
         * @param dni identificación del DNI del usuario 
         * @param email correo eléctronico del usuario
         * @param pass contraseña del usuario
         */
        abstract public boolean registro(String nombre,String apell, String dni, String email,String pass);   
        
        /**Método abstracto para logeo de usuarios
         * 
         * @param email correo eléctronico del usuario
         * @param pass contraseña del usuario
         */
        abstract public boolean login(String email,String pass);
        
        
        /**Método abstracto para cierre de sesión
         * 
         * @param salir booleano utilizado para cerrar la sesión
         */
        abstract public boolean cierresesion(boolean salir);
        
        
        /**Método abstracto para realizar la baja del usuario
         * 
         * @param id_usuario identificador del usuario generado cuando se registra
         */
        abstract public boolean bajausuario(int id_usuario);
        
        
        /**Método abstracto que busca la rutina asociada al usuario gracias a su identificador
         * 
         * @param id_usuario identificador del usuario generado cuando se registra 
         */
        abstract public String[] buscarrutina(int id_usuario);
        
        /**Método abstracto que busca la dieta asociada al usuario gracias a su identificador
         * 
         * @param id_usuario identificador del usuario generado cuando se registra 
         */
        abstract public String[] buscardieta(int id_usuario);
	
        /**Método abstracto que recoge el peso del usuario
         * 
         * @param peso variable para el peso del usuario
         */
        abstract public double registropeso(double peso);
        
        /**Método abstracto que devuelve una gráfica con la evolución del usuario
         * 
         */
        abstract public void grafevoluc();
	

}
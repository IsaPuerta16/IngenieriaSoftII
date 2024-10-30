/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2_factory_method;

/**
 *
 * @author jacob
 */
public class Ejemplo2_Factory_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creadora creadoraEmail = new CreadoraNotificacionEmail();
        Creadora creadoraSMS = new CreadoraNotificacionSMS();
        
        Notificacion notificacionEmail = creadoraEmail.enviarNotificacion();
        Notificacion notificacionSMS = creadoraSMS.enviarNotificacion();
        
        notificacionEmail.enviar("Hola mundo EMAIL");
        notificacionSMS.enviar("Hola mundo SMS");
    }
    
}

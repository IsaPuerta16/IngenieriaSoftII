
package Factory;


public class EnvioExpress implements ServicioEnvio {

    @Override
    public void enviar(String paquete) {
        System.out.println("Enviando paquete de forma express...");
    }
    
}

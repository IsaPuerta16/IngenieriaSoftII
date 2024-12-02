package Factory;

public class EnvioRegular implements ServicioEnvio {

    @Override
    public void enviar(String paquete) {
        System.out.println("Enviando paquete de forma regular...");
    }
    
}

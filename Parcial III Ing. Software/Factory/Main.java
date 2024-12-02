
package Factory;


public class Main {

    public static void main(String[] args) {
        Creadora creadora = new CreadoraEnvioExpress();
        ServicioEnvio envioExpres = creadora.crearServicioEnvio();
        envioExpres.enviar("Paquete 1");
    }
    
}

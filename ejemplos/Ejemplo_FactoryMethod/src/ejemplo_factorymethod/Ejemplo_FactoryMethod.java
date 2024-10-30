/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_factorymethod;

/**
 *
 * @author jacob
 */
public class Ejemplo_FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creator creadoraE = new CreatorEnvioExpress();
        Creator creadoraR = new CreatorEnvioRegular();
        
        ServicioEnvio envioExpress = creadoraE.crearServicioEnvio();
        ServicioEnvio envioRegular = creadoraR.crearServicioEnvio();
        envioExpress.enviar();
        envioRegular.enviar();
    }
    
}

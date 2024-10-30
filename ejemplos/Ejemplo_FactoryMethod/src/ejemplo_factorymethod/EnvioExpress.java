/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_factorymethod;

/**
 *
 * @author jacob
 */
public class EnvioExpress implements ServicioEnvio{

    @Override
    public void enviar() {
        System.out.println("ENVIANDFO PAQUETE EXPRESS");
    }
    
}

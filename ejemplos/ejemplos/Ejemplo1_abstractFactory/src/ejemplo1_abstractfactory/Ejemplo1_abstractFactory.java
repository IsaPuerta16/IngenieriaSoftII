/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1_abstractfactory;

/**
 *
 * @author jacob
 */
public class Ejemplo1_abstractFactory {

    public static void main(String[] args) {
        // TODO code application logic here
        Fabrica fabricaM = new FabricaMac();
        Fabrica fabricaW = new FabricaWindows();
        
        CuadroTexto cuadroMac = fabricaM.CrearCuadroTexto();
        CuadroTexto cuadroWin = fabricaW.CrearCuadroTexto();
        
        cuadroMac.renderizar();
        cuadroWin.renderizar();
    }
    
}

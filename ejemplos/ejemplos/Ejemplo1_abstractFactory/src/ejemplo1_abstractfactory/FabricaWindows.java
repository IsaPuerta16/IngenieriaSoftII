/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1_abstractfactory;

/**
 *
 * @author jacob
 */
public class FabricaWindows implements Fabrica{

    @Override
    public Boton CrearBoton() {
        return new BotonWindows();
    }

    @Override
    public CuadroTexto CrearCuadroTexto() {
        return new CuadroTextoWindows();
    }
    
    
    
}

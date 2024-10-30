/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1_abstractfactory;

/**
 *
 * @author jacob
 */
public class CuadroTextoWindows implements CuadroTexto{

    @Override
    public void renderizar() {
        System.out.println("CUADRO TEXTO WINDOWS");
    }
}

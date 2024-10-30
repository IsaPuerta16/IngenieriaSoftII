/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2_patron_builder;

/**
 *
 * @author jacob
 */
public class Ejemplo2_Patron_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder()
                        .setTipo("TIPOOO ")
                        .setColor("ROJO ")
                        .setPuertas("4 ");
        Vehiculo vehiculo = new Vehiculo(builder);
        vehiculo.info();
        
        builder.setColor("VERDE ");
        Vehiculo vehiculo2 = new Vehiculo(builder);
        vehiculo2.info();

    }
    
}

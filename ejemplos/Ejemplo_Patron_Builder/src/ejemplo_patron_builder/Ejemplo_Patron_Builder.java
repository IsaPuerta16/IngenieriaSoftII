/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron_builder;

/**
 *
 * @author jacob
 */
public class Ejemplo_Patron_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder()
                        .setMasa("MASAAAA")
                        .setTamano("TAMANOOO");
        Pizza pizza = new Pizza(builder);
        System.out.println(pizza.toString());
                        
    }
    
}

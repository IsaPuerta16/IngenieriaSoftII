/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron.prototype;

/**
 *
 * @author jacob
 */
public class Ejemplo_patronPrototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro("Titulo 1", "Autor 1");
        Libro libro2 = (Libro) libro1.clonar();
        
        System.out.println(libro1.toString());
        libro2.setTitulo("Titulo 2");
        System.out.println(libro2.toString());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_builder;

import java.util.List;

/**
 *
 * @author jacob
 */
public class Pizza {
    private String masa;
    private String tamano;
    private List<String> ingredientes;
    
    public Pizza(Builder builder){
        this.masa = builder.masa;
        this.tamano = builder.tamano;
        this.ingredientes = builder.ingredientes;
    }
    
    @Override
    public String toString(){
        return masa + " - " + tamano;
    }
}

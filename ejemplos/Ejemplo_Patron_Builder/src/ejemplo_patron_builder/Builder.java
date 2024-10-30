/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Builder {
    public String masa;
    public String tamano;
    public List<String> ingredientes = new ArrayList<>();

    public Builder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public Builder setTamano(String tamano) {
        this.tamano = tamano;
        return this;
    }

    public Builder setIngredientes(String ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }
    
    public Pizza build(){
        return new Pizza(this);
    }
}

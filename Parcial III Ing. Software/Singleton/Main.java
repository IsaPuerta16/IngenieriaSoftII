package Singleton;

public class Main {

    public static void main(String[] args) {
        Configuracion configuracion  = Configuracion.getIns("localhost:1116", "root1", "root**");
        System.out.println(configuracion.getUrl());
        
        Configuracion otraConfiguracion = Configuracion.getIns("localhost:1116", "root2", "root*");
    }
    
}

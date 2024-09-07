package Taller3;

public class TallerOCPMain {
    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();
        Envio envioInternacional = new EnvioInternacional();

        double costoEstandar = envioEstandar.calcularCosto(10, 100);
        double costoExpress = envioExpress.calcularCosto(10, 100);
        double costoInternacional = envioInternacional.calcularCosto(10, 100);

        System.out.println("Costo Envio Estandar: " + costoEstandar);
        System.out.println("Costo Envio Express: " + costoExpress);
        System.out.println("Costo Envio Internacional: " + costoInternacional);
        
        System.out.println("Vemos que el codigo rompe el OCP porque necesita ser modificado cada vez que se añade un nuevo tipo de envio");
        System.out.println("Para esto tendriamos que modificar el codigo existente, lo que aumentaria la complejidad y va en contra del OCP.");
        System.out.println("La seccion if else en el metodo calcularCosto es la que deberia ser modificar para añadir nuevos tipos de envio.");
    }
}

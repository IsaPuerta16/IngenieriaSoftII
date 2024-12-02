
package Adapter;

public class PatronAdapter2 {

    public static void main(String[] args) {
        SistemaPagoExterno SistemaPagoExterno = new SistemaPagoExterno();
        SistemaPago sistemaPago = new AdapSisPagoExterno(SistemaPagoExterno);
        sistemaPago.procesarPago();
    }
    
}

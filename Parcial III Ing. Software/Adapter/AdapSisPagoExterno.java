package Adapter;

public class AdapSisPagoExterno implements SistemaPago {

    private SistemaPagoExterno sistemaPagoExterno;
    
    public AdapSisPagoExterno(SistemaPagoExterno sistemaPagoExterno){
        this.sistemaPagoExterno = sistemaPagoExterno;
    }
    
    @Override
    public void procesarPago() {
        sistemaPagoExterno.autorizarTransaccion();
        sistemaPagoExterno.realizarPago();
    }
}

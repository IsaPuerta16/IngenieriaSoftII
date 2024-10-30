package pregunta3;

public class FacturaElectronica {
    private String codigo;
    private double total;
    private String numeroElectronico;
    private Cliente cliente;

    public FacturaElectronica(String codigo, double total, String numeroElectronico, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.numeroElectronico = numeroElectronico;
        this.cliente = cliente;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public double getTotal(){
        return total;
    }
    public String getNumeroElectronico(){
        return numeroElectronico;
    }
    public Cliente getCliente(){
        return cliente;
    }
}



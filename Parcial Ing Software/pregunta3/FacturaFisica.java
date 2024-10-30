package pregunta3;

public class FacturaFisica {
    private String codigo;
    private double total;
    private Cliente cliente;

    public FacturaFisica(String codigo, double total, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.cliente = cliente;
    }
    
    public String getCodigo(){
        return codigo;
    }
    public double getTotal(){
        return total;
    }
    public Cliente getCliente(){
        return cliente;
    }
}

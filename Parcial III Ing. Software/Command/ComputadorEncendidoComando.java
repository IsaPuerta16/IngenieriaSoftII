package Command;

public class ComputadorEncendidoComando implements Comando{

    private Computador computador;
    
    public ComputadorEncendidoComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
       computador.encender();
    }
}
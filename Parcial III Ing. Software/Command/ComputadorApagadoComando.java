
package Command;

public class ComputadorApagadoComando implements Comando{

    private Computador computador;
    
    public ComputadorApagadoComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
       computador.apagar();
    }
}

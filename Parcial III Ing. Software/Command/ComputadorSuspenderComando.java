package Command;

public class ComputadorSuspenderComando implements Comando{

    private Computador computador;
    
    public ComputadorSuspenderComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
       computador.suspender();
    }
}
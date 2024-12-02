package Command;

public class ComputadorReiniciandoComando implements Comando{

    private Computador computador;
    
    public ComputadorReiniciandoComando(Computador computador){
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
       computador.reiniciar();
    }
}

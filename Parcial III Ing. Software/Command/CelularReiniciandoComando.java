package Command;

public class CelularReiniciandoComando implements Comando{

    private Celular celular;
    
    public CelularReiniciandoComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.reiniciar();
    }
}

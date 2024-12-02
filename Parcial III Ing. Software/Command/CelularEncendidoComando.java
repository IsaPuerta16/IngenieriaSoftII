package Command;

public class CelularEncendidoComando implements Comando{

    private Celular celular;
    
    public CelularEncendidoComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.encender();
    }
}

package Command;

public class CelularApagadoComando implements Comando{

    private Celular celular;
    
    public CelularApagadoComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.apagar();
    }
}

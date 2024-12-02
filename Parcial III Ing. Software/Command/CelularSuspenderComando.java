package Command;

public class CelularSuspenderComando implements Comando{

    private Celular celular;
    
    public CelularSuspenderComando(Celular celular){
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
       celular.suspender();
    }
}
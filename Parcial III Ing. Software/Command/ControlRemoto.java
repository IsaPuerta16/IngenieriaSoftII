
package Command;

public class ControlRemoto {
    private Comando comando;
    
    public ControlRemoto(Comando comando){
        this.comando = comando;
    }
    
    public void ejecutar(){
        comando.ejecutar();
    }
}

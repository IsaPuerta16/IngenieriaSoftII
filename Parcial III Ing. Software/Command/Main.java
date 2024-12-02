
package Command;

public class Main {

    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();
        
        Comando computadorApagado = new ComputadorApagadoComando(computador);
        ControlRemoto control = new ControlRemoto(computadorApagado);
        control.ejecutar();
        
        Comando celularApagado = new CelularApagadoComando(celular);
        control = new ControlRemoto(celularApagado);
        control.ejecutar();

        Comando computadorEncendido = new ComputadorEncendidoComando(computador);
        ControlRemoto control1 = new ControlRemoto(computadorEncendido);
        control.ejecutar();
        
        Comando celularEncendido = new CelularEncendidoComando(celular);
        control = new ControlRemoto(celularEncendido);
        control.ejecutar();

        Comando computadorReiniciando = new ComputadorReiniciandoComando(computador);
        ControlRemoto control2 = new ControlRemoto(computadorReiniciando);
        control.ejecutar();
        
        Comando celularReiniciando = new CelularReiniciandoComando(celular);
        control = new ControlRemoto(celularReiniciando);
        control.ejecutar();

        Comando computadorSuspender = new ComputadorSuspenderComando(computador);
        ControlRemoto control3 = new ControlRemoto(computadorSuspender);
        control.ejecutar();
        
        Comando celularSuspender = new CelularSuspenderComando(celular);
        control = new ControlRemoto(celularSuspender);
        control.ejecutar();
    }
    
}

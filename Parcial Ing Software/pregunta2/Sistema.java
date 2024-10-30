package pregunta2;

public class Sistema {
    public void enviarNotificacionPorSMS(Notificacion notificacion){
        System.out.println("Enviando notificacion por sms");
    }
    public void enviarNotificacionPorWhatsaap(Notificacion notificacion){
        System.out.println("Enviando notificacion por Whatsaap");
    }
    public void insertarTarea(Tarea tarea){
        System.out.println("Insertando tarea");
    }
    public void leerTarea(){
        System.out.println("Obteniendo tarea");
    }
}

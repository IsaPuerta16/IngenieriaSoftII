package PatronSingleton;

public class Main {
    public static void main(String[] args) {
        // Crear diferentes implementaciones del servicio de configuraciones (simulando los servicios de email)
        ServicioConfiguraciones servicioConfiguracion1 = new SettingsGoogleImpl();
        ServicioConfiguraciones servicioConfiguracion2 = new SettingsMicrosoftImpl();

        // Usar el sistema con el primer servicio de configuraciones
        Sistema sistema = new Sistema(servicioConfiguracion1);
        sistema.mostrarConfiguraciones();
        sistema.modificarConfiguraciones();
        sistema.mostrarConfiguraciones();

        // Usar el sistema con el segundo servicio de configuraciones
        sistema = new Sistema(servicioConfiguracion2);
        sistema.mostrarConfiguraciones();
        sistema.modificarConfiguraciones();
        sistema.mostrarConfiguraciones();
    }
}


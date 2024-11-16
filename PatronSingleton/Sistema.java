package PatronSingleton;

public class Sistema {
    private ServicioConfiguraciones servicioConfiguraciones;

    public Sistema(ServicioConfiguraciones servicioConfiguraciones) {
        this.servicioConfiguraciones = servicioConfiguraciones;
    }

    public void mostrarConfiguraciones() {
        System.out.println("Tema: " + servicioConfiguraciones.obtenerConfiguracion("theme"));
        System.out.println("Idioma: " + servicioConfiguraciones.obtenerConfiguracion("language"));
    }

    public void modificarConfiguraciones() {
        servicioConfiguraciones.establecerConfiguracion("theme", "dark");
        servicioConfiguraciones.establecerConfiguracion("language", "es");
    }
}


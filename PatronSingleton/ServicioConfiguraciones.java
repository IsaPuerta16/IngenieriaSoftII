package PatronSingleton;

public interface ServicioConfiguraciones {
    String obtenerConfiguracion(String clave);
    void establecerConfiguracion(String clave, String valor);
}


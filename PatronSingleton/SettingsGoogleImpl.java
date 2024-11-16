package PatronSingleton;

public class SettingsGoogleImpl implements ServicioConfiguraciones {
    private Settings settings;

    public SettingsGoogleImpl() {
        this.settings = Settings.getInstancia(); // Singleton
    }

    @Override
    public String obtenerConfiguracion(String clave) {
        return settings.obtenerConfiguracion(clave);
    }

    @Override
    public void establecerConfiguracion(String clave, String valor) {
        settings.establecerConfiguracion(clave, valor);
    }
}


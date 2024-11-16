package PatronSingleton;

public class SettingsMicrosoftImpl implements ServicioConfiguraciones {
    private Settings settings;

    public SettingsMicrosoftImpl() {
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


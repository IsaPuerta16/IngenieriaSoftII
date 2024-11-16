package PatronSingleton;

public class Settings {
    private static Settings instancia;
    private String tema = "light";
    private String idioma = "en";

    private Settings() {}

    public static Settings getInstancia() {
        if (instancia == null) {
            instancia = new Settings();
        }
        return instancia;
    }

    public String obtenerConfiguracion(String clave) {
        switch (clave) {
            case "theme":
                return tema;
            case "language":
                return idioma;
            default:
                return null;
        }
    }

    public void establecerConfiguracion(String clave, String valor) {
        switch (clave) {
            case "theme":
                this.tema = valor;
                break;
            case "language":
                this.idioma = valor;
                break;
        }
    }
}

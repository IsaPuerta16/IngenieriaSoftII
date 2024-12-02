package Builder;

public class Hamburguesa {

    public static void main(String[] args) {
        Builder builder = new Builder()
                .setTipoTomate("cherry")
                .setTipoQueso("Provolone")
                .setTipoPan("Brioche")
                .setTipoCarne("cerdo");
        Hamburguesa hamburguesa = builder.build();
        System.out.println(hamburguesa.toString());
    }
    
}

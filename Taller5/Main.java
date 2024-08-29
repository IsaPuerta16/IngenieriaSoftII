public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda();
        Producto producto1 = new ProductoFisico("Fabuloso", 8000, 9, 1.5);
        Producto producto2 = new ProductoDigital("Tarjeta Regalo", 40000, 20, 15);
        Producto producto3 = new ProductoMixto("Tarjeta de regalo Fabuloso", 10000, 25, 2, 20);

        System.out.println("El precio total de "+producto1.getName()+": "+tienda.hacerCalculo(producto1));
        System.out.println("El precio total de "+producto2.getName()+": "+tienda.hacerCalculo(producto2));
        System.out.println("El precio total de "+producto3.getName()+": "+tienda.hacerCalculo(producto3));

        ProductoFisico fisico1 = new ProductoFisico("Choclitos", 2000, 5, 250.0);
        fisico1.envioCorreo();

        ProductoMixto fisico2 = new ProductoMixto("Chocorramo", 2000, 5, 250.0, 5.5);
        fisico2.envioCorreo();
    }
}

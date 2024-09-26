public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("La Melancolia de los Feos", "Mario Mendoza", 2016);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro);
    }
}

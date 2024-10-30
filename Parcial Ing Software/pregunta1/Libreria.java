package pregunta1;

import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void anadirLibro(libro libro) {
        libros.add(libro);
    }

    public libro buscarLibroPorTitulo(String titulo) {
        return libros.stream().filter(libro -> libro.getTitulo().equals(titulo)).findFirst().orElse(null);
    }

    public List<libro> obtenerLibrosPorAutor(String autor) {
        return libros.stream().filter(libro -> libro.getAutor().equals(autor)).toList();
    }

    public List<libro> obtenerLibrosEntrePrecios(double precioMin, double precioMax) {
        return libros.stream().filter(libro -> libro.getPrecio() >= precioMin && libro.getPrecio() <= precioMax).toList();
    }

    public List<libro> obtenerLibrosPorAno(int ano) {
        return libros.stream().filter(libro -> libro.getAno() == ano).toList();
    }
}

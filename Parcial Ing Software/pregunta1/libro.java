package pregunta1;
public class libro {
    private String titulo;
    private String autor;
    private double precio;
    private int ano;

    public libro(String titulo, String autor, double precio, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.ano = ano;
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public double getPrecio(){
        return precio;
    }
    public int getAno(){
        return ano;
    }
}


public class Libro {
    private int idLibro;
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponibilidad;

    public Libro(int id, String titulo, String autor, String isbn, boolean disponibilidad) {
        this.idLibro = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponibilidad = disponibilidad;
    }

    // Métodos getter
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    // Métodos setter
    public void setId(int id) {
        this.idLibro = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String obtenerInformacionLibro() {
        return "ID: " + idLibro + "\nTítulo: " + titulo + "\nAutor: " + autor + 
               "\nISBN: " + isbn + "\nDisponible: " + (disponibilidad ? "Sí" : "No");
    }
 
}

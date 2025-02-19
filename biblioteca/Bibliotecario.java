package biblioteca;
public class Bibliotecario extends Persona{
    private int numEmpleado;
    public Bibliotecario(){

    }
    public Bibliotecario(int idPersona, String nombre, String telefono, int numEmpleado){
        super(idPersona, nombre, telefono);
        this.numEmpleado=numEmpleado;
    }

    public void registrarPrestamo(Usuario usuario, Ejemplar ejemplar){
        System.out.println("Prestamo hecho a "+ getNombre(usuario));
    }

    public void registrarDevolucion(Prestamo prestamo){
        System.out.println("Libro devuelto");
    }
    
    public Libro buscarLibro(String libro){
        return getNombreLibro(libro);
    }

    public void agregarLibro(Libro libro){
        System.out.println("Libro agregado");
    }

    public void generarReporte(){
        System.out.println("Reporte en proceso");
    }
}

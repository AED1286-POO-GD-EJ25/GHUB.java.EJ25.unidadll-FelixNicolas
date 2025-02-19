package biblioteca;

public class Persona {
    private int idPersona;
    private String nombre;
    private String telefono;

    public Persona(){

    }

    public Persona(int idPersona, String nombre, String telefono){
        this.idPersona=idPersona;
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public Boolean solicitarPrestamo(Libro libro){
        System.out.println("Libro prestado");
        return true;
    }

    public Boolean devolverLibro(Libro libro){
        System.out.println("Libro regresado");
        return true;
    }

    public int getIdPersona(Persona persona){
        return this.idPersona;
    }

    public void setIdPersona(int id){
        System.out.println("id setted");
    }

    public String getNombre(Persona persona){
        return this.nombre;
    }

    public void setNombre(String nombre){
        System.out.println("nombre setted");
    }

    public String getTelefono(Persona persona){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        System.out.println("telefono setted");
    }
}

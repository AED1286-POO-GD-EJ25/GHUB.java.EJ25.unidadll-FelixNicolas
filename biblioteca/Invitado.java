package biblioteca;
public class Invitado extends Persona{
    private String institucion;
    public Invitado(){

    }
    public Invitado(int idPersona, String nombre, String telefono, String institucion){
        super(idPersona, nombre, telefono);
        this.institucion=institucion;
    }
    public void ConsultarDisponibilidadLibro(Libro libro){
        System.out.println(getDisponibilidad(libro));
    }
    
    public void solicitarPrestamoTemporal(Libro libro){
        if(getDisponibilidad(libro)==true){
            System.out.println("Libro prestado");
        }else{
            System.out.println("No hay disponibilidad");
        }
    }
}

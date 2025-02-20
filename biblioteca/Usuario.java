package biblioteca;
public class Usuario extends Persona{
    int numSocio;

    public Usuario(){

    }

    public Usuario(int idPersona, String nombre, String telefono, int numSocio){
        super(idPersona, nombre, telefono);
        this.numSocio= numSocio;
    }

    public void setNumSocio(int numSocio){
        System.out.println("numero setted");
    }

    public int getNumSocio(){
        return this.numSocio;
    }

}

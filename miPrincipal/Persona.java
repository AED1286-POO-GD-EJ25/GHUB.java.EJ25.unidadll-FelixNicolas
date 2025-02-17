package miPrincipal;

public class Persona {
    private String nombre;
    private int edad;
    private String curp;

    public Persona(String nombre, int edad, String curp){
       this.nombre=nombre;
       this.edad=edad;
       this.curp=curp;
    }
    public void saludar(){
        System.out.println("Bienvenido, "+nombre);
    }
}

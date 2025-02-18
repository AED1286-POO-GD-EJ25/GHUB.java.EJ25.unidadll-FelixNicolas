package miPrincipal;

public class Persona {
    private String nombre;
    private int edad;
    private String curp;

    public Persona(){

    }

    public Persona(String nombre, int edad, String curp){
       this.nombre=nombre;
       this.edad=edad;
       this.curp=curp;
    }
    public void saludar(){
        if(nombre != null){
            System.out.println("Bienvenido, "+nombre);
        }else{
            System.out.println("Bienvenido");
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getCurp(){
        return this.curp;
    }

    public void setCurp(String curp){
        this.curp = curp; 
    }
}

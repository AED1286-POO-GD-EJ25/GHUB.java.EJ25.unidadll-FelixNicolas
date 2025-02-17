package miPrincipal;
public class Alumno extends Persona{
    private String carrera;
    private int notas[];

    public Alumno(String nombre, int edad, String curp, String carrera){
        super(nombre, edad, curp); //invoca constructor clase base
        this.carrera = carrera;
        this.notas = new int[5];
    }

    public void estudiar(){
        System.out.println("Soy alumno y estoy estudiando");
    }
}

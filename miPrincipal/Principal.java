package miPrincipal;
import java.util.Scanner;
public class Principal {
    

    public static void main(String[] args) {
        Persona p1 = new Persona("Nicolas", 18, "FEAN061122HSLLGCA8");
        Persona p2 = new Persona();
        Scanner scan = new Scanner(System.in);
        p1.saludar();
        p2.saludar();

        p2.setCurp(scan.nextLine());
        System.out.println(p2.getCurp());
    }
}
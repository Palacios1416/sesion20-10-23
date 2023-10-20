import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        try {
            int resultado = dividir();
            System.out.println(resultado);
            
        }catch(ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("No se logra completar la division");
        }   
    }
    public static int dividir(){
        try {
            int x = pedirEntero();
            int y = pedirEntero();
            System.out.println("x = "+x);
            System.out.println("y = "+y);
            System.out.println(resultado);
           
        } catch (ArithmeticException e) {
            throw new Exception("No se logra realizar la operación");
        } catch (NoSuchElementException e){
            throw new Exception("No se logra realizar la operación");
        }
        
    }
    private static int pedirEntero() {
        return 0;
    }
}

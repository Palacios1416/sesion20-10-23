import java.util.Scanner;
import static java.lang.Math.*;
public class App1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("De cuanto quiere el arreglo?");
        int arreglosize = scan.nextInt();
        int A[] = new int[arreglosize];
        for (int i = 0; i < arreglosize; i++) {
            System.out.println("Ingrese los valores: ");
            A[i] = scan.nextInt();
        }
        System.out.println("Que elemento busca?");
        int elementoBuscado = scan.nextInt();
        int encontrado = 
        int hallado = OrdenamientoLineal(A, arreglosize, elementoBuscado);
        if (hallado != -1) {
            System.out.println("El valor "+hallado+" fue encontrado");
        } else {
            System.out.println("El valor "+elementoBuscado+" no fue encontrado");
        }
    }

    public static int OrdenamientoLineal(int A[], int n, int buscado) { //este es un metodo general
        int indice = 0;                                                 //siempre se utiliza el mismo codigo
        while (indice < n) {                                            //para lo que se desee buscar
            if (A[indice] == buscado) {
                return A[indice];
            } else {
                indice++;
            }
        }
        return -1;
    }
    public static int OrdenamientoBinario(int A[], int n, int buscado){
        int ladoizq = 0;
        int ladoder = n - 1;
        while (ladoizq <= ladoder) {
            if (A[lado]) {
                
            } else {
                
            }
        }
        return -1;

    }

}

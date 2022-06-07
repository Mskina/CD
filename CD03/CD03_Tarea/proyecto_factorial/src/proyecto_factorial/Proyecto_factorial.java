package proyecto_factorial;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Proyecto_factorial {

    public static void main(String[] args) {
        System.out.print("\nCÁLCULO DEL FACTORIAL\n");
        Scanner teclado = new Scanner(System.in);
        boolean error;
        byte n;
        do {
            try {   
                error = false;
                System.out.printf("Teclee n (>= 0 y <=%d):  ",Byte.MAX_VALUE);
                n = teclado.nextByte();
                Factorial es = new Factorial();
                System.out.printf("Factorial(%d) = %f\n",n, es.factorial(n));
             
            } catch (NumberFormatException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error en la conversión");
                error = true;
            } catch (InputMismatchException e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println("Error. El dato tecleado no es válido");
                error = true;
            } catch (Exception e) {
                teclado.nextLine(); //para limpiar INTRO del buffer de teclado
                System.out.println(e.getMessage()); // Muestra el error
                error = true;
            }
        } while (error);
    }
}

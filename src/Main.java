import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
// Método para saber si el usuario ha metido un número y no un carácter
    public static int pedirNumero() {
        boolean leido = false;
        int num=0;
        do {
            try {
                num = sc.nextInt();
                leido = true;
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número, no una letra");
            }finally {//Se usa para salir del bucle generado por el try catch
                sc.nextLine();
            }
        } while (!leido);

        return num;
    }
    public static void main(String[] args) {
        int n1, n2, sol;

        do {
            do {
                    System.out.println("Introduzca el primer numero");
                    n1 = pedirNumero();
                    System.out.println("Introduzca el segundo numero");
                    n2 =  pedirNumero();
                try{
                    sol = n1 / n2;
                    System.out.println("La división es " + sol);

                } catch (ArithmeticException e) {
                    System.out.println("No es posible dividir entre cero");
                }

            } while (n2==0);

            System.out.println("¿Quieres seguir haciendo divisiones?");
            System.out.println("Pulsa enter para continuar o cualquier otra tecla para salir");

        }while (sc.nextLine().equals(""));

    }
}

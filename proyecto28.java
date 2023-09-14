import java.util.Random;
import java.util.Scanner;

public class proyecto28 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        int intentos = 3;
        int premioTotal = 0;
        for (int i = 1; i <= intentos; i++) {
            System.out.println("Intento " + i + ":");
            int numero1 = random.nextInt(10);
            int numero2 = random.nextInt(10);
            int numero3 = random.nextInt(10);
            System.out.print("Ingrese su suposición para el primer número (entre 0 y 9): ");
            int suposicion1 = lector.nextInt();
            System.out.print("Ingrese su suposición para el segundo número (entre 0 y 9): ");
            int suposicion2 = lector.nextInt();
            System.out.print("Ingrese su suposición para el tercer número (entre 0 y 9): ");
            int suposicion3 = lector.nextInt();
            int coincidencias = 0;
            if (suposicion1 == numero1) {
                coincidencias++;
            }
            if (suposicion2 == numero2) {
                coincidencias++;
            }
            if (suposicion3 == numero3) {
                coincidencias++;
            }
            int premio = 0;
            if (coincidencias == 3) {
                premio = 10000;
            } else if (coincidencias == 2) {
                premio = 1000;
            } else if (coincidencias == 1) {
                premio = 100;
            }

            System.out.println("Números generados: " + numero1 + ", " + numero2 + ", " + numero3);
            System.out.println("Tienes " + coincidencias + " coincidencia(s). Ganaste C$" + premio);

            premioTotal += premio;
        }

        System.out.println("Premio total después de " + intentos + " intentos: C$" + premioTotal);
       lector.close();
    }
}
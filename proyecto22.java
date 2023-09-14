import java.util.Random;
import java.util.Scanner;

public class proyecto22 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();
        boolean jugarOtraVez = true;

        while (jugarOtraVez) {
            int numeroAdivinanza = random.nextInt(50) + 1;
            int intentos = 0;
            boolean adivinado = false;

            System.out.println("Adivine un número entre 1 y 50.");
            while (!adivinado && intentos < 3) {
                System.out.print("Intente adivinar (intentos restantes: " + (3 - intentos) + "): ");
                int intento = lector.nextInt();
                intentos++;

                if (intento < numeroAdivinanza) {
                    System.out.println("Demasiado bajo. Intente de nuevo.");
                } else if (intento > numeroAdivinanza) {
                    System.out.println("Demasiado alto. Intente de nuevo.");
                } else {
                    adivinado = true;
                    System.out.println("Felicidades. el atinastes!");
                }
            }

            if (!adivinado) {
                System.out.println("Lo siento, ha agotado sus intentos. El número era: " + numeroAdivinanza);
            }

            System.out.print("¿Desea jugar otra vez? (Sí/No): ");
            String respuesta = lector.next().toLowerCase();
            jugarOtraVez = respuesta.equals("si") || respuesta.equals("sí");
        }

        System.out.println("Gracias por jugar. ¡Hasta luego!");
        lector.close();
    }
}

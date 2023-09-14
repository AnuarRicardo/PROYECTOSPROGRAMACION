import java.util.Scanner;
import java.util.Random;

public class proyecto26 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hola, soy Eliza. Puedes contarme tus problemas o decir 'Adiós' para salir.");

        while (true) {
            System.out.print("Usuario: ");
            String input = lector.nextLine().toLowerCase();

            if (input.equals("adiós")) {
                System.out.println("Eliza: Adiós. Espero que te sientas mejor pronto.");
                break;
            }

            if (input.contains("mi")) {
                String response = input.replace("mi", "su");
                System.out.println("Eliza: Cuénteme más sobre " + response);
            } else if (input.contains("amor") || input.contains("odio")) {
                System.out.println("Eliza: Parece que tiene fuertes sentimientos al respecto.");
            } else {
                // Respuestas aleatorias en caso de no coincidencia
                String[] randomResponses = {"Continúe", "Dígame más", "Continúe"};
                int randomIndex = random.nextInt(randomResponses.length);
                System.out.println("Eliza: " + randomResponses[randomIndex]);
            }
        }

        lector.close();
    }
}
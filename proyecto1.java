import java.util.Scanner;

public class proyecto1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = lector.nextInt();
        lector.nextLine();

        System.out.print("Ingrese su género (hombre/mujer): ");
        String genero = lector.nextLine().toLowerCase();

        if (edad < 18) {
            System.out.println("Lo siento, eres menor de 18 años y no puedes entrar.");
        } else if (edad >= 18 && genero.equals("mujer")) {
            if (edad >= 20) {
                System.out.println("Bienvenida al local. Puedes consumir bebidas alcohólicas.");
            } else {
                System.out.println("Bienvenida al local. No puedes consumir bebidas alcohólicas.");
            }
        } else if (edad >= 18 && genero.equals("hombre")) {
            System.out.print("¿Portas armas? (sí/no): ");
            String armas = lector.nextLine().toLowerCase();

            if (armas.equals("si")) {
                System.out.println("Lo siento, no puedes entrar al local debido a que portas armas.");
            } else {
                if (edad >= 20) {
                    System.out.println("Bienvenido al local. Puedes consumir bebidas alcohólicas.");
                } else {
                    System.out.println("Bienvenido al local. No puedes consumir bebidas alcohólicas.");
                }
            }
        } else {
            System.out.println("Entrada no válida.");
        }

        lector.close();
    }
}

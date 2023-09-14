import java.util.Scanner;

public class proyecto25 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean contraseñaValida = false;

        while (!contraseñaValida) {
            System.out.print("Ingrese su contraseña: ");
            String contraseña = lector.nextLine();

            if (esContraseñaValida(contraseña)) {
                System.out.print("Por favor, confirme su contraseña: ");
                String confirmacion = lector.nextLine();

                if (contraseña.equals(confirmacion)) {
                    System.out.println("¡Contraseña establecida con éxito!");
                    contraseñaValida = true;
                } else {
                    System.out.println("Las contraseñas no coinciden. Intente nuevamente.");
                }
            } else {
                System.out.println("La contraseña no cumple con los requisitos. Intente nuevamente.");
            }
        }

        lector.close();
    }

    public static boolean esContraseñaValida(String contraseña) {
        if (contraseña.length() < 6 || contraseña.length() > 10) {
            return false;
        }
        boolean contieneLetra = false;
        boolean contieneDigito = false;
        for (char c : contraseña.toCharArray()) {
            if (Character.isLetter(c)) {
                contieneLetra = true;
            } else if (Character.isDigit(c)) {
                contieneDigito = true;
            }
            if (contieneLetra && contieneDigito) {
                break;
            }
        }

        return contieneLetra && contieneDigito;
    }

}
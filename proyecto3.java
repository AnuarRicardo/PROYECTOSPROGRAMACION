import java.util.Scanner;

public class proyecto3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroTotalDeRosquillas, cajasNecesarias;
        int rosquillasSobrantes, cajasSobrantes;
        int contenedoresNecesarios;
        System.out.print("Ingrese el número total de rosquillas: ");
        numeroTotalDeRosquillas = lector.nextInt();
        cajasNecesarias = numeroTotalDeRosquillas / 24;
        rosquillasSobrantes = numeroTotalDeRosquillas % 24;
        cajasSobrantes = cajasNecesarias % 75;
        contenedoresNecesarios = cajasNecesarias / 75;
        System.out.println("Para enviar " + numeroTotalDeRosquillas + " rosquillas:");
        System.out.println("Se necesitan " + cajasNecesarias + " cajas de rosquillas.");
        System.out.println("Sobran " + rosquillasSobrantes + " rosquillas.");
        System.out.println("Se necesitan " + contenedoresNecesarios + " contenedores.");
        System.out.println("Sobran " + cajasSobrantes + " cajas de rosquillas.");

        lector.close();
    }

}
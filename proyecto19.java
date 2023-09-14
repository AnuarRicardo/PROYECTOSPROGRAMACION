import java.util.Scanner;

public class proyecto17 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double totalRecibos = 0.0;
        double horas;

        while (true) {
            System.out.print("Ingrese las horas de estacionamiento (-1 para salir): ");
            horas = lector.nextDouble();

            if (horas == -1) {
                break;
            }

            double cargo = calcularCargo(horas);
            totalRecibos += cargo;

            System.out.printf("El cargo para este cliente es: C$%.2f%n", cargo);
        }

        System.out.printf("Total de recibos de ayer: C$%.2f%n", totalRecibos);
    }

    public static double calcularCargo(double horas) {
        double cargoMinimo = 2.0;
        double tarifaAdicional = 0.5;
        double cargoMaximo = 10.0;

        if (horas <= 3) {
            return cargoMinimo;
        } else if (horas <= 24) {
            double horasExtras = horas - 3;
            double cargo = cargoMinimo + (horasExtras * tarifaAdicional);
            return Math.min(cargo, cargoMaximo);
        } else {
            return cargoMaximo;
        }
    }

}

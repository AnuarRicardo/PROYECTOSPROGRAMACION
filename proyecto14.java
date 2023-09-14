import java.util.Scanner;

public class proyecto14 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int totalLitros = 0;
        int totalKilometro = 0;
        int kilometros, litros;
        double kilometrosPorLitro, kilometrosPorLitroTotal;
        while (true) {
            System.out.print("Ingrese los kilómetros conducidos (o -1 para salir): ");
            kilometros = lector.nextInt();

            if (kilometros == -1) {
                break;
            }
            System.out.print("Ingrese los litros usados: ");
            litros = lector.nextInt();

            kilometrosPorLitro = calcularKilometrosPorLitro(kilometros, litros);

            System.out.println("Kilómetros por litro en este viaje: " + kilometrosPorLitro);

           int totalKilometros = kilometros;
            totalLitros += litros;

            kilometrosPorLitroTotal = calcularKilometrosPorLitro(totalKilometros, totalLitros);
            System.out.println("Total de kilómetros por litro hasta el momento: " + kilometrosPorLitroTotal);
        }

        lector.close();
    }

    public static double calcularKilometrosPorLitro(int kilometros, int litros) {
        if (litros == 0) {
            return 0.0;
        }
        return (double) kilometros / litros;
    }
}


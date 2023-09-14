import java.util.Scanner;

public class proyecto11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double montoPrestamo, tasaInteresAnual, pagoMensual, interesMensual, pagoCapital, saldoRestante;
        int numeroMeses;
        System.out.println("Calculadora de Tiempo de Pago de Préstamo");
        System.out.println("----------------------------------------");

        System.out.print("Ingrese el monto del préstamo (en C$): ");
        montoPrestamo = lector.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en %): ");
        tasaInteresAnual = lector.nextDouble() / 100;

        System.out.print("Ingrese el pago mensual (en C$): ");
        pagoMensual = lector.nextDouble();

        saldoRestante = montoPrestamo;
        numeroMeses = 0;
         while (saldoRestante > 0) {
            interesMensual = saldoRestante * (tasaInteresAnual / 12);
            pagoCapital = pagoMensual - interesMensual;
            saldoRestante -= pagoCapital;
            if (pagoMensual <= interesMensual) {
                System.out.println("El pago mensual es insuficiente para pagar el préstamo.");
                break;
            }
            numeroMeses++;
            System.out.printf("Mes %d: Saldo restante = C$%.2f%n", numeroMeses, saldoRestante);
        }

        if (saldoRestante <= 0) {
            System.out.printf("Se necesitarán %d meses para pagar el préstamo por completo.%n", numeroMeses);
        }

        lector.close();
    }
}

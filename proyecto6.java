import java.util.Scanner;

public class proyecto6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 0;

        while (intentos < 3) {
            System.out.print("Número de cuenta del cliente: ");
            int numeroCuenta = lector.nextInt();
            lector.nextLine();

            System.out.print("Tipo de cuenta (S para ahorros, C para cheques): ");
            char tipoCuenta = lector.nextLine().charAt(0);

            System.out.print("Saldo mínimo que debe mantener la cuenta: U$");
            double saldoMinimo = lector.nextDouble();

            System.out.print("Saldo actual: U$");
            double saldoActual = lector.nextDouble();

            double saldoNuevo = 0;

            if (tipoCuenta == 'S' || tipoCuenta == 's') {
                if (saldoActual < saldoMinimo) {
                    saldoNuevo = saldoActual - 10;
                } else {
                    saldoNuevo = saldoActual + (saldoActual * 0.04);
                }
            } else if (tipoCuenta == 'C' || tipoCuenta == 'c') {
                if (saldoActual < saldoMinimo) {
                    saldoNuevo = saldoActual - 25;
                } else if (saldoActual <= saldoMinimo + 5000) {
                    saldoNuevo = saldoActual + (saldoActual * 0.03);
                } else {
                    saldoNuevo = saldoActual + (saldoActual * 0.05);
                }
            } else {
                System.out.println("Tipo de cuenta no válido. Por favor, ingrese S para ahorros o C para cheques.");
                continue;
            }

            System.out.println("Número de cuenta: " + numeroCuenta);
            System.out.println("Tipo de cuenta: " + tipoCuenta);
            System.out.println("Saldo actual: U$" + saldoActual);
            System.out.println("Saldo nuevo: U$" + saldoNuevo);

            intentos++;
        }

        lector.close();
    }
}

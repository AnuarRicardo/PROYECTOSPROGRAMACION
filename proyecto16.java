import java.util.Scanner;

public class proyecto16 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroCuenta, saldoInicial, cargos, creditos;
        int limiteCredito, nuevoSaldo;

        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = lector.nextInt();

        System.out.print("Ingrese el saldo al inicio del mes: ");
        saldoInicial = lector.nextInt();

        System.out.print("Ingrese el total de artículos cargados por el cliente en el mes: ");
        cargos = lector.nextInt();

        System.out.print("Ingrese el total de créditos aplicados a la cuenta del cliente en el mes: ");
        creditos = lector.nextInt();

        System.out.print("Ingrese el límite de crédito permitido: ");
        limiteCredito = lector.nextInt();
        nuevoSaldo = saldoInicial + cargos - creditos;
        System.out.println("El nuevo saldo es: " + nuevoSaldo);
        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de su crédito");
        }

        lector.close();
    }
}

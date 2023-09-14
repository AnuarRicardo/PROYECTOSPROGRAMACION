import java.util.Scanner;

public class proyecto7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroCuenta, minutosUtilizados, minutosDiurnos, minutosNocturnos;
        double costoTotal;
        char codigoServicio;
        System.out.print("Número de cuenta: ");
         numeroCuenta = lector.nextInt();
        System.out.print("Código de servicio (R para regular, P para premium): ");
         codigoServicio = lector.next().charAt(0);
         costoTotal = 0.0;
        if (codigoServicio == 'R' || codigoServicio == 'r') {
            System.out.print("Minutos utilizados: ");
             minutosUtilizados = lector.nextInt();
            if (minutosUtilizados <= 50) {
                costoTotal = 10.0;
            } else {
                costoTotal = 10.0 + (minutosUtilizados - 50) * 0.20;
            }
        } else if (codigoServicio == 'P' || codigoServicio == 'p') {
            System.out.print("Minutos diurnos utilizados: ");
             minutosDiurnos = lector.nextInt();
            System.out.print("Minutos nocturnos utilizados: ");
             minutosNocturnos = lector.nextInt();
            if (minutosDiurnos <= 75) {
                costoTotal = 25.0 + minutosNocturnos * 0.05;
            } else {
                costoTotal = 25.0 + (minutosDiurnos - 75) * 0.10 + minutosNocturnos * 0.05;
            }
        } else {
            System.out.println("Código de servicio no válido. Use R para regular o P para premium.");
            lector.close();
            return;
        }

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Código de servicio: " + codigoServicio);
        System.out.println("Costo total: U$" + costoTotal);

        lector.close();
    }
}
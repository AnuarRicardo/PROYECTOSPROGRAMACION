import java.util.Scanner;

public class proyecto12 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroCuenta, numCanalesPremium, numConexiones;
        double totalFactura;
        System.out.print("Ingrese el número de cuenta del cliente: ");
        numeroCuenta = lector.nextInt();
        System.out.print("Ingrese el código de cliente (R para residencial, N para negocios): ");
        char codigoCliente = lector.next().charAt(0);

        totalFactura = 0.0;

        if (codigoCliente == 'R' || codigoCliente == 'r') {
            totalFactura += 4.50;
            totalFactura += 20.50;
            System.out.print("Ingrese el número de canales Premium: ");
            numCanalesPremium = lector.nextInt();
            totalFactura += 7.50 * numCanalesPremium;
        } else if (codigoCliente == 'N' || codigoCliente == 'n') {
            totalFactura += 15.00;
            System.out.print("Ingrese el número de conexiones de servicio básico: ");
            numConexiones = lector.nextInt();
            if (numConexiones <= 10) {
                totalFactura += 75.00;
            } else {
                totalFactura += 75.00 + (numConexiones - 10) * 5.00;
            }
            System.out.print("Ingrese el número de canales Premium: ");
            numCanalesPremium = lector.nextInt();
            totalFactura += 50.00 * numCanalesPremium;
        } else {
            System.out.println("Código de cliente no válido. Use R o N.");
            
        }
        System.out.println("Número de cuenta del cliente: " + numeroCuenta);
        System.out.println("Importe de facturación: C$" + totalFactura);

        lector.close();

   }

}
import java.util.Scanner;

public class proyecto8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double longitud, ancho, costomarco, costoPintura, costoCarton, costoVidrio;
        double costocoronas, costoTotal;
        int cantidadcoronas;
        String colormarco, tipomarco;
        boolean agregarCoronas;
        System.out.print("Ingrese la longitud de la fotografía en pulgadas: ");
         longitud = lector.nextDouble();
        System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
         ancho = lector.nextDouble();
        System.out.print("Seleccione el tipo de marco (regular o lujoso): ");
         tipomarco = lector.next();
        System.out.print("Ingrese el color del marco: ");
        colormarco = lector.next();
        System.out.print("¿Desea agregar coronas en las esquinas? (true/false): ");
        agregarCoronas = lector.nextBoolean();
        cantidadcoronas = 0;
        if (agregarCoronas) {
            System.out.print("Ingrese la cantidad de coronas que desea agregar: ");
            cantidadcoronas = lector.nextInt();
        }
         costomarco = 0;
        if (tipomarco.equalsIgnoreCase("regular")) {
            costomarco = 0.15 * (2 * (longitud + ancho));
        } else if (tipomarco.equalsIgnoreCase("lujoso")) {
            costomarco = 0.25 * (2 * (longitud + ancho));
        }
        costoPintura = 0.10 * (2 * (longitud + ancho));
        costoCarton = 0.02 * (longitud * ancho);
        costoVidrio = 0.07 * (longitud * ancho);
        costocoronas = 0.35 * cantidadcoronas;
        costoTotal = costomarco + costoPintura + costoCarton + costoVidrio + costocoronas;
        System.out.println("\nCosto total de enmarcar la fotografía: U$" + costoTotal);

        lector.close();
    }
}

import java.util.Scanner;

public class proyecto30 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String[] menu = {
            "Hamburguesa Big Mac - $5.99",
            "Hamburguesa Quarter Pounder - $6.49",
            "McNuggets 6 piezas - $3.99",
            "Papas Fritas - $2.49",
            "Refresco Mediano - $1.99"
        };

        double[] precios = {5.99, 6.49, 3.99, 2.49, 1.99};
        String[] orden = new String[menu.length];
        double total = 0.0;
        int cantidadItems = 0;

        System.out.println("¡Bienvenido a McDonald's!");
        System.out.println("Este es nuestro menú:");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        while (true) {
            System.out.print("Ingrese el número del platillo que desee (1-" + menu.length + "), o 0 para terminar: ");
            int seleccion = lector.nextInt();

            if (seleccion == 0) {
                break;
            } else if (seleccion < 1 || seleccion > menu.length) {
                System.out.println("Selección no válida. Intente de nuevo.");
                continue;
            }

            cantidadItems++;
            orden[cantidadItems - 1] = menu[seleccion - 1];
            total += precios[seleccion - 1];
        }

        System.out.println("\nDetalle de la factura:");

        for (int i = 0; i < cantidadItems; i++) {
            System.out.println(orden[i]);
        }

        System.out.println("Total a pagar: $" + total);
        lector.close();
    }
}

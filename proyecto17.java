import java.util.Scanner;

public class proyecto17 {
    public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    double ingresos;
    double[] valoresArticulos = { 239.99, 129.75, 99.95, 350.89 };
        System.out.println("Ingrese los artículos vendidos por el vendedor (1, 2, 3, 4), separados por espacios:");
        String entrada = lector.nextLine();
        String[] numerosArticulos = entrada.split(" ");
        double ventasBrutas = 0.0;
        for (String numeroArticulo : numerosArticulos) {
            int indiceArticulo = Integer.parseInt(numeroArticulo) - 1;
            if (indiceArticulo >= 0 && indiceArticulo < valoresArticulos.length) {
                ventasBrutas += valoresArticulos[indiceArticulo];
            }
        }
        ingresos = 200.0 + (0.09 * ventasBrutas);
        System.out.println("Los ingresos del vendedor son: C$" + ingresos);

        lector.close();
    }
}
import java.util.Scanner;

public class proyecto2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Ingrese la longitud de los tres lados del triángulo:");
        System.out.print("Lado 1: ");
        lado1 = lector.nextDouble();
        System.out.print("Lado 2: ");
        lado2 = lector.nextDouble();
        System.out.print("Lado 3: ");
        lado3 = lector.nextDouble();
        if (esTriangulo(lado1, lado2, lado3)) {
            if (esEquilatero(lado1, lado2, lado3)) {
                System.out.println("Es un triángulo equilátero.");
            } else if (esRectangulo(lado1, lado2, lado3)) {
                System.out.println("Es un triángulo rectángulo.");
            } else if (esIsosceles(lado1, lado2, lado3)) {
                System.out.println("Es un triángulo isósceles.");
            } else {
                System.out.println("Es un triángulo escaleno.");
            }
        } else {
            System.out.println("No es un triángulo válido.");
        }
        lector.close();
    }
    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }
    public static boolean esEquilatero(double lado1, double lado2, double lado3) {
        return (lado1 == lado2) && (lado2 == lado3);
    }
    public static boolean esRectangulo(double lado1, double lado2, double lado3) {
        double[] lados = {lado1, lado2, lado3};
        java.util.Arrays.sort(lados);
        return (Math.pow(lados[0], 2) + Math.pow(lados[1], 2) == Math.pow(lados[2], 2));
    }
    public static boolean esIsosceles(double lado1, double lado2, double lado3) {
        return (lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3);
    }
}

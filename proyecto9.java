import java.util.Scanner;

public class proyecto9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numeroMenor, numeroMayor, sumaPares, sumaImparesCuadrados, divisor;
        int num, sumaDivisores;
        System.out.print("Ingrese el primer número (menor): ");
        numeroMenor = lector.nextInt();
        System.out.print("Ingrese el segundo número (mayor): ");
        numeroMayor = lector.nextInt();
        if (numeroMenor >= numeroMayor) {
            System.out.println("El primer número debe ser menor que el segundo. Por favor, inténtelo de nuevo.");
        }
         sumaPares = 0;
         sumaImparesCuadrados = 0;
        System.out.println("Números perfectos entre " + numeroMenor + " y " + numeroMayor + ":");
        for ( num = numeroMenor; num <= numeroMayor; num++) {
            sumaDivisores = 0;
            for ( divisor = 1; divisor < num; divisor++) {
                if (num % divisor == 0) {
                    sumaDivisores += divisor;
                }
            }
            if (sumaDivisores == num) {
                System.out.println(num);
            }
            if (num % 2 != 0) {
                System.out.println("Número impar: " + num);
                sumaImparesCuadrados += num * num;
            }
            if (num % 2 == 0) {
                sumaPares += num;
            }
            System.out.println("Número: " + num + ", Cuadrado: " + num * num);
        }
        System.out.println("Números primos entre " + numeroMenor + " y " + numeroMayor + ":");
        for ( num = numeroMenor; num <= numeroMayor; num++) {
            if (esPrimo(num)) {
                System.out.println(num);
            }
        }
        System.out.println("Suma de números pares: " + sumaPares);
        System.out.println("Suma de cuadrados de números impares: " + sumaImparesCuadrados);

        lector.close();
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

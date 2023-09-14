import java.util.Scanner;

public class proyeccto32 {

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

    public static boolean esNumeroPerfecto(int numero) {
        if (numero <= 1) {
            return false;
        }
        int sumaDivisores = 1;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                if (i != numero / i) {
                    sumaDivisores += numero / i;
                }
            }
        }
        return sumaDivisores == numero;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Ingrese el primer entero (menor que el segundo): ");
            int num1 = lector.nextInt();
            System.out.print("Ingrese el segundo entero: ");
            int num2 = lector.nextInt();

            if (num1 < num2) {
                int sumaPares = 0;
                int sumaCuadradosImpares = 0;

                System.out.println("Números impares entre " + num1 + " y " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }

                System.out.println("Suma de números pares entre " + num1 + " y " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 == 0) {
                        sumaPares += i;
                    }
                }
                System.out.println(sumaPares);

                System.out.println("Números y sus cuadrados entre " + num1 + " y " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    System.out.println(i + "^2 = " + (i * i));
                }

                System.out.println("Suma de cuadrados de números impares entre " + num1 + " y " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 != 0) {
                        sumaCuadradosImpares += (i * i);
                    }
                }
                System.out.println(sumaCuadradosImpares);

                System.out.println("Números perfectos entre " + num1 + " y " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    if (esNumeroPerfecto(i)) {
                        System.out.println(i);
                    }
                }

                System.out.println("Números primos entre " + num1 + " y " + num2 + ":");
                for (int i = num1; i <= num2; i++) {
                    if (esPrimo(i)) {
                        System.out.println(i);
                    }
                }
                break;
            } else {
                System.out.println("El primer número debe ser menor que el segundo. Intente nuevamente.");
                intentos--;
            }
        }

        if (intentos == 0) {
            System.out.println("Ha excedido el número de intentos permitidos.");
        }

        lector.close();
    }
}


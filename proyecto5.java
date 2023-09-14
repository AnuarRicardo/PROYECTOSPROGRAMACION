import java.util.Scanner;

public class proyecto5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, sumaDigitos, valorDigito;
        char digito;
        String numeroComoCadena;
        System.out.print("Ingrese un número entero: ");
        numero = lector.nextInt();
        if (numero < 0) {
            numero = -numero;
        }
         numeroComoCadena = Integer.toString(numero);
         sumaDigitos = 0;
        System.out.print("Dígitos individuales: ");
        for (int i = 0; i < numeroComoCadena.length(); i++) {
             digito = numeroComoCadena.charAt(i);
             valorDigito = Character.getNumericValue(digito);
            System.out.print(valorDigito + " ");

            sumaDigitos += valorDigito;
        }
        System.out.println("\nSuma de los dígitos: " + sumaDigitos);

        lector.close();
    }
}
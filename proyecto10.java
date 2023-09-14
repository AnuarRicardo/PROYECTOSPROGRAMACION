import java.util.Scanner;

public class proyecto10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double pesoCorporal, grasaCorporal, medidaCintura, a1, a2, b;
        double medidaMuñeca, medidaCadera, medidaAntebrazo, a3, a4, a5;
        System.out.println("Calculadora de Grasa Corporal");
        System.out.println("------------------------------");

        System.out.print("Ingrese su sexo (M para hombre, F para mujer): ");
        char sexo = lector.nextLine().charAt(0);

        System.out.print("Ingrese su peso corporal (en kilogramos): ");
        pesoCorporal = lector.nextDouble();

        grasaCorporal = 0.0;

        if (sexo == 'M' || sexo == 'm') {
            System.out.print("Ingrese la medida de la cintura (en centímetros): ");
        medidaCintura = lector.nextDouble();

            // Calcular grasa corporal para hombres
            a1 = (pesoCorporal * 1.082) + 94.42;
            a2 = medidaCintura * 4.15;
            b = a1 - a2;
            grasaCorporal = pesoCorporal - b;
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.print("Ingrese la medida de la muñeca (en centímetros): ");
             medidaMuñeca = lector.nextDouble();
            System.out.print("Ingrese la medida de la cintura (en centímetros): ");
            medidaCintura = lector.nextDouble();
            System.out.print("Ingrese la medida de la cadera (en centímetros): ");
            medidaCadera = lector.nextDouble();
            System.out.print("Ingrese la medida del antebrazo (en centímetros): ");
            medidaAntebrazo = lector.nextDouble();

            // Calcular grasa corporal para mujeres
            a1 = (pesoCorporal * 0.732) + 8.987;
            a2 = medidaMuñeca / 3.140;
            a3 = medidaCintura * 0.157;
            a4 = medidaCadera * 0.249;
            a5 = medidaAntebrazo * 0.434;
            b = a1 + a2 - a3 - a4 + a5;
            grasaCorporal = pesoCorporal - b;
        } else {
            System.out.println("Sexo no válido. Por favor, ingrese 'M' o 'F'.");
            lector.close();
            return;
        }

        double porcentajeGrasaCorporal = (grasaCorporal / pesoCorporal) * 100;

        System.out.println("------------------------------");
        System.out.printf("Su grasa corporal es: %.2f kg%n", grasaCorporal);
        System.out.printf("Su porcentaje de grasa corporal es: %.2f%%%n", porcentajeGrasaCorporal);

        lector.close();
    }
}

import java.util.Scanner;

public class proyecto15 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int horasTrabajadas;
        double sueldoBruto, tarifaPorHora;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Empleado " + i);
            System.out.print("Ingrese el número de horas trabajadas: ");
            horasTrabajadas = lector.nextInt();
            System.out.print("Ingrese la tarifa por hora del empleado: ");
            tarifaPorHora = lector.nextDouble();

            sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaPorHora);
            System.out.println("Sueldo bruto del empleado " + i + ": " + sueldoBruto + " córdobas\n");
        }

        lector.close();
    }

    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaPorHora) {
        double  sueldoBruto;

        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifaPorHora;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;
            double tarifaNormal = tarifaPorHora;
            double tarifaExtra = tarifaPorHora * 1.5;

            sueldoBruto = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);
        }

        return sueldoBruto;
    }
}

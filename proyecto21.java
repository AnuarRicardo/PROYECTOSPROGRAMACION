import java.util.Scanner;

public class proyecto21 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int año;

        do {
            System.out.print("Introduce un año en el rango de 1994 a 1999: ");
            año = lector.nextInt();

            if (año < 1994 || año > 1999) {
                System.out.println("El año está fuera del rango especificado.");
            }
        } while (año < 1994 || año > 1999);

        imprimirCalendario(año);
        lector.close();
    }
    public static void imprimirCalendario(int año) {
        String[] diasSemana = {"Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"};

        for (int mes = 1; mes <= 12; mes++) {
            System.out.println("\n" + obtenerNombreMes(mes) + " " + año);
            System.out.println("Dom Lun Mar Mié Jue Vie Sáb");

            int diaInicio = obtenerDiaInicio(año, mes);
            int diasEnMes = obtenerDiasEnMes(año, mes);

            for (int i = 0; i < diaInicio; i++) {
                System.out.print("    ");
            }

            for (int dia = 1; dia <= diasEnMes; dia++) {
                System.out.printf("%3d ", dia);
                if ((diaInicio + dia) % 7 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static String obtenerNombreMes(int mes) {
        String[] nombres = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return nombres[mes];
    }

    public static int obtenerDiaInicio(int año, int mes) {
        int diaInicio = 0;
        for (int i = 1994; i < año; i++) {
            diaInicio += (esBisiesto(i) ? 366 : 365);
        }
        for (int i = 1; i < mes; i++) {
            diaInicio += obtenerDiasEnMes(año, i);
        }
        return (diaInicio + 1) % 7;
    }

    public static int obtenerDiasEnMes(int año, int mes) {
        int[] diasPorMes = {0, 31, (esBisiesto(año) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes];
    }
}


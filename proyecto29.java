import java.util.Scanner;

public class proyecto29 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int intentosMaximos = 3;

        for (int intento = 1; intento <= intentosMaximos; intento++) {
            System.out.println("Intento " + intento);

            System.out.println("Por favor, ingrese su tipo de residencia:");
            System.out.println("1. Apartamento");
            System.out.println("2. Casa");
            System.out.println("3. Dormitorio");
            int tipoResidencia = lector.nextInt();
            System.out.println("Ingrese la cantidad de horas que está en casa durante el día promedio:");
            int horasEnCasa = lector.nextInt();
            System.out.println("Seleccione una categoría de horas:");
            System.out.println("1. 0-5 horas");
            System.out.println("2. 6-7 horas");
            System.out.println("3. 8-9 horas");
            System.out.println("4. 10-17 horas");
            System.out.println("5. 18 o más horas");
            int categoriaHoras = lector.nextInt();
            String recomendacion = "";
            if (tipoResidencia == 1) {
                if (categoriaHoras >= 4) {
                    recomendacion = "Gato";
                } else {
                    recomendacion = "Hamster";
                }
            } else if (tipoResidencia == 2) {
                if (categoriaHoras == 5) {
                    recomendacion = "Cerdo barrigón";
                } else if (categoriaHoras == 4) {
                    recomendacion = "Perro";
                } else {
                    recomendacion = "Serpiente";
                }
            } else if (tipoResidencia == 3) {
                if (categoriaHoras >= 2) {
                    recomendacion = "Pez";
                } else {
                    recomendacion = "Granja de hormigas";
                }
            } else {
                recomendacion = "No se pudo determinar una recomendación.";
            }

            System.out.println("Recomendación de mascota para ti: " + recomendacion);

            if (intento < intentosMaximos) {
                System.out.println("¿Desea intentarlo de nuevo? (Sí/No)");
                String respuesta = lector.next().toLowerCase();
                if (!respuesta.equals("si")) {
                    break;
                }
            }
        }

         lector.close();
    }
}

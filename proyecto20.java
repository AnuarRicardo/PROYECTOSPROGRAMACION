public class proyecto20 {
    public static void main(String[] args) {
        long inicio, fin;
        long incremento = 1000000;
        long contador = 0;
        inicio = System.currentTimeMillis();
        while (contador < 300000000) {
            contador++;
            if (contador % incremento == 0) {
                fin = System.currentTimeMillis();
                long tiempoTranscurrido = fin - inicio;
                System.out.println("Número alcanzado: " + contador);
                System.out.println("Tiempo transcurrido (ms): " + tiempoTranscurrido);
                inicio = System.currentTimeMillis();
            }
        }
    }
}

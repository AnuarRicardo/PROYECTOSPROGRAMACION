public class proyecto24 {
public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);

    System.out.println("Ingrese tres palabras:");
    String input = lector.nextLine();
    String[] palabras = input.split(" ");
    if (palabras.length == 3) {
        StringBuilder acronimo = new StringBuilder();
        for (String palabra : palabras) {
            acronimo.append(palabra.charAt(0));
        }
        String resultado = acronimo.toString().toUpperCase();
        System.out.println("El acrónimo es: " + resultado);
    } else {
        System.out.println("Debe ingresar exactamente tres palabras.");
    }

    lector.close();
}
}
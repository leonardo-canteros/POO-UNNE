import java.util.Scanner;
/**
 * Esta clase llamada nuevoPunto ejecutara y creara un punto
 * 
 * @author Leonardo Canteros 
 */


public class nuevoPunto {
    
    public static void main(String args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer los datos desde el teclado

        // Solicitamos al usuario las coordenadas iniciales del punto
        System.out.print("Ingrese la coordenada X del punto: ");
        double xInicial = scanner.nextDouble();

        System.out.print("Ingrese la coordenada Y del punto: ");
        double yInicial = scanner.nextDouble();

        // Creamos un objeto Punto con las coordenadas ingresadas
        Punto punto = new Punto(xInicial, yInicial);

        // Mostramos las coordenadas del punto
        System.out.println("El punto inicial es:");
        punto.mostrar();

        // Solicitamos los valores para desplazar el punto
        System.out.print("Ingrese el valor para desplazar en X: ");
        double desplazamientoX = scanner.nextDouble();

        System.out.print("Ingrese el valor para desplazar en Y: ");
        double desplazamientoY = scanner.nextDouble();

        // Desplazamos el punto
        punto.desplazar(desplazamientoX, desplazamientoY);

        // Mostramos las nuevas coordenadas del punto después del desplazamiento
        System.out.println("El punto después del desplazamiento es:");
        punto.mostrar();

        // Cerramos el scanner
        scanner.close();
    }
}

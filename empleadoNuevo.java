import java.util.Scanner;
/**
 * Write a description of class empleadoNuevo here.
 * 
 * @author Leonardo Canteros 
 * @version 
 */
public class empleadoNuevo
{
  
    public static void main(String args)
    {
       Scanner scanner = new Scanner(System.in); // Creamos el objeto Scanner
        
        // Solicitamos los datos al usuario
        System.out.print("Ingrese CUIL: ");
        long cuil = scanner.nextLong();
        
        System.out.print("Ingrese Apellido: ");
        String apellido = scanner.next();
        
        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.next();
        
        System.out.print("Ingrese Sueldo Básico: ");
        double sueldoBasico = scanner.nextDouble();
        
        System.out.print("Ingrese Año de Ingreso: ");
        int anioIngreso = scanner.nextInt();
        
        // Creamos un objeto Empleado usando los datos ingresados
        Empleado empleado = new Empleado(cuil, apellido, nombre, sueldoBasico, anioIngreso);
        
        // Mostramos la información del empleado
        empleado.mostrar();
        
        // Cerramos el Scanner
        scanner.close();
    }
}

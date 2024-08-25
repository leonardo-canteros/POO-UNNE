import java.util.Scanner;
/**
 * Esta clase llamada empleadoNuevo ejecutara y creara un alumno
 * 
 * @author Leonardo Canteros 
 */
public class nuevoPupil
{
    public static void main(int p_libreta,String p_apellido1,String p_nombre1,double p_nota1,double p_nota2)
    {
       pupil alumno = new pupil (p_libreta,p_apellido1,p_nombre1);
       
       alumno.setNota1(7);
       alumno.setNota2(5);
       
       alumno.mostrar();
    }
}

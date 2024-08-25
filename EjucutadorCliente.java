
public class EjucutadorCliente
{

    public static void main (int p_dni , String p_apellido, String p_nombre, double p_saldo)
    {
        Cliente mario = new Cliente (p_dni,p_apellido,p_nombre,p_saldo);
        mario.mostrar();
    }
}

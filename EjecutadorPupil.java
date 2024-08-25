
public class EjecutadorPupil
{
   
    public static void main()
    {
      Pupil Juan = new Pupil(43205,"perez","juan");
      Pupil Maria = new Pupil(43205,"Gomez","Maria");
      
      Juan.setNota1(5.99);
      Juan.setNota2(10);
      Maria.setNota1(7.85);
      Maria.setNota2(8.50);
      
      Juan.mostrar();
      Maria.mostrar();
      
      
      
      
    }
}

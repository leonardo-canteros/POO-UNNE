
/**
 * Write a description of class nuevoLaboratorio here.
 * 
 * @author Canteros Leonardo
 * @version (a version number or a date)
 */
public class nuevoLaboratorio
{
  /**
     * Metodo main que ejecutara un nuevo laboratio y mostrara sus atributos.
     */
    public static void main()
    {
        Laboratorio Colgate = new Laboratorio("Colgate S.A", "Junin 5204" ,"54-11-4239-8447");
        Colgate.mostrar();
         Laboratorio Supermax = new Laboratorio(15000,23,"supermax S.R.L","Hirigoyen 2820","3795452748");
        Supermax.mostrar();
    }
}

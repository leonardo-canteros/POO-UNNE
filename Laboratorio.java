
/**
 * Esta clase describe al objeto de clase laboratorio.
 * 
 * @author Leonardo Canteros 
 *
 */
public class Laboratorio
{
    //Declaracion de atributos del objeto.
    private int compraMin;
    private int diaEntrega;
    private String nombre;
    private String domicilio;
    private String telefono;

    /**
     * Constructor de objetos de clase laboratorio.
     * @param p_compraMinima, p_diaEntrega, p_nombre, p_domicilio, p_telefono.
     */
    
    Laboratorio(int p_compraMinima, int p_diaEntrega, String p_nombre, String p_domicilio, String p_telefono)
    {
      setCompraMin(p_compraMinima);
      setDiaEntrega(p_diaEntrega);
      setNombre(p_nombre);
      setDomicilio(p_domicilio);
      setTelefono(p_telefono);
    }
    
    /**
     * Constructor de objetos de clase laboratorio.
     * @param p_nombre, p_domicilio, p_telefono.
     */
    Laboratorio(String p_nombre,String p_domicilio, String p_telefono)
    {
      setNombre(p_nombre);
      setDomicilio(p_domicilio);
      setTelefono(p_telefono);
    }
    
    
    private void setNombre (String p_nombre){
      this.nombre = "Colgate S.A";  
    }
    
    private void setDomicilio (String p_domicilio){
      this.domicilio = "Junin 5402";  
    }
    
    private void setTelefono (String p_telefono){
      this.telefono = "54-11-4239-8447";  
    }
    
    private void setCompraMin (int p_compramin){
      this.compraMin = p_compramin;  
    }
    
    private void setDiaEntrega (int p_DiaEntrega){
      this.diaEntrega = p_DiaEntrega;  
    }
    
    public String getNombre(){
      return this.nombre;
    }
    
    public String getDomicilio(){
      return this.domicilio;
    }
    
    public String getTelefono(){
      return this.nombre;
    }
    
    public int getCompraMin(){
      return this.compraMin;
    }
    
    public int getDiaEntrega(){
      return this.diaEntrega;
    }
    
    /**
     * Metodo que asienta la nueva compra minima.
     * @param p_compraMinima
     */
    public void nuevaCompraMinima(int p_compraMinima){
      this.compraMin = p_compraMinima;
    }
    
    /**
     * Metodo que asienta el nuevo dia de entrega.
     * @param p_diaEntrega
     */
    public void nuevoDiaEntrega(int p_diaEntrega){
      this.diaEntrega = p_diaEntrega;
    }
    
    /**
     * Metodo que muestra el nomre del laboratorio, su domicilio y su telefono.
     * @param p_compraMinima, p_diaEntrega, p_nombre, p_domicilio, p_telefono.
     */
    public void mostrar(){
      System.out.println("laboratorio : " + getNombre());
      System.out.println("domicilio: " + getDomicilio() + " - " + "Telefono: " + getTelefono() );
    }
    
    
    
    
    
    
    

}

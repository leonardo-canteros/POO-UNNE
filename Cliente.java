
/**
 * Esta clase hace referencia a los objetos Clientes.
 * 
 * @author Canteros Leonardo
 *
 */
public class Cliente
{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    /**
     * Constructor de la clase cliente.
     * @param p_nroDNI,p_apellido,p_nombre,p_saldo.
     */
    public Cliente(int p_nroDNI,String p_apellido,String p_nombre,double p_saldo)
    {
     setNroDNI(p_nroDNI);
     setApellido(p_apellido);
     setNombre(p_nombre);
     setSaldo(p_saldo);
    }
    
    private void setNroDNI (int p_dni){
     this.nroDNI = p_dni;
    }
    
    private void setApellido(String p_apellido){
     this.apellido = p_apellido;
    }
    
    private void setNombre(String p_nombre){
     this.nombre = p_nombre;
    }
    
   private void setSaldo(double p_saldo){
     this.saldo = p_saldo;
    }
    
    
   public int getNroDNI (){
     return this.nroDNI;  
   }
   
     public String getApellido (){
     return this.apellido;  
   }
   
     public String getNombre (){
     return this.nombre;  
   }
   
     public double getSaldo (){
     return this.saldo;  
   }
   
    /**
     * 
     */
    public void mostrar()
    {
        System.out.println("-Cliente-");
        System.out.println("Nombre y apellido :" + nomYape() + "(" + nroDNI + ")" );
        System.out.println("saldo: $" + saldo );
    }
    
    public double nuevoSaldo(double p_importe){
        this.saldo = p_importe; 
        return this.saldo;
    }
    
    public double agregarSaldo(double p_importe){
        this.saldo += p_importe;
        return this.saldo;
    }
    
    public String ApeYnom(){
        return getApellido() + " " + getNombre() ; 
    }
    
    public String nomYape(){
        return getNombre() + " " + getApellido() ; 
    }
}

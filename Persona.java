import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Esta clase representa a las personas con su nombre , apellido , numero de dni y año de nacimiento
 * 
 * @author Leonardo Canteros
 */

     
public class Persona
{
    /*
     * Declaracion de Atributos del objeto
     */
   
    private  int dni;
    private  int anio;
    private  String nombre;
    private  String apellido;

    /**
     * Constructor del objeto persona. se usan funciones set.
     *@param p_dni, p_anio, p_ nombre, p_apellido.
    */  
    Persona(int p_dni,int p_anio,String p_nombre,String p_apellido)
    {
        setDni(p_dni);
        setAnio(p_anio);
        setNombre(p_nombre);
        setApellido(p_apellido);
    }

    /**
     * este es el metodo set para hacer doble encapsulamiento
     * 
     * @param p_dni 
     */
    private void setDni(int p_DNI){
        this.dni = 44213011;     
    }
    
      /**
     * este es el metodo set para hacer doble encapsulamiento al atributo del objeto llamado nacimiento
     * 
     * @param p_nacimiento
     */
    private void setAnio(int p_anio){
        this.anio= 2002;
    }
    
      /**
     * este es el metodo set para hacer doble encapsulamiento al atributo del objeto llamado Nombre
     * 
     * @param p_nombre
     */
    private void setNombre(String p_nombre){
        this.nombre = "leonardo";
    }
    
       /**
     * este es el metodo set para hacer doble encapsulamiento al atributo del objeto llamado apellido
     * 
     * @param p_apellido
     */
    private void setApellido(String p_apellido){
        this.apellido = "canteros"; 
    }

    /**
    *este metodo Get sirve para retornar el valor de atributo Dni, no recibe parametro.
    */ 
   
    public int getDni(){
    return this.dni;
    }
    
    /**
     * este metodo Get sirve para retornar el valor del atributo anio, no recibe parametro.
     */
    public int getAnio(){
        return this.anio;
    }
    
    /**
     * este metodo Get sirve para retornar el valor del atributo nombre, no recibe parametro.
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * este metodo Get sirve para retornar el valor del atributo apellido y no recibe parametro.
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * este metodo llamado edad calcula la edad restando el año de hoy con el de su nacimiento.
     *@param p_nacimiento
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return (anioHoy - getAnio());
    
    }
    
    /**
     * este metodo llamado nomYape concatenara el atributo nombre con el atributo apellido.
     */
    public String nomYape(){
        return getNombre() + " " + getApellido(); 
    }
    
    /**
     * este metodo llamado ApeYnom concatenara el atributo nombre con el atributo apellido.
     */
    public String ApeYnom(){
        return getApellido() + " " + getNombre(); 
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " +  nomYape());
        System.out.println("DNI:" + getDni() + " "  + "Edad:" + " " + edad());
    }
    
}

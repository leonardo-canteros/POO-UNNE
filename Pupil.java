
/**
 * Se desea obtener el promedio de calificaciones de los estudiantes de Programación Orientada a Objetos. Para ello, el concepto abstracto
    Se modela la "pupila". Cuando se crea una instancia de Alumno, como aún no se conocen las calificaciones, se inicializan en
    cero. El método promedio() devuelve el promedio de los estudiantes.
    puntos de calificación. El método aprueba() devuelve verdadero o falso
    según si el promedio de calificaciones del estudiante es mayor o igual
    a 7,0 y si ambos notas son iguales o superiores a 6,0. El
    El método leyendaAprueba() devuelve una cadena APROBADO o
    DESAPROBADO según el método aprueba() regresa.
    La salida impresa del método mostrar() debe ser: (en negrita
    los valores muestran el estado interno del objeto)
 * 
 * @author Joaquin Ferretto 
 *
 */
public class Pupil
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1=0;
    private double nota2=0;
    
    /**
     * Constructor de la clase pupilo
     */
    public Pupil(int p_lu, String p_nombre, String p_apellido)
    {
        this.lu=p_lu;
        this.nombre= p_nombre;
        this.apellido = p_apellido;
    }

    /**
     * el metodo setNota1 hace un doble encapsulamiento al atributo nota1
     * 
     * @param  p_nota1
     */
    public void setNota1(double p_nota1)
    {
        this.nota1= p_nota1;
    }
     /**
     * el metodo setNota2 hace un doble encapsulamiento al atributo nota2
     * 
     * @param  p_nota2
     */
    public void setNota2(double p_nota2)
    {
        this.nota2= p_nota2;
    }
     /**
     * el metodo aprueba determina y devuelve verdadero o falso si las notas son mayores o iguales a 6 y si su promedio es igual o
     * mayor a 7, no recibe parametros
     * @return true o false.
     */
    private boolean aprueba(){
        if(this.nota1 >= 6.0 && this.nota2 >= 6.0 && this.promedio() >= 7.0 ){
            return true;
        } else {
            return false;
        }
            
    }
     /**
     * el metodo promedio promedia las notas para retornar un valor double para promediar las notas.
     * 
     * @return promedio
     */
    public double promedio(){
        return (this.nota1 + this.nota2) / 2; 
    }
     /**
     * el metodo leyendaAprueba evalua a traves de la funcion aprueba si el pupilo aprueba o no, devuelve APROBADO O DESAPROBADO
     * 
     * @return "APROBADO" O "DESAPROBADO"
     */
    public String leyendaAprueba(){
        if(this.aprueba() == true){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
     /**
     * el metodo apeYnom retorna un string con el apellido y nombre
     * 
     * @return String
     */
    public String ApeYnom(){
        return this.apellido + " " + this.nombre ; 
    }
    /**
     * el metodo apeYnom retorna un string con el nombre y apellido
     * 
     * @return String
     */
    public String nomYape(){
        return this.nombre + " " + this.apellido ; 
    }
    /**
     * el metodo mostrar muestra los datos solicitados acerca del pupilo.
     * 
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("LU :" + lu + " " + "Notas : " + nota1 + "-" + nota2);
        System.out.println("Promedio :" + this.promedio() + "-" + this.leyendaAprueba());
    }
}

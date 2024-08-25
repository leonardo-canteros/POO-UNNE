/**
 * La clase {@code Pupil} crea un alumno y permite gestionar y mostrar sus datos personales y notas.
 * Proporciona métodos para establecer y obtener información del alumno, así como para evaluar
 * si aprueba en base a sus notas.
 * 
 * @author Leonardo Canteros
 */
public class pupil {
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1 = 0;
    private double nota2 = 0;

    /**
     * Constructor de la clase {@code Pupil}.
     * Inicializa un objeto Pupil con su número de libreta universitaria (LU), nombre y apellido.
     * 
     * @param p_lu Número de libreta universitaria del alumno.
     * @param p_nombre Nombre del alumno.
     * @param p_apellido Apellido del alumno.
     */
    public pupil(int p_lu, String p_nombre, String p_apellido) {
        setNombre(p_nombre);
        setApellido(p_apellido);
        setLu(p_lu);
    }

    /**
     * Establece el nombre del alumno.
     * 
     * @param p_nombre Nombre del alumno.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el apellido del alumno.
     * 
     * @param p_apellido Apellido del alumno.
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Establece el número de libreta universitaria (LU) del alumno.
     * 
     * @param p_lu Número de libreta universitaria del alumno.
     */
    private void setLu(int p_lu) {
        this.lu = p_lu;
    }

    /**
     * Devuelve el nombre del alumno.
     * 
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el apellido del alumno.
     * 
     * @return Apellido del alumno.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Devuelve el número de libreta universitaria (LU) del alumno.
     * 
     * @return Número de libreta universitaria del alumno.
     */
    public int getLu() {
        return lu;
    }

    /**
     * Establece la primera nota del alumno.
     * 
     * @param p_nota1 Primera nota del alumno.
     */
    public void setNota1(double p_nota1) {
        this.nota1 = p_nota1;
    }

    /**
     * Establece la segunda nota del alumno.
     * 
     * @param p_nota2 Segunda nota del alumno.
     */
    public void setNota2(double p_nota2) {
        this.nota2 = p_nota2;
    }

    /**
     * Devuelve la primera nota del alumno.
     * 
     * @return Primera nota del alumno.
     */
    public double getNota1() {
        return nota1;
    }

    /**
     * Devuelve la segunda nota del alumno.
     * 
     * @return Segunda nota del alumno.
     */
    public double getNota2() {
        return nota2;
    }

    /**
     * Determina si el alumno aprueba en base a sus notas.
     * Se considera aprobado si ambas notas son mayores o iguales a 6 y el promedio es mayor o igual a 7.
     * 
     * @return {@code true} si aprueba, de lo contrario {@code false}.
     */
    private boolean aprueba() {
        return getNota1() >= 6.0 && getNota2() >= 6.0 && promedio() >= 7.0;
    }

    /**
     * Devuelve una cadena que indica si el alumno está "APROBADO" o "DESAPROBADO".
     * 
     * @return "APROBADO" si el alumno aprueba, de lo contrario "DESAPROBADO".
     */
    private String leyendaAprueba() {
        return aprueba() ? "APROBADO" : "DESAPROBADO";
    }

    /**
     * Calcula y devuelve el promedio de las dos notas del alumno.
     * 
     * @return Promedio de las notas.
     */
    public double promedio() {
        return (getNota1() + getNota2()) / 2;
    }

    /**
     * Devuelve una cadena con el nombre y apellido del alumno.
     * 
     * @return Nombre y apellido del alumno.
     */
    public String nomYape() {
        return getNombre() + " " + getApellido();
    }

    /**
     * Devuelve una cadena con el apellido y nombre del alumno.
     * 
     * @return Apellido y nombre del alumno.
     */
    public String ApeYnom() {
        return getApellido() + " " + getNombre();
    }

    /**
     * Muestra los datos del alumno, incluyendo el nombre completo, número de libreta universitaria,
     * notas, promedio y si está aprobado o desaprobado.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + nomYape());
        System.out.println("LU :" + lu + " " + "Notas : " + nota1 + "-" + nota2);
        System.out.println("Promedio :" + promedio() + " - " + leyendaAprueba());
    }
}

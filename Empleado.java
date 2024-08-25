import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase {@code Empleado} representa un empleado con información personal
 * y laboral, como CUIL, nombre, apellido, sueldo básico y año de ingreso.
 * Además, permite calcular la antigüedad, los descuentos, adicionales y 
 * el sueldo neto.
 * 
 * @author Leonardo Canteros
 * 
 */
public class Empleado {
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor para crear un objeto {@code Empleado} con los detalles específicos
     * como CUIL, apellido, nombre, sueldo básico y año de ingreso.
     * 
     * @param p_cuil         El CUIL del empleado.
     * @param p_apellido     El apellido del empleado.
     * @param p_nombre       El nombre del empleado.
     * @param p_sueldoBasico El sueldo básico del empleado.
     * @param p_anioIngreso  El año en que ingresó el empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, int p_anioIngreso) {
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldoBasico(p_sueldoBasico);
        setAnioIngreso(p_anioIngreso);
    }

    /**
     * Calcula la antigüedad del empleado con base en el año actual.
     * 
     * @return La antigüedad del empleado en años.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.anioIngreso;
    }

    /**
     * Establece el CUIL del empleado.
     * 
     * @param p_cuil El CUIL del empleado.
     */
    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    /**
     * Establece el apellido del empleado.
     * 
     * @param p_apellido El apellido del empleado.
     */
    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param p_nombre El nombre del empleado.
     */
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    /**
     * Establece el sueldo básico del empleado.
     * 
     * @param p_sueldoBasico El sueldo básico del empleado.
     */
    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    /**
     * Establece el año de ingreso del empleado.
     * 
     * @param p_anioIngreso El año en que el empleado ingresó a la empresa.
     */
    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    /**
     * Obtiene el CUIL del empleado.
     * 
     * @return El CUIL del empleado.
     */
    public long getCuil() {
        return cuil;
    }

    /**
     * Obtiene el apellido del empleado.
     * 
     * @return El apellido del empleado.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el sueldo básico del empleado.
     * 
     * @return El sueldo básico del empleado.
     */
    public double getSueldoBasico() {
        return sueldoBasico;
    }

    /**
     * Obtiene el año de ingreso del empleado.
     * 
     * @return El año en que el empleado ingresó a la empresa.
     */
    public int getAnioIngreso() {
        return anioIngreso;
    }

    /**
     * Calcula el descuento aplicado al sueldo básico.
     * 
     * @return El valor del descuento aplicado.
     */
    private double descuento() {
        return ((sueldoBasico * 2) / 100 + 1500);
    }

    /**
     * Calcula el adicional aplicado según la antigüedad del empleado.
     * 
     * @return El valor adicional basado en la antigüedad.
     */
    private double adicional() {
        int antiguedad = antiguedad(); // Guardamos el valor para no calcularlo varias veces
        if (antiguedad < 2) {
            return (sueldoBasico * 2) / 100;
        } else if (antiguedad >= 2 && antiguedad < 10) {
            return (sueldoBasico * 4) / 100;
        } else {
            return (sueldoBasico * 6) / 100;
        }
    }

    /**
     * Calcula el sueldo neto del empleado después de aplicar el descuento y
     * el adicional.
     * 
     * @return El sueldo neto del empleado.
     */
    public double sueldoNeto() {
        return (sueldoBasico + this.adicional()) - this.descuento();
    }

    /**
     * Retorna el nombre completo del empleado en el formato "Apellido, Nombre".
     * 
     * @return El nombre completo del empleado en formato "Apellido, Nombre".
     */
    public String apeYnom() {
        return this.getApellido() + ", " + this.getNombre();
    }

    /**
     * Retorna el nombre completo del empleado en el formato "Nombre Apellido".
     * 
     * @return El nombre completo del empleado en formato "Nombre Apellido".
     */
    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Muestra por consola la información detallada del empleado, incluyendo su
     * nombre completo, CUIL, antigüedad y sueldo neto.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYape());
        System.out.println("CUIL: " + this.getCuil() + " | Antigüedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }

    /**
     * Retorna una cadena con la información del empleado en una sola línea,
     * incluyendo CUIL, apellido y nombre, y el sueldo neto.
     * 
     * @return Una cadena con el CUIL, apellido, nombre y sueldo neto del empleado.
     */
    public String mostrarLinea() {
        return this.getCuil() + " " + this.apeYnom() + " $" + this.sueldoNeto();
    }
}

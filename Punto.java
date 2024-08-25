/**
 * La clase {@code Punto} representa un punto en un plano cartesiano con
 * coordenadas X e Y.
 * Permite establecer y modificar las coordenadas, así como desplazar el punto
 * en el plano.
 * 
 * @author Leonardo Canteros
 */
public class Punto {
    private double x;
    private double y;

    /**
     * Constructor sin parámetros que inicializa las coordenadas del punto en (0, 0).
     */
    public Punto() {
        y = 0;
        x = 0;
    }

    /**
     * Establece la coordenada X del punto.
     *
     * @param p_x la coordenada X a establecer
     */
    private void setX(double p_x) {
        this.x = p_x;
    }

    /**
     * Establece la coordenada Y del punto.
     *
     * @param p_y la coordenada Y a establecer
     */
    private void setY(double p_y) {
        this.y = p_y;
    }

    /**
     * Devuelve la coordenada X del punto.
     *
     * @return la coordenada X
     */
    public double getX() {
        return x;
    }

    /**
     * Devuelve la coordenada Y del punto.
     *
     * @return la coordenada Y
     */
    public double getY() {
        return y;
    }

    /**
     * Constructor que inicializa las coordenadas del punto con los valores dados.
     *
     * @param p_x la coordenada X inicial del punto
     * @param p_y la coordenada Y inicial del punto
     */
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }

    /**
     * Desplaza el punto sumando los valores dados a las coordenadas actuales.
     *
     * @param p_x el valor a sumar a la coordenada X
     * @param p_y el valor a sumar a la coordenada Y
     */
    public void desplazar(double p_x, double p_y) {
        x += p_x;
        y += p_y;
    }

    /**
     * Devuelve una representación de las coordenadas del punto en formato "X,Y".
     *
     * @return una cadena que representa las coordenadas del punto
     */
    public String coordenadas() {
        return this.getX() + "," + this.getY();
    }

    /**
     * Muestra las coordenadas actuales del punto en la consola.
     */
    public void mostrar() {
        System.out.println("Punto. x:" + this.getX() + "," + " " + "Y:" + this.getY());
    }
}

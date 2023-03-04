package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 * @author Iván Estévez
 */
public class Circulito {
    /**
     * Coordenada X
     */
    private int coordenadaX;
    
    /**
     * Coordenada Y
     */
    private int coordenadaY;
    
    /**
     * Constante Limite Radio
     */
    final private double LIMITERADIO = 0.0;
    
    /**
     * Radio
     */
    private double radio;

    /**
     * Constructor genérico (vacío) para la clase Circulo
     */
    public Circulito() {
    }

    /**
     * Constructor para la clase Circulo que asigna los valores de las
     * coordenadas X, Y y el valor del Radio
     * @param valorX valor de la coordenada X
     * @param valorY valor de la coordenada Y
     * @param valorRadio valor del radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * Obtiene el valor del diámetro.
     * @return el valor del diámetro (como double).
     */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    /**
     * Obtiene el valor de la Circunferencia
     * @return el valor de la circunferencia (como double).
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Obtiene el valor del área del círculo
     * @return el valor del área del circulo (como double).
     */
    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Genera una String con la posición del círculo así como su radio
     * @return String con los valores de las coordenadas X, Y y del radio.
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * Actualiza los valores de las coordenadas X e Y según las unidades indicadas.
     * @param trasladarX las unidades a trasladar de la coordenada X
     * @param trasladarY las unidades a trasladar de la coordenada Y
     */
    public void trasladarCentro(int trasladarX, int trasladarY){
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * Obtiene el valor de la coordenada X.
     * @return el valor de la coordenada X
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * Establece el valor de la coordenada X.
     * @param coordenadaX valor de la coordenada X
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * Obtiene el valor de la coordenada Y.
     * @return el valor de la coordenada Y
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * Establece el valor de la coordenada Y.
     * @param coordenadaY valor de la coordenada Y
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * Obtiene el valor del radio
     * @return el valor del Radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el valor del radio.
     * Si se introduce un valor negativo, se asianará a 0.
     * Se admite cualquier valor real positivo o 0.
     * @param radio valor del radio mayor o igual a 0
     */
    public void setRadio(double radio) { //Original: valorRadio < 0.0 ? 0.0 : valorRadio
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }
}

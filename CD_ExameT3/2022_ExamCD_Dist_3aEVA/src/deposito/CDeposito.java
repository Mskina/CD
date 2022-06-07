package deposito;

/**
 * Clase <b>CDeposito</b> empleada para examen 3EVA
 *
 * @author María + Iván
 * @version 2022
 */
public class CDeposito {

    /**
     * Propietario del depósito
     */
    private String propietario;

    /**
     * ID del propietario
     */
    private String id;

    /**
     * Litros del depósito
     */
    private double litros;

    /**
     * Valor de la reducción
     */
    private double tipoReduccion;

    /**
     * Constructor por defecto
     */
    public CDeposito() {
    }

    /**
     * Constructor del depósito
     *
     * @param nom valor del nombre del propietario
     * @param id valor del id del propietario
     * @param lit valor de los litros
     * @param tipo valor del tipo de reducción
     */
    public CDeposito(String nom, String id, double lit, double tipo) {
        propietario = nom;
        id = id;
        litros = lit;
    }

    /**
     * Obtiene el estado del depósito.
     *
     * @return la cantidad de litros del depósito
     */
    public double estado() {
        return getLitros();
    }

    /**
     * Metodo para llenar cantidades en la id. Modifica el litros. Este metodo
     * va a ser probado para refactorización
     * @throws Exception al querer llenar con una cantidad negativa
     */
    public void llenar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("Optimiz_Doc: No se puede llenar una cantidad negativa");
        }
        setLitros(getLitros() + cantidad);
    }

    /**
     * Metodo para quitar cantidades en la id. Modifica el litros. Este metodo
     * va a ser usado para Refactorización
     *
     * @throws Exception al querer retirar una cantidad negativa o superior a la
     * disponible
     */
    public void quitar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("Optimiz_Doc: No se puede quitar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("Optimiz_Doc: No se hay suficiente litros");
        }
        setLitros(getLitros() - cantidad);
    }

    /**
     * Metodo para llenar cantidades en la id. Modifica el litros. Este metodo
     * va a ser probado con Junit
     */
    public int llenarPruebas(double cantidad) {
        /**
         * Código de error
         */
        int iCodErr;

        if (cantidad < 0) {
            System.out.println("Depurac_Pruebas: No se puede llenar una cantidad negativa");
            iCodErr = 1;
        } else if (cantidad == -7) {
            System.out.println("Depurac_Pruebas: Error detectable en pruebas de caja blanca");
            iCodErr = 2;
        } else {
            // Depuracion. Punto de parada. Solo en el 3 ingreso        
            setLitros(getLitros() + cantidad);
            iCodErr = 0;
        }

        // Depuracion. Punto de parada cuando la cantidad  es menor de 0        
        return iCodErr;
    }

    /**
     * Metodo para quitar cantidades en la id. Modifica el litros. Este metodo
     * va a ser probado con Junit
     */
    public double quitarPruebas(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Depurac_Pruebas: No se puede quitar una cantidad negativa");
        } else if (getLitros() < cantidad) {
            System.out.println("Depurac_Pruebas: No hay suficiente litros");
        } else {

            setLitros(getLitros() - cantidad);
        }

        return getLitros();
    }

    /**
     * Obtiene el propietario del depósito
     *
     * @return el propietario del depósito
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Establece el valor del propietario
     *
     * @param propietario valor del propietario a establecer
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Obtiene el id del propietario
     *
     * @return el id del propietario
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el valor del id
     *
     * @param id el id del propietario a establecer
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene los litros del depósito
     *
     * @return los litros del depósito
     */
    public double getLitros() {
        return litros;
    }

    /**
     * Establece el valor de los litros
     *
     * @param litros el valor de los litros a establecer
     */
    public void setLitros(double litros) {
        this.litros = litros;
    }

    /**
     * Obtiene el tipo de reducción
     *
     * @return el tipoReduccion de la reducción
     */
    public double getTipoReduccion() {
        return tipoReduccion;
    }

    /**
     * Establece el tipo de reducción
     *
     * @param tipoReduccion el tipo de reducción a establecer
     */
    public void setTipoReduccion(double tipoReduccion) {
        this.tipoReduccion = tipoReduccion;
    }
}

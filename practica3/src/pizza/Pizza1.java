package src.pizza;

/**
 * Clase para la pizza número 1.
 */
public class Pizza1 implements Pizza {

    /**
     * Devuelve el precio de la pizza.
     * @return Precio de la pizza.
     */
    @Override
    public double getPrecio() {
        return 71.6;
    }

    /**
     * Devuelve el tipo de queso de la pizza.
     * @return Queso de la pizza.
     */
    @Override
    public String getTipoQueso() {
        return "Queso chedar";
    }

    /**
     * Devuelve el tipo de carne de la pizza.
     * @return Carne de la pizza.
     */
    @Override
    public String getTipoCarne() {
        return "Jamón";
    }

    /**
     * Devuelve el tipo de masa de la pizza.
     * @return Masa de la pizza.
     */
    @Override
    public String getTipoMasa() {
        return "Masa delgada";
    }
    
}
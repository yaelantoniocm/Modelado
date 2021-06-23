package src.pizza;

/**
 * Interfaza para las pizzas.
 */
public interface Pizza {

	/**
     * Devuelve el precio de la pizza.
     * @return Precio de la pizza.
     */
    public double getPrecio();

    /**
     * Devuelve el tipo de queso de la pizza.
     * @return Queso de la pizza.
     */
    public String getTipoQueso();

    /**
     * Devuelve el tipo de carne de la pizza.
     * @return Carne de la pizza.
     */
    public String getTipoCarne();

    /**
     * Devuelve el tipo de masa de la pizza.
     * @return Masa de la pizza.
     */
    public String getTipoMasa();
    
}
package src.pizza;

/**
 * Clase para la pizza número 2.
 */
public class Pizza2 implements Pizza {

    /**
     * Devuelve el precio de la pizza.
     * @return Precio de la pizza.
     */
    @Override
    public double getPrecio() {
        return 73.3;
    }

    /**
     * Devuelve el tipo de queso de la pizza.
     * @return Queso de la pizza.
     */
    @Override
    public String getTipoQueso() {
        return "Queso manchego";
    }

    /**
     * Devuelve el tipo de carne de la pizza.
     * @return Carne de la pizza.
     */
    @Override
    public String getTipoCarne() {
        return "Salchicha";
    }

    /**
     * Devuelve el tipo de masa de la pizza.
     * @return Masa de la pizza.
     */
    @Override
    public String getTipoMasa() {
        return "Masa gruesa";
    }
    
}
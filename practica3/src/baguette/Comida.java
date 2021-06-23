package src.baguette;

public interface Comida {

    /**
     * Devuelve el precio.
     * @return Precio de la comida.
     */
    public double getPrecio();

    /**
     * Devuelve los ingredientes de la comida.
     * @return Ingredientes de la comida.
     */
    public String getIngredientes();
    
}
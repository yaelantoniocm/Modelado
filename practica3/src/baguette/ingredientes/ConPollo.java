package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle pollo al baguette.
 */
public class ConPollo extends DecoradorBaguette {

    /**
     * Constructor de la clase ConPollo.
     * @param  baguette Baguette a agregar pollo.
     * @return          Baguette con pollo.
     */
    public ConPollo(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con pollo.
     * @return Precio de la pollo.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 4.5;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Pollo";
    }
}
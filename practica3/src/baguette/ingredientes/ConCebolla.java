package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle cebolla al baguette.
 */
public class ConCebolla extends DecoradorBaguette {

    /**
     * Constructor de la clase ConCebolla.
     * @param  baguette Baguette a agregar cebolla.
     * @return          Baguette con cebolla.
     */
    public ConCebolla(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con cebolla.
     * @return Precio de la cebolla.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 1.7;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Cebolla";
    }
}
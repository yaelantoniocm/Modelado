package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle mostaza al baguette.
 */
public class ConMostaza extends DecoradorBaguette {

    /**
     * Constructor de la clase ConMostaza.
     * @param  baguette Baguette a agregar mostaza.
     * @return          Baguette con mostaza.
     */
    public ConMostaza(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con mostaza.
     * @return Precio de la mostaza.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 2.3;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Mostaza";
    }
}
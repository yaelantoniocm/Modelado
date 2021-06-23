package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle lechuga al baguette.
 */
public class ConLechuga extends DecoradorBaguette {

    /**
     * Constructor de la clase ConLechuga.
     * @param  baguette Baguette a agregar lechuga.
     * @return          Baguette con lechuga.
     */
    public ConLechuga(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con lechuga.
     * @return Precio de la lechuga.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 3;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Lechuga";
    }
}
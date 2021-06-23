package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle jamón al baguette.
 */
public class ConJamon extends DecoradorBaguette {

    /**
     * Constructor de la clase ConJamon.
     * @param  baguette Baguette a agregar jamón.
     * @return          Baguette con jamón.
     */
    public ConJamon(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con jamón.
     * @return Precio de la jamón.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 4;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Jamón";
    }
}
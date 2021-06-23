package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle catsup al baguette.
 */
public class ConCatsup extends DecoradorBaguette {

    /**
     * Constructor de la clase ConCatsup.
     * @param  baguette Baguette a agregar catsup.
     * @return          Baguette con catsup.
     */
    public ConCatsup(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con catsup.
     * @return Precio de la catsup.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 2;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Catsup";
    }
}
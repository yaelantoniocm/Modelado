package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle jitomate al baguette.
 */
public class ConJitomate extends DecoradorBaguette {

    /**
     * Constructor de la clase ConJitomate.
     * @param  baguette Baguette a agregar jitomate.
     * @return          Baguette con jitomate.
     */
    public ConJitomate(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con jitomate.
     * @return Precio de la jitomate.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 2.4;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Jitomate";
    }
}
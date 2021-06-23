package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle mayonesa al baguette.
 */
public class ConMayonesa extends DecoradorBaguette {

    /**
     * Constructor de la clase ConMayonesa.
     * @param  baguette Baguette a agregar mayonesa.
     * @return          Baguette con mayonesa.
     */
    public ConMayonesa(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con mayonesa.
     * @return Precio de la mayonesa.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 1.8;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Mayonesa";
    }
}
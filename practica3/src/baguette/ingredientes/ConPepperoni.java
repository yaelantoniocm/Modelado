package src.baguette.ingredientes;

import src.baguette.*;

/**
 * Clase para ponerle pepperoni al baguette.
 */
public class ConPepperoni extends DecoradorBaguette {

    /**
     * Constructor de la clase ConPepperoni.
     * @param  baguette Baguette a agregar pepperoni.
     * @return          Baguette con pepperoni.
     */
    public ConPepperoni(Comida baguette) {
        super(baguette);
    }

    /**
     * Devuelve el precio del baguette con pepperoni.
     * @return Precio de la pepperoni.
     */
    @Override
    public double getPrecio() {
        return super.getPrecio() + 3.5;
    }

    /**
     * Devuelve los ingredientes que contiene el baguette.
     * @return Ingredientes del baguette.
     */
    @Override
    public String getIngredientes() {
        return super.getIngredientes() + ", Pepperoni";
    }
}
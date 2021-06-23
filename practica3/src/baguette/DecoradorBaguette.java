package src.baguette;

/**
 * Clase que usa el patrón de diseño Decorator, y será aplicado para los baguettes.
 */
public abstract class DecoradorBaguette implements Comida {

    private final Comida baguetteDecorado;

    /**
     * Constructor de la clase.
     * @param  baguette Baguette a poner ingredientes.
     */
    public DecoradorBaguette(Comida baguette) {
        this.baguetteDecorado = baguette;
    }

    /**
     * Devuelve el precio.
     * @return Precio de la comida.
     */
    @Override
    public double getPrecio() {
        return baguetteDecorado.getPrecio();
    }

    /**
     * Devuelve los ingredientes de la comida.
     * @return Ingredientes de la comida.
     */
    @Override
    public String getIngredientes() {
        return baguetteDecorado.getIngredientes();
    }
}
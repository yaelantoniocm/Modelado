package src.baguette.ingredientes;

import src.baguette.*;

public class PanDeCenteno implements Comida {

	/**
     * Devuelve el precio.
     * @return Precio de la comida.
     */
    @Override
    public double getPrecio() {
        return 21.2;
    }

    /**
     * Devuelve los ingredientes de la comida.
     * @return Ingredientes de la comida.
     */
    @Override
    public String getIngredientes() {
        return "Pan de centeno";
    }
}
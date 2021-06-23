package src.pizza;

import src.baguette.*;

/**
 * Clase usando el patrón de diseño Adaptador.
 */
public class AdaptadorPizza implements Comida {

    private Pizza pizza;

    /**
     * Constructor de la clase AdaptadorPizza.
     * @param  pizza Pizza a adaptar.
     * @return       Pizza ya adaptada.
     */
    public AdaptadorPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * Devuelve el precio de la pizza.
     * @return Precio de la pizza.
     */
    @Override
    public double getPrecio() {
        return pizza.getPrecio();
    }

    /**
     * Devuelve los ingredientes que contiene la pizza.
     * @return Ingredientes de la pizza.
     */
    @Override
    public String getIngredientes() {
        return pizza.getTipoQueso() + ", " + pizza.getTipoCarne() 
               + ", " + pizza.getTipoMasa();
    }

}
package src.maquinas.wonka3000;

import src.maquinas.Dulces;

/**
 * Clase de la máquina Wonka3000.
 */
public abstract class Wonka3000 extends Dulces {

    /**
     * Método para preparar la receta.
     */
    @Override
    public final void prepararReceta() {
        elegirMolde();
        ponerMezcla();
        agregarIngredientesExtra();
    }

}
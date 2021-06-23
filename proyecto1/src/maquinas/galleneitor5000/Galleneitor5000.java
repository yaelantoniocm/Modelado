package src.maquinas.galleneitor5000;

import src.maquinas.Dulces;

/**
 * Clase de la máquina Galleneitor5000.
 */
public abstract class Galleneitor5000 extends Dulces {

    /**
     * Método para preparar la receta.
     */
    public final void prepararReceta() {
        cocinarMasa();
        elegirMolde();
        ponerMezcla();
        agregarIngredientesExtra();
    }

    /**
     * Método para cocinar la masa.
     */
    public abstract void cocinarMasa();

    /**
     * Método para elegir un molde para las galletas.
     */
    public void elegirMolde() {
        System.out.println("Poniendo molde de galletas redondas...");
    }
}
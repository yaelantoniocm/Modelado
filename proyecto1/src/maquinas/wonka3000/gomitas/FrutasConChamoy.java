package src.maquinas.wonka3000.gomitas;

import src.maquinas.wonka3000.*;

/**
 * Clase para las frutas con chamoy.
 */
public class FrutasConChamoy extends Wonka3000 {

    /**
     * Método para elegir un molde.
     */
	public void elegirMolde() {
        System.out.println("Eligiendo molde para frutas con chamoy...");
    }

    /**
     * Método para poner la mezcla.
     */
    public void ponerMezcla() {
        System.out.println("Poniendo frutas con chamoy...");
        ingredientes.usar("sal", 0.3);
    }

    /**
     * Método para agregar ingredientes extra.
     */
    public void agregarIngredientesExtra() {
        System.out.println("Agregando chamoy...");
        ingredientes.usar("chamoy", 9.6);
    }
}
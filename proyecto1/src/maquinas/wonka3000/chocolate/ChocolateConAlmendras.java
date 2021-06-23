package src.maquinas.wonka3000.chocolate;

import src.maquinas.wonka3000.*;

/**
 * Clase para el chocolate con almendras.
 */
public class ChocolateConAlmendras extends Wonka3000 {

    /**
     * Método para elegir un molde.
     */
	public void elegirMolde() {
        System.out.println("Eligiendo molde para chocolate con almendras...");
    }

    /**
     * Método para poner la mezcla.
     */
    public void ponerMezcla() {
        System.out.println("Preparando mezcla...");
        ingredientes.usar("cacao", 4.6);
        ingredientes.usar("leche", 1.6);
        ingredientes.usar("agua", 1.3);
        ingredientes.usar("azucar", 3.6);
    }

    /**
     * Método para agregar ingredientes extra.
     */
    public void agregarIngredientesExtra() {
        System.out.println("Poniendo almendras...");
        ingredientes.usar("almendras", 3);
        ingredientes.usar("chispas_de_chocolate", 7.6);
    }
}
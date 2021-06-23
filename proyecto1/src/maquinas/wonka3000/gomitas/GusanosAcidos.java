package src.maquinas.wonka3000.gomitas;

import src.maquinas.wonka3000.*;

/**
 * Clase para los gusanos ácidos.
 */
public class GusanosAcidos extends Wonka3000 {

    /**
     * Método para elegir un molde.
     */
	public void elegirMolde() {
        System.out.println("Eligiendo molde para gusanos ácidos...");
    }

    /**
     * Método para poner la mezcla.
     */
    public void ponerMezcla() {
        System.out.println("Preparando mezcla...");
        ingredientes.usar("agua", 30);
        ingredientes.usar("grenetina", 20);
        ingredientes.usar("azucar", 15);
    }

    /**
     * Método para agregar ingredientes extra.
     */
    public void agregarIngredientesExtra() {
        System.out.println("Agregando azúcar...");
        ingredientes.usar("miel_de_saborizante_acido", 9.3);
    }
}
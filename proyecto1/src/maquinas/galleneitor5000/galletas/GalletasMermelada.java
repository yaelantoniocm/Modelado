package src.maquinas.galleneitor5000.galletas;

import src.maquinas.galleneitor5000.*;

/**
 * Clase para las galletas con mermelada.
 */
public class GalletasMermelada extends Galleneitor5000 {

    /**
     * Método para cocinar la masa.
     */
    public void cocinarMasa() {
        System.out.println("Cocinando masa...");
        ingredientes.usar("harina", 15.4);
        ingredientes.usar("huevo", 3);
        ingredientes.usar("azucar", 8.4);
        ingredientes.usar("leche", 6);
    }

    /**
     * Método para poner la mezcla.
     */
    public void ponerMezcla() {
        System.out.println("Poniendo mermelada a la masa...");
        ingredientes.usar("mermelada", 3.2);
    }

    /**
     * Método para agregar ingredientes extra.
     */
    public void agregarIngredientesExtra() {
        System.out.println("Poniendo azúcar...");
        ingredientes.usar("azucar", 2.5);
    }
}
package src.maquinas.galleneitor5000.galletas;

import src.maquinas.galleneitor5000.*;

/**
 * Clase para las galletas saladas.
 */
public class GalletasSaladas extends Galleneitor5000 {

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
        System.out.println("Poniendo mezcla...");
    }

    /**
     * Método para agregar ingredientes extra.
     */
    public void agregarIngredientesExtra() {
        System.out.println("Poniendo sal...");
        ingredientes.usar("sal", 3.5);
    }

}
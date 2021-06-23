package src;

import src.maquinas.*;

/**
 * Interfaz usando el principio del patrón de diseño Observador.
 */
public interface Observador {

    /**
     * Método para reabastecer un cierto ingrediente.
     * @param ingrediente  ingrediente a reabastecer.
     * @param ingredientes lista de ingredientes.
     */
    public void actualizar(String ingrediente, ListaIngredientes ingredientes);
    
}
package src.maquinas;

/**
 * Interfaz usando el patrón Observador.
 */
public interface Sujeto {

    /**
     * Método para notificar al observador.
     * Avisa cuando no hay ingredientes en la máquina.
     * @param ingrediente  ingrediente a reabastecer.
     * @param ingredientes lista de ingredientes.
     */
    public void notificar(String ingrediente, ListaIngredientes ingredientes);
}
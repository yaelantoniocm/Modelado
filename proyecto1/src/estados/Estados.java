package src.estados;

/**
 * Interfaz para los estados.
 */
public interface Estados {

    /**
     * Suspende la maquina.
     */
    public void suspenderse();

    /**
     * Apaga la maquina.
     */
    public void apagar();

    /**
     * Activa la maquina.
     */
    public void activar();

    /**
     * Pone a empacar a la maquina.
     */
    public void empacar();

    /**
     * Pone a prepara dulces a la maquina.
     */
    public boolean prepararDulce();

    /**
     * Reabastece los ingredientes de la máquina.
     */
    public void reabastecerIngredientes();

}
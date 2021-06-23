package src.estados;

/**
 * Interfaz pra los estados.
 */
public interface Estados {
    
    /**
     * Activa a el personal.
     */
    public void activarse();

    /**
     * Suspende a el personal.
     */
    public void suspenderse();

    /**
     * Pone a cocinar a el personal.
     */
    public void cocinar();

    /**
     * Pone a atender a el personal.
     */
    public void atender();
    
    /**
     * Pone a caminar a el personal.
     */
    public void caminar();
}
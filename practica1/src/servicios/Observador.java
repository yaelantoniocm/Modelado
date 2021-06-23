package src.servicios;

/**
 * Interfaz con el principio del diseño de patrón Observador.
 */
public interface Observador {

	/**
     * Método que verifica si un usuario aún puede usar los servicios dependiendo de su saldo.
     * @param saldoSuficiente indica si el usuario tiene saldo positivo.
     * @param nombre          nombre del usuario.
     */
    public void actualizar(boolean saldoSuficiente, String nombre);
}
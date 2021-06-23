package src.comida;

import java.util.Iterator;

/**
 * Interfaz del menú.
 */
public interface Menu {

    /**
     * Método para agregar comida al menú.
     * @param nombre        nombre de la comida.
     * @param descripcion   descripción de la comida.
     * @param id            id de la comida.
     * @param tieneQueso    tiene queso o no la comida.
     * @param esVegetariano es vegetariana o no la comida.
     */
    public void agregarComida(String nombre, String descripcion, int id,
                              boolean tieneQueso, boolean esVegetariano);

    /**
     * Crea un iterador para recorrer el menú.
     * @return iterator para recorrer el menú.
     */
    public Iterator crearIterador();
}
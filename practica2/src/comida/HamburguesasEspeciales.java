package src.comida;

import java.util.Iterator;
import java.util.Hashtable;

/**
 * Clase para el menú de las hamburguesas especiales.
 */
public class HamburguesasEspeciales implements Menu {
    private Hashtable<String, ItemMenu> comidas;

    /**
     * Constructor del menú.
     * Se agregan varias comidas.
     */
    public HamburguesasEspeciales() {
        this.comidas = new Hashtable<String, ItemMenu>();
        
        agregarComida("Hamburguesa de res", "Hamburguesa que contiene dos rebanadas de pan y una rebanada de carne de res de marte, incluye papas fritas.", 8, true, false);
        agregarComida("Hamburguesa vegana", "Hamburguesa que contiene dos rebanadas de pan, dos rebanadas de jitomate y una rebanada de lechuga, todos estos ingredientes fueron cosechados en Venus.", 9, false, true);
        agregarComida("Hamburguesa de pizza", "Hamburguesa que contiene 2 rebanadas de pan integral, 3 rebanadas de pizza y 3 pedazos de carne.", 10, true, false);
        agregarComida("Hamburguesa mega alta en proteina", "Hamburguesa que contiene 4 rebanadas de pan, 8 pedazos de carne, 3 pedazo de pollo, salsa BBQ, lechuga, jitomate, aros de cebolla y papas fritas, ¡pesa en total 4.6kg!", 11, true, false);
    }

    /**
     * Método para agregar comida al menú.
     * @param nombre        nombre de la comida.
     * @param descripcion   descripción de la comida.
     * @param id            id de la comida.
     * @param tieneQueso    tiene queso o no la comida.
     * @param esVegetariano es vegetariana o no la comida.
     */
    @Override
    public void agregarComida(String nombre, String descripcion, int id, 
                              boolean tieneQueso, boolean esVegetariano) {
        ItemMenu nuevaComida = new ItemMenu(nombre, descripcion, id, 
                                            tieneQueso, esVegetariano);
        comidas.put(nuevaComida.getNombre(), nuevaComida);
    }

    /**
     * Crea un iterador para recorrer el menú.
     * @return iterator para recorrer el menú.
     */
    @Override
    public Iterator crearIterador() {
        return comidas.values().iterator();
    }
}
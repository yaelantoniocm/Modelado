package src.comida;

import java.util.Iterator;
import java.util.ArrayList;

/**
 * Clase para el menú de las hamburguesas.
 */
public class Hamburguesas implements Menu {
    private static final int MAXIMO_DE_COMIDAS = 4;
    private ItemMenu[] comidas;
    private int numeroDeItems;

    /**
     * Constructor para las hamburguesas.
     * Se añaden hamburguesas al menú.
     */
    public Hamburguesas() {
        this.comidas = new ItemMenu[this.MAXIMO_DE_COMIDAS];

        agregarComida("Hamburguesa aburrida", "Hamburguesa que contiene dos rebanadas de pan y un pedazo de carne.", 0, false, false);
        agregarComida("Hamburguesa aburrida para vegetarianos", "Hamburguesa que contiene dos rebanadas de pan, dos rebanadas de jitomate y un pedazo de lechuga.", 1, false, true);
        agregarComida("El paraiso", "Hamburguesa que contiene 4 rebanadas de pan, 3 pedazos de carne, salsa BBQ, mucha lechuga, aros de cebolla y papas fritas", 2, true, false);
        agregarComida("Hamburguesa simple", "Hamburguesa que contiene 2 rebanadas de pan, 1 pedazo de carne, salsa BBQ, lechuga, jitomate, aros de cebolla y papas fritas", 3, true, false);
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
        if (this.numeroDeItems < this.MAXIMO_DE_COMIDAS) {
            ItemMenu nuevaComida = new ItemMenu(nombre, descripcion, id, 
                                                tieneQueso, esVegetariano);
            this.comidas[this.numeroDeItems] = nuevaComida;
            this.numeroDeItems += 1; 
        } else {
            System.out.println("Ya no se pueden agregar más comidas.");
        }
    }

    /**
     * Crea un iterador para recorrer el menú.
     * @return iterator para recorrer el menú.
     */
    @Override
    public Iterator crearIterador() {
        return new HamburguesasIterador(this.comidas);
    }
}
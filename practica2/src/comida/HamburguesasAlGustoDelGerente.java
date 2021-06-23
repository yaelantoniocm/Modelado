package src.comida;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Clase del menú que cambia cada día.
 */
public class HamburguesasAlGustoDelGerente implements Menu {
    private ArrayList<ItemMenu> comidas;

    /**
     * Constructor del menú.
     * Se agregan varias comidas.
     */
    public HamburguesasAlGustoDelGerente() {
        this.comidas = new ArrayList<ItemMenu>();

        agregarComida("Hamburguesa con jamón", "Hamburguesa que contiene dos rebanadas de pan y una rebanada de jamón.", 4, true, false);
        agregarComida("Hamburguesa de pollo", "Hamburguesa que contiene dos rebanadas de pan, dos rebanadas de jitomate y pollo.", 5, true, true);
        agregarComida("Hamburguesa Light", "Hamburguesa que contiene 2 rebanadas de pan integral, 1 pedazo de pollo asado, lechuga, cebolla y arroz", 6, true, false);
        agregarComida("Hamburguesa alta en proteina", "Hamburguesa que contiene 2 rebanadas de pan, 5 pedazos de carne, 1 pedazo de pollo, salsa BBQ, lechuga, jitomate, aros de cebolla y papas fritas", 7, true, false);
        modificarMenu();
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
        comidas.add(nuevaComida);
    }

    /**
     * Crea un iterador para recorrer el menú.
     * @return iterator para recorrer el menú.
     */
    @Override
    public Iterator crearIterador() {
        return comidas.iterator();
    }

    /**
     * Método que modifica el menú de acuerdo con el gusto del
     * gerente.
     */
    private void modificarMenu() {
        Random random = new Random();
        int randomInt = random.nextInt(comidas.size());
        this.comidas.remove(randomInt);
    }
}
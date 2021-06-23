package src.comida;

import java.util.Iterator;

/**
 * Clase para iterar el menú de las hamburguesas.
 */
public class HamburguesasIterador implements Iterator {
    private ItemMenu[] comidas;
    private int posicion = 0;

    public HamburguesasIterador(ItemMenu[] comidas) {
        this.comidas = comidas;
    }

    /**
     * Devuelve el objeto actual dependiendo de la posición y
     * aumenta la posición en uno.
     * @return objeto actual dependiendo de la posición.
     */
    @Override
    public Object next() {
        if (this.hasNext()) {
            ItemMenu item = comidas[posicion];
            posicion += 1;
            return item;
        }

        return null;
    }

    /**
     * Método que dice si hay siguiente elemento o no.
     * @return hay siguiente elemento o no.
     */
    @Override
    public boolean hasNext() {
        if (posicion >= comidas.length || comidas[posicion] == null)
            return false;
        
        return true;
     }
}
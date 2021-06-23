package src.sucursales;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import src.maquinas.Dulces;

/**
 * Clase de la sucursal 3.
 */
public class Sucursal3 extends Sucursal {

    private LinkedList<Dulces> inventario;

    /**
     * Constructor de la clase Sucursal3.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     */
    public Sucursal3(String id, String direccion) {
        this.inventario = new LinkedList<Dulces>();
        this.id = id;
        this.direccion = direccion;
    }

    /**
     * Devuelve el iterador de la sucursal.
     * @return iterador de la sucursal.
     */
    @Override
    public Iterator getIterador() {
        return this.inventario.descendingIterator();
    }

    /**
     * Agrega productos al inventario actual.
     * @param inventario inventario a agregar.
     */
    @Override
    public void agregarInventario(ArrayList<Dulces> nuevoLote) {
        for (Dulces d: nuevoLote)
            this.inventario.add(d);
    }

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    public void revisarInventario() {
        ArrayList<String> inventarioCadena = new ArrayList<String>();

        for (Dulces d: this.inventario)
            inventarioCadena.add(d.getClass().getSimpleName());

        agregarInventario(repostero.pedido(inventarioCadena));
    }

}
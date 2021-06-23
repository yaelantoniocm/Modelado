package src.sucursales;

import java.util.Iterator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ArrayList;
import src.maquinas.Dulces;

/**
 * Clase de la sucursal 2.
 */
public class Sucursal2 extends Sucursal {

    private Hashtable<Integer, Dulces> inventario;

    /**
     * Constructor de la clase Sucursal2.
     * @param  id     id de la sucursal.
     * @param  direccion dirección de la sucursal.
     */
    public Sucursal2(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
        this.inventario = new Hashtable<Integer, Dulces>();
    }

    /**
     * Devuelve el iterador de la sucursal.
     * @return iterador de la sucursal.
     */
    @Override
    public Iterator getIterador() {
        return this.inventario.values().iterator();
    }

    /**
     * Agrega productos al inventario actual.
     * @param inventario inventario a agregar.
     */
    @Override
    public void agregarInventario(ArrayList<Dulces> nuevoLote) {
        //for (int i = 0; i < nuevoLote.size(); i++)
        //    this.inventario.put(i + this.inventario.size(), nuevoLote.get(i));
    }

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    public void revisarInventario() {
        ArrayList<String> inventarioCadena = new ArrayList<String>();
        Enumeration e = this.inventario.elements();
        Object dulce;

        while (e.hasMoreElements()) {
            dulce = e.nextElement();
            inventarioCadena.add(dulce.getClass().getSimpleName());
        }

        int tamaño = this.inventario.size() == 0 ? -1 : 0;

        for (Dulces d: repostero.pedido(inventarioCadena))
            this.inventario.put(++tamaño, d);
    }
}
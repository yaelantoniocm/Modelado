package src.sucursales;

import java.util.ArrayList;
import java.util.Iterator;
import src.maquinas.Dulces;

/**
 * Clase abstracta para guardar los datos de las sucursales..
 */
public abstract class Sucursal {

    protected String id;
    protected String direccion;
    protected Repostero repostero = new Repostero();

    /**
     * Regresa el Id de la sucursal.
     * @return Regresa el Id de la sucursal.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Regresa el direccion de la sucursal.
     * @return Regresa el direccion de la sucursal.
     */
    public String getdireccion() {
        return this.direccion;
    }

    /**
     * Devuelve el iterador de la sucursal.
     * @return iterador de la sucursal.
     */
    public abstract Iterator getIterador();

    /**
     * Método para agregar dulces al inventario de la sucursal.
     * @param inventario ArrayList con los nuevos dulces empaquetados.
     */
    public abstract void agregarInventario(ArrayList<Dulces> nuevoLote);

    /**
     * Método para revisar el inventario, si falta algún dulce
     * se comunica con el repostero y lo repone usando la máquina Wonka3000.
     */
    public abstract void revisarInventario();

}
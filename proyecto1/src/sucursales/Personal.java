package src.sucursales;

import java.util.ArrayList;
import src.maquinas.Dulces;

/**
 * Clase para guardar los datos del personal.
 */
public class Personal {

    private String id, rfc, nombre, camion;
    private Sucursal sucursal;
    private ArrayList<Dulces> dulcesEmpaquetados;

    /**
     * Constructor de la clase Personal.
     * @param  id     id del personal.
     * @param  rfc    rfc del personal.
     * @param  nombre nombre del personal.
     * @return        Un objeto de tipo Personal.
     */
    public Personal(String id, String rfc, String nombre) {
        this.id = id;
        this.rfc = rfc;
        this.nombre = nombre;
    }

    /**
     * Regresa el Id del personal.
     * @return Regresa el Id del personal.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Regresa el rfc del personal.
     * @return Regresa el rfc del personal.
     */
    public String getRfc() {
        return this.rfc;
    }

    /**
     * Regresa el nombre del personal.
     * @return Regresa el nombre del personal.
     */
    public Sucursal getSucursal() {
        return this.sucursal;
    }

    /**
     * Método para asignar la entrega al repartidor.
     * @param sucursal           sucursal de destino.
     * @param camion             camión a usar.
     * @param numeroDeLotes      número de lotes.
     * @param dulcesEmpaquetados dulces empaquetados.
     */
    public void asignarEntrega(Sucursal sucursal, String camion, int numeroDeLotes, 
                               ArrayList<Dulces> dulcesEmpaquetados) {
        System.out.println("Se ha asignado a " + this.nombre + 
                           " la sucursal " + sucursal.getId() + " en el " + camion);
        
        this.sucursal = sucursal;
        this.camion = camion;
        this.dulcesEmpaquetados = distribuirLotes(numeroDeLotes, dulcesEmpaquetados);

        entregarLote(sucursal);
    }

    /**
     * Método para distribuir los lotes dado el número de lotes.
     * @param  numeroDeLotes      Número de lotes.
     * @param  dulcesEmpaquetados ArrayList con el lote de dulces.
     * @return                    Un ArrayList con el total de dulces empaquetados.
     */
    private ArrayList<Dulces> distribuirLotes(int numeroDeLotes, 
                                              ArrayList<Dulces> dulcesEmpaquetados) {
        ArrayList<Dulces> nuevosDulces = new ArrayList<Dulces>();

        for (int i = 0; i < numeroDeLotes; i++)
            nuevosDulces.addAll(dulcesEmpaquetados);
        
        return nuevosDulces;
    }

    /**
     * Método para entregar los lotes a cada sucursal.
     * @param sucursal Sucursal de destino.
     */
    private void entregarLote(Sucursal sucursal) {
        sucursal.agregarInventario(this.dulcesEmpaquetados);
    }

}
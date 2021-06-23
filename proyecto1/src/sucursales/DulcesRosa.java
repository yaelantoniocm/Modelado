package src.sucursales;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase para la empresa dulces Rosa.
 */
public class DulcesRosa {

    private ArrayList<Personal> repartidores;
    private ArrayList<Sucursal> sucursales;

    private Sucursal s1, s2, s3;
    
    /**
     * Constructor de la clase dulces Rosa.
     */
    public DulcesRosa() {
        this.repartidores = new ArrayList<Personal>();
        this.sucursales = new ArrayList<Sucursal>();

        this.repartidores.add(new Personal("1", "0000a", "repartidor1"));
        this.repartidores.add(new Personal("2", "0000b", "repartidor2"));
        this.repartidores.add(new Personal("3", "0000c", "repartidor3"));
        this.repartidores.add(new Personal("4", "0000d", "repartidor4"));
        this.repartidores.add(new Personal("5", "0000e", "repartidor5"));
        this.repartidores.add(new Personal("6", "0000f", "repartidor6"));
        this.repartidores.add(new Personal("7", "0000g", "repartidor7"));

        this.s1 = new Sucursal1("1", "dirección 1");
        this.s2 = new Sucursal2("2", "dirección 2");
        this.s3 = new Sucursal3("3", "dirección 3");

        this.sucursales.add(s1);
        this.sucursales.add(s2);
        this.sucursales.add(s3);
    }

    /**
     * Deuvelve la lista de los repartidores de la empresa Dulces Rosa.
     * @return lista de los repartidores.
     */
    public ArrayList<Personal> getRepartidores() {
        return this.repartidores;
    }

    /**
     * Deuvelve la lista de los repartidores de la empresa Dulces Rosa.
     * @return lista de los repartidores.
     */
    public ArrayList<Sucursal> getSucursales() {
        return this.sucursales;
    }

    /**
     * Método para hacer el reporte global de las sucursales.
     */
    public void reporteGlobal() {
        Iterator sucursal1 = s1.getIterador();
        Iterator sucursal2 = s2.getIterador();
        Iterator sucursal3 = s3.getIterador();

        System.out.println("\n<---------- Reporte global ---------->");
        System.out.println("\n+-+-+- Inventario de la sucursal 1 -+-+-+\n");
        reporteGlobal(sucursal1);
        System.out.println("\n+-+-+- Inventario de la sucursal 2 -+-+-+\n");
        reporteGlobal(sucursal2);
        System.out.println("\n+-+-+- Inventario de la sucursal 3 -+-+-+\n");
        reporteGlobal(sucursal3);
    }

    /**
     * Método privado para iterar el inventario de cada sucursal.
     * @param iterador iterador del inventario del sucursal.
     */
    private void reporteGlobal(Iterator iterador) {
        while (iterador.hasNext())
            System.out.println(iterador.next().getClass().getSimpleName());
    }

}
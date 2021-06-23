package src.sucursales;

import src.maquinas.FabricaDulces;
import src.maquinas.Dulces;
import src.*;

import java.util.ArrayList;

/**
 * Clase para el repostero de cada sucursal.
 */
public class Repostero {

    /**
     * Método para hacer pedidos a la máquina Wonka3000.
     * @param  inventarioCadena Inventario de la sucursal.
     * @return                  Un ArrayList con los nuevos dulces.
     */
    public ArrayList<Dulces> pedido(ArrayList<String> inventarioCadena) {
        ArrayList<Dulces> inventario = new ArrayList<Dulces>();

        Dulces osoDulce = pedido("OsitosDulces", inventarioCadena);
        Dulces gusanoAcido = pedido("GusanosAcidos", inventarioCadena);
        Dulces frutasChamoy = pedido("FrutasConChamoy", inventarioCadena);
        Dulces chocolateAlmendras = pedido("ChocolateConAlmendras", inventarioCadena);
        Dulces chocolateLeche = pedido("ChocolateConLeche", inventarioCadena);
        Dulces chocolateOscuro = pedido("ChocolateOscuro", inventarioCadena);

        if (osoDulce != null)
            inventario.add(osoDulce);

        if (gusanoAcido != null)
            inventario.add(gusanoAcido);
       
        if (frutasChamoy != null)
            inventario.add(frutasChamoy);
       
        if (chocolateAlmendras != null)
            inventario.add(chocolateAlmendras);
       
        if (chocolateLeche != null)
            inventario.add(chocolateLeche);
       
        if (chocolateOscuro != null)
            inventario.add(chocolateOscuro);

        return inventario;
    }

    /**
     * Método para hacer pedidos a la máquina Wonka 3000.
     * @param  nombreDulce Nombre del dulce deseado.
     * @return              Dulce deseado.
     */
    private Dulces pedido(String nombreDulce, ArrayList<String> inventario) {
        return JefeTecnico.revisarPeticion(nombreDulce, inventario);
    }
    
}
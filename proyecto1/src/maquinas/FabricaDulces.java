package src.maquinas;

import src.maquinas.wonka3000.gomitas.*;
import src.maquinas.wonka3000.chocolate.*;
import src.maquinas.galleneitor5000.galletas.*;

/**
 * Clase para que la empaquetación sea uniforme.
 * Basada en el patrón de diseño Factory.
 */
public class FabricaDulces {

    /**
     * Metodo para crear las máquinas.
     * @param  maquina      nombre de la máquina.
     * @param  nombreComida comida de la máquina.
     * @return              Máquina descrita que produce la comida deseada.
     */
    public static Dulces getMaquina(String maquina, String nombreComida) {
        
        if ("Wonka3000".equalsIgnoreCase(maquina)) {
            if ("OsitosDulces".equalsIgnoreCase(nombreComida))
                return new OsitosDulces();
            if ("GusanosAcidos".equalsIgnoreCase(nombreComida))
                return new GusanosAcidos();
            if ("FrutasConChamoy".equalsIgnoreCase(nombreComida))
                return new FrutasConChamoy();
            if ("ChocolateConAlmendras".equalsIgnoreCase(nombreComida))
                return new ChocolateConAlmendras();
            if ("ChocolateConLeche".equalsIgnoreCase(nombreComida))
                return new ChocolateConLeche();
            if ("ChocolateOscuro".equalsIgnoreCase(nombreComida))
                return new ChocolateOscuro();
        } else if ("Galleneitor5000".equalsIgnoreCase(maquina)) {
            if ("GalletasChispas".equalsIgnoreCase(nombreComida))
                return new GalletasChispas();
            if ("GalletasMermelada".equalsIgnoreCase(nombreComida))
                return new GalletasMermelada();
            if ("GalletasSaladas".equalsIgnoreCase(nombreComida))
                return new GalletasSaladas();
        }

        return null;
    }
}

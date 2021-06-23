package src.maquinas;

import java.util.HashMap;

/**
 * Clase en la cual guarda los ingredientes para cada comida.
 */
public class ListaIngredientes {

    public HashMap<String, Double> ingredientes;

    /**
     * Constructor de la clase ListaIngredientes.
     * Pone los ingredientes y su cantidad en un diccionario.
     */
    public ListaIngredientes() {
        this.ingredientes = new HashMap<String, Double>();

        this.ingredientes.put("almendras", 500.0);
        this.ingredientes.put("cacao", 500.0);
        this.ingredientes.put("leche", 500.0);
        this.ingredientes.put("manteca_de_cacao", 500.0);

        this.ingredientes.put("grenetina", 500.0);
        this.ingredientes.put("agua", 500.0);
        this.ingredientes.put("miel_de_maiz", 500.0);
        this.ingredientes.put("azucar", 500.0);
        this.ingredientes.put("miel_de_saborizante_acido", 500.0);
        this.ingredientes.put("chamoy", 500.0);

        this.ingredientes.put("harina", 500.0);
        this.ingredientes.put("huevo", 500.0);
        this.ingredientes.put("sal", 500.0);
        this.ingredientes.put("chispas_de_chocolate", 500.0);
        this.ingredientes.put("mermelada", 500.0);

    }

    /**
     * Método para usar un ingrediente en especifico y quita cierta cantidad.
     * @param ingrediente ingrediente el cual se va a usar.
     * @param cantidad    cantidad a usar del ingrediente.
     */
    public void usar(String ingrediente, double cantidad) {
        double nuevaCantidad = this.ingredientes.get(ingrediente) - cantidad;
        this.ingredientes.remove(ingrediente);
        this.ingredientes.put(ingrediente, nuevaCantidad);
    }
    
    /**
     * Método para reabastecer un cierto ingrediente.
     * @param ingrediente ingrediente a reabastecer.
     * @param cantidad    cantidad que se va a reabastecer.
     */
    public void llenar(String ingrediente, double cantidad) {
        this.ingredientes.remove(ingrediente);
        this.ingredientes.put(ingrediente, cantidad);
    }
}

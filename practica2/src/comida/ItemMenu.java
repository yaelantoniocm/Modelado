package src.comida;

/**
 * Clase para crear las comidas.
 */
public class ItemMenu {
    private String nombre;
    private String descripcion;
    private int id;
    private boolean tieneQueso;
    private boolean esVegetariano;

    /**
     * Constructor para crear las comidas.
     * @param nombre        nombre de la comida.
     * @param descripcion   descripción de la comida.
     * @param id            id de la comida.
     * @param tieneQueso    tiene queso o no la comida.
     * @param esVegetariano es vegetariana o no la comida.
     */
    public ItemMenu(String nombre, String descripcion, int id, 
                    boolean tieneQueso, boolean esVegetariano) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id = id;
        this.tieneQueso = tieneQueso;
        this.esVegetariano = esVegetariano;
    }

    /**
     * Regresa el nombre de la comida.
     * @return nombre de la comida.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Regresa la descripción de la comida.
     * @return descripción de la comida.
     */
    public String getDescripcion() {
        return this.descripcion;
    }

    /**
     * Regresa el id de la comida.
     * @return id de la comida.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Regresa si la comida es vegetariana o no.
     * @return la comida es vegetariana o no.
     */
    public boolean esVegatariana() {
        return this.esVegetariano;
    }

    /**
     * Regresa si la comida tiene queso o no.
     * @return la comida tiene queso o no.
     */
    public boolean tieneQueso() {
        return this.tieneQueso;
    }
}
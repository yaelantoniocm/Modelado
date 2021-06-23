package src.maquinas;

import src.*;
import src.estados.*;

/**
 * Clase para generalizar las máquinas.
 * Basado en el principio del patrón de diseno Template.
 */
public abstract class Dulces extends Maquina implements Sujeto {

    public ListaIngredientes ingredientes = new ListaIngredientes();
    private JefeTecnico jefe = new JefeTecnico();

    /**
     * Método para preparar la receta.
     */
    public abstract void prepararReceta();

    /**
     * Método para elegir un molde.
     */
    public abstract void elegirMolde();

    /**
     * Método para poner la mezcla.
     */
    public abstract void ponerMezcla();

    /**
     * Método para agregar ingredientes extra.
     */
    public abstract void agregarIngredientesExtra();

    /**
     * Método que actualiza la cantidad del ingrediente.
     * @param ingrediente ingrediente del cual se agotó en la máquina.
     */
    @Override
    public void notificar(String ingrediente, ListaIngredientes ingredientes) {
        jefe.actualizar(ingrediente, ingredientes);
    }

}
package src.estados;

import src.PersonalDelRestaurante;

/**
 * Clase del estado de Atender.
 */
public class Atender implements Estados {
    private PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Atender.
     * @param  pdr Personal del restaurante.
     */
    public Atender(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("¡Ya estoy activo!");
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        System.out.println("No puedo suspenderme, ¡estoy atendiendo a un cliente!");
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Cocinando, espere por favor.");
        pdr.asignarEstado(pdr.getEstadoCocinar());
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        System.out.println("Ya estoy atendiendo");
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("No puedo caminar, ¡estoy atendiendo a un cliente!");
    }
}
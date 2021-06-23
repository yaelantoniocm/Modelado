package src.estados;

import src.PersonalDelRestaurante;

/**
 * Clase del estado de Cocinar.
 */
public class Cocinar implements Estados {
    private PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Cocinar.
     * @param  pdr Personal del restaurante.
     */
    public Cocinar(PersonalDelRestaurante pdr) {
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
        System.out.println("No puedo suspenderme, estoy cocinando para un cliente!");
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Ya estoy cocinando, sea paciente.");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        System.out.println("No puedo atender, estoy cocinando.");
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("No puedo caminar, estoy cocinando!");
    }
}
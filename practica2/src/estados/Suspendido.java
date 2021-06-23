package src.estados;

import src.PersonalDelRestaurante;

/**
 * Clase del estado de Suspendido.
 */
public class Suspendido implements Estados {
    private PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Suspendido.
     * @param  pdr Personal del restaurante.
     */
    public Suspendido(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("Activando...");
        this.pdr.asignarEstado(pdr.getEstadoActivarse());
        this.pdr.imprimeEstado();
        System.out.println("Caminando hacia el cliente...");
        this.pdr.caminar();
        this.pdr.imprimeEstado();
        System.out.println("Ya estoy al frente del usuario.");
        this.pdr.atender();
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        System.out.println("Ya estoy suspendido, ¡actívame!");
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Primero actívame.");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        System.out.println("Primero actívame.");
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("Primero actívame.");
    }
}
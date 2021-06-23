package src.estados;

import src.PersonalDelRestaurante;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase del estado de activarse.
 */
public class Activo implements Estados {
    private PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Activo.
     * @param  pdr Personal del restaurante.
     */
    public Activo(PersonalDelRestaurante pdr) {
        this.pdr = pdr;
    }

    /**
     * Activa a el personal.
     */
    @Override
    public void activarse() {
        System.out.println("Ya estoy activo, asígname una actividad.");
    }

    /**
     * Suspende a el personal.
     */
    @Override
    public void suspenderse() {
        System.out.println("Suspendiendo...");
        this.pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("Primero dime qué platillo deseas.");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        this.caminar();
        this.pdr.atender();
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("Caminando...");
        this.pdr.asignarEstado(pdr.getEstadoCaminar());
    }
}
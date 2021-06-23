package src.estados;

import src.PersonalDelRestaurante;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase del estado de Caminar.
 */
public class Caminar implements Estados {
    private PersonalDelRestaurante pdr;

    /**
     * Constructor de la clase Caminar.
     * @param  pdr Personal del restaurante.
     */
    public Caminar(PersonalDelRestaurante pdr) {
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
        System.out.println("Suspendiendo...");
        this.pdr.asignarEstado(pdr.getEstadoSuspender());
    }

    /**
     * Pone a cocinar a el personal.
     */
    @Override
    public void cocinar() {
        System.out.println("No puedo cocinar mientras estoy caminando, ¡es peligroso!");
    }

    /**
     * Pone a atender a el personal.
     */
    @Override
    public void atender() {
        this.pdr.asignarEstado(pdr.getEstadoAtender());
        this.pdr.imprimeEstado();
        System.out.println("\nHola, nuestro menú de hoy es:\n");
        this.pdr.imprimirMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué hamburguesa desea? Sólo digame el Id de la comida.");
        try {
            int id = scanner.nextInt();
            this.pdr.cocinar(id);
        } catch(NoSuchElementException nsee) {
            System.out.println("\n¡Introduzca un número!\n");
            this.atender();
        }
    }

    /**
     * Pone a caminar a el personal.
     */
    @Override
    public void caminar() {
        System.out.println("Ya estoy caminando.");
    }
}
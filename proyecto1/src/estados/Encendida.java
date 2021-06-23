package src.estados;

import src.maquinas.Maquina;

/**
 * Clase para el estado de Encendida.
 */
public class Encendida implements Estados {

    private Maquina maquina;

    /**
     * Constructor de la clase Encendida.
     * @param  maquina nombre de la máquina.
     */
    public Encendida(Maquina maquina) {
        this.maquina = maquina;
    }

    /**
     * Suspende la maquina.
     */
    @Override
    public void suspenderse() {
        System.out.println("Suspendiendo...");
        this.maquina.asignarEstado(this.maquina.getEstadoSuspendida());
    }

    /**
     * Apaga la maquina.
     */
    @Override
    public void apagar() {
        System.out.println("Apagando...");
        this.maquina.asignarEstado(this.maquina.getEstadoApagada());
    }

    /**
     * Activa la maquina.
     */
    @Override
    public void activar() {
        System.out.println("Activando máquina...");
        this.maquina.asignarEstado(this.maquina.getEstadoEncendida());
    }

    /**
     * Pone a empacar a la maquina.
     */
    @Override
    public void empacar() {
        System.out.println("Primero dime qué dulce deseas que prepare.");
    }

    /**
     * Pone a prepara dulces a la maquina.
     */
    @Override
    public boolean prepararDulce() {
        System.out.println("Preparando lote de dulces...");
        return true;
    }

    /**
     * Reabastece los ingredientes de la máquina.
     */
    @Override
    public void reabastecerIngredientes() {
        System.out.println("SE PUEDE.");
    }

}
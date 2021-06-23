package src.estados;

import src.maquinas.Maquina;

/**
 * Clase para el estado Apagada.
 */
public class Apagada implements Estados {

    private Maquina maquina;

    /**
     * Constructor de la clase Apagada.
     * @param  maquina nombre de la máquina.
     */
    public Apagada(Maquina maquina) {
        this.maquina = maquina;
    }

    /**
     * Suspende la maquina.
     */
    @Override
    public void suspenderse() {
        System.out.println("Máquina apagada, primero actívame.");
    }

    /**
     * Apaga la maquina.
     */
    @Override
    public void apagar() {
        System.out.println("Ya estoy apagada.");
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
        System.out.println("Máquina apagada, primero actívame.");
    }

    /**
     * Pone a prepara dulces a la maquina.
     */
    @Override
    public boolean prepararDulce() {
        System.out.println("Máquina apagada, primero actívame.");
        return false;
    }

    /**
     * Reabastece los ingredientes de la máquina.
     */
    @Override
    public void reabastecerIngredientes() {
        System.out.println("Máquina apagada, primero actívame.");
    }

}
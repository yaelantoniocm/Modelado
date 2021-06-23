package src.estados;

import src.maquinas.Maquina;

/**
 * Clase para el estado Suspendida.
 */
public class Suspendida implements Estados {

    private Maquina maquina;

    /**
     * Constructor de la clase Suspendida.
     * @param  maquina nombre de la máquina.
     */
    public Suspendida(Maquina maquina) {
        this.maquina = maquina;
    }

    /**
     * Suspende la maquina.
     */
    @Override
    public void suspenderse() {
        System.out.println("Ya estoy suspendida.");
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
        System.out.println("Ya estoy activa.");
    }

    /**
     * Pone a empacar a la maquina.
     */
    @Override
    public void empacar() {
        System.out.println("Estoy suspendida, no puedo empacar.");
    }

    /**
     * Pone a prepara dulces a la maquina.
     */
    @Override
    public boolean prepararDulce() {
        System.out.println("Preparando lote de dulces...");
        this.maquina.asignarEstado(this.maquina.getEstadoPrepararDulces());
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
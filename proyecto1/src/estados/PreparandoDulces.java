package src.estados;

import src.maquinas.Maquina;

/**
 * Clase para el estado de preparar dulces.
 */
public class PreparandoDulces implements Estados {

    private Maquina maquina;

    /**
     * Constructor de la clase PreparandoDulces.
     * @param  maquina nombre de la máquina.
     */
    public PreparandoDulces(Maquina maquina) {
        this.maquina = maquina;
    }

    /**
     * Suspende la maquina.
     */
    @Override
    public void suspenderse() {
        System.out.println("No me puedo suspender, estoy preparando el lote.");
    }

    /**
     * Apaga la maquina.
     */
    @Override
    public void apagar() {
        System.out.println("No me puedo apagar, estoy preparando un lote.");
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
        System.out.println("Empacando lote...");
        this.maquina.asignarEstado(this.maquina.getEstadoEmpacando());
    }

    /**
     * Pone a prepara dulces a la maquina.
     */
    @Override
    public boolean prepararDulce() {
        System.out.println("Ya estoy preparando un lote. sé paciente.");
        return false;
    }

    /**
     * Reabastece los ingredientes de la máquina.
     */
    @Override
    public void reabastecerIngredientes() {
        System.out.println("No me puedes reabastecer, estoy preparando un lote.");
    }

}
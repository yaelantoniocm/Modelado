package src.maquinas;

import java.util.ArrayList;

import src.*;
import src.estados.*;

/**
 * Clase para generalizar las máquinas.
 * Hecha para el uso del patrón de diseño State.
 */
public class Maquina {

    private Estados apagada;
    private Estados empacando;
    private Estados encendida;
    private Estados preparandoDulces;
    private Estados suspendida;
    private Estados estadoActual;

    private static Dulces ososDulces = FabricaDulces.getMaquina("wonka3000", "OsitosDulces");
    private static Dulces gusanosAcidos = FabricaDulces.getMaquina("wonka3000", "GusanosAcidos");
    private static Dulces frutasChamoy = FabricaDulces.getMaquina("wonka3000", "FrutasConChamoy");
        
    private static Dulces chocolateAlmendras = FabricaDulces.getMaquina("wonka3000", "ChocolateConAlmendras");
    private static Dulces chocolateLeche = FabricaDulces.getMaquina("wonka3000", "ChocolateConLeche");
    private static Dulces chocolateOscuro = FabricaDulces.getMaquina("wonka3000", "ChocolateOscuro");

    private static Dulces galletasChispas = FabricaDulces.getMaquina("Galleneitor5000", "GalletasChispas");
    private static Dulces galletasMermelada = FabricaDulces.getMaquina("Galleneitor5000", "GalletasMermelada");
    private static Dulces galletasSaladas = FabricaDulces.getMaquina("Galleneitor5000", "GalletasSaladas");

    public Maquina() {
        this.apagada = new Apagada(this);
        this.empacando = new Empacando(this);
        this.encendida = new Encendida(this);
        this.preparandoDulces = new PreparandoDulces(this);
        this.suspendida = new Suspendida(this);
        this.estadoActual = this.suspendida;
    }

    /**
     * Asigna un nuevo estado.
     * @param nuevoEstado nuevo estado a asignar.
     */
    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Devuelve el estado actual de la máquina.
     */
    public String getEstado() {
        return estadoActual.getClass().getSimpleName();
    }

    /**
     * Devuelve el estado de apagar.
     * @return estado de apagada.
     */
    public Estados getEstadoApagada() {
        return apagada;
    }

    /**
     * Devuelve el estado de empacar.
     * @return estado de empacando.
     */
    public Estados getEstadoEmpacando() {
        return empacando;
    }

    /**
     * Devuelve el estado de encender
     * @return estado de encendida.
     */
    public Estados getEstadoEncendida() {
        return encendida;
    }

    /**
     * Devuelve el estado de preparando dulces.
     * @return estado de preparando dulces.
     */
    public Estados getEstadoPrepararDulces() {
        return preparandoDulces;
    }

    /**
     * Devuelve el estado de activarse.
     * @return estado de activarse.
     */
    public Estados getEstadoSuspendida() {
        return suspendida;
    }

    /**
     * Apagar la máquina.
     */
    public void apagar() {
        estadoActual.apagar();
    }

    /**
     * Poner a empacar la máquina.
     * @return ArrayList de los dulces.
     */
    public ArrayList<Dulces> empacar() {
        estadoActual.empacar();

        ArrayList<Dulces> dulces = new ArrayList<Dulces>();

        dulces.add(ososDulces);
        dulces.add(gusanosAcidos);
        dulces.add(frutasChamoy);

        dulces.add(chocolateAlmendras);
        dulces.add(chocolateLeche);
        dulces.add(chocolateOscuro);

        dulces.add(galletasChispas);
        dulces.add(galletasMermelada);
        dulces.add(galletasSaladas);

        this.estadoActual = this.suspendida;

        return dulces;
    }

    /**
     * Método para empacar un dulce en específico.
     * @param nombreDulce Dulce a empacar.
     */
    public void empacar(String nombreDulce) {
        System.out.println("Empacando " + nombreDulce);
        this.estadoActual = this.empacando;
        System.out.println("entregando dulce...");
        this.estadoActual = this.suspendida;
    }

    /**
     * Activar la máquina.
     */
    public void activar() {
        estadoActual.activar();
    }

    /**
     * Método para preparar dulces.
     * @return ArrayList de los dulces.
     */
    public ArrayList<Dulces> prepararDulces() {
        if (estadoActual.prepararDulce()) {
            ososDulces.prepararReceta();
            gusanosAcidos.prepararReceta();
            frutasChamoy.prepararReceta();

            chocolateAlmendras.prepararReceta();
            chocolateLeche.prepararReceta();
            chocolateOscuro.prepararReceta();

            galletasChispas.prepararReceta();
            galletasMermelada.prepararReceta();
            galletasSaladas.prepararReceta();

            return empacar();
        }

        return null;
    }

    /**
     * Método para preparar un dulce en específico.
     * @param nombreDulce Dulce a preparar.
     */
    public void prepararDulce(String nombreDulce) {
        if (estadoActual.prepararDulce()) {
            System.out.println("Preparando " + nombreDulce);
            empacar(nombreDulce);
        }
    }

    /**
     * Suspender la máquina.
     */
    public void suspender() {
        estadoActual.suspenderse();
    }

    /**
     * Reabastece los ingredientes de la máquina.
     */
    public void reabastecer() {
        estadoActual.reabastecerIngredientes();
    }

}
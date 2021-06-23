package src.usuarios;
import java.util.*;
import src.servicios.*;

/**
 * Clase de Usuarios.
 */
public class Usuario implements Sujeto {
    private String nombre;
    private double saldo;
    private ArrayList<String> serviciosContratadosNombres;
    private ArrayList<Servicio> serviciosContratados;
    private Hashtable<String, Contrato> contratosDeLosServicios;
    private boolean saldoSuficiente;

    /**
     * Constructor de la clase Usuarios.
     * @param nombre nombre del usuario.
     * @param saldo  saldo del usuario.
     */
    public Usuario(String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
        if (saldo > 0)
            this.saldoSuficiente = true;
        else
            this.saldoSuficiente = false;
        serviciosContratadosNombres = new ArrayList<String>();
        serviciosContratados = new ArrayList<Servicio>();
        contratosDeLosServicios = new Hashtable<String, Contrato>();
    }

    /**
     * Método que devuelve el nombre del usuario.
     * @return Devuelve el nombre del usuario.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método que consulta el saldo del usuario.
     * @return Saldo del usuario.
     */
    public double consultarSaldo() {
        return this.saldo;
    }

    /**
     * Método que consulta el nombre del usuario.
     * @return Nombre del usuario.
     */
    public String consultarNombre() {
        return this.nombre;
    }

    /**
     * Devuelve una lista de los servicios contratados.
     * @return lista de los servicios contratados.
     */
    public ArrayList<Servicio> getServiciosContratados() {
        return serviciosContratados;
    }

    /**
     * Pone un nuevo saldo al usuario.
     * @param saldoNuevo nuevo saldo a poner.
     */
    public void setSaldo(double saldoNuevo) {
        this.saldo = saldoNuevo;
        if (saldoNuevo > 0)
            this.saldoSuficiente = true;
        else
            this.saldoSuficiente = false;
        notificar(this.saldoSuficiente);
    }

    /**
     * Método que cambia el tipo de contrato.
     * @param servicio Servicio a cambiar contrato.
     * @param contrato Nuevo contrato.
     */
    public void cambiarContrato(Servicio servicio, Contrato contrato) {
        removerContrato(servicio);
        contratarServicio(servicio, contrato);
    }

    /**
     * Quita el contrato de un servicio.
     * @param nombreServicio Nombre del servicio.
     */
    public void removerContrato(Servicio servicio) {
        String nombreServicio = servicio.getNombre();
        this.contratosDeLosServicios.remove(nombreServicio);
        this.serviciosContratadosNombres.remove(nombreServicio);
        this.serviciosContratados.remove(servicio);
    }

    /**
     * Método para contratar servicios.
     * @param servicio Servicio a contratar.
     * @param contrato Contrato deseado.
     */
    public void contratarServicio(Servicio servicio, Contrato contrato) {
        String nombreServicio = servicio.getNombre();
        this.serviciosContratadosNombres.add(nombreServicio);
        this.serviciosContratados.add(servicio);
        this.contratosDeLosServicios.put(nombreServicio, contrato);
        System.out.println("Bienvenid@ " + this.nombre + " al servicio de " + 
                           nombreServicio + " para " + 
                           contrato.getContrato() + ".");
        notificar(true);
    }

    /**
     * Método que obtiene el contrato dado el nombre de un servicio.
     * @param  nombreServicio Nombre del servicio del cúal se busca el contrato.
     * @return                Contrato del servicio.
     */
    public Contrato getContrato(String nombreServicio) {
        return this.contratosDeLosServicios.get(nombreServicio);
    }

    /**
     * Método que notifica a todos los servicios contratados.
     * si el saldo es suficiente para seguir con la suscripción.
     * @param saldoSuficiente Indica si el saldo es suficiente para 
     *                        seguir con la suscripción o no.
     */
    @Override
    public void notificar(boolean saldoSuficiente) {
        for (Servicio s: this.serviciosContratados)
            s.actualizar(saldoSuficiente, this.nombre);
    }
}
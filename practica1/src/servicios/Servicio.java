package src.servicios;
import src.usuarios.Usuario;
import java.util.ArrayList;
import java.util.Random;

/**
 * Clase de los servicios.
 */
public class Servicio implements Observador {
    private String nombreServicio;
    private String usuario;
    private Random numeroAleatorio;
    private ArrayList<String> mensajes;
    private ICobrarEstrategia cobrarEstrategia;

    /**
     * Constructor de la clase Servicios.
     * @param  nombreServicio nombre del servicio.
     */
    public Servicio(String nombreServicio, ArrayList<String> mensajes) {
        this.nombreServicio = nombreServicio;
        this.mensajes = mensajes;
        this.cobrarEstrategia = new CobrarEstrategia();
        this.numeroAleatorio = new Random();
    }

    /**
     * Devuelve el nombre del servicio.
     * @return nombre del servicio.
     */
    public String getNombre() {
        return this.nombreServicio;
    }

    /**
     * Método que cobra al usuario dependiendo de su contrato.
     * @param usuario  Usuario al que se le va a realizar el cobro.
     */
    public void cobrar(Usuario usuario) {
        double saldoFinal = cobrarEstrategia.cobrar(usuario, nombreServicio);
        Contrato tipoDeContrato = usuario.getContrato(nombreServicio);

        if (saldoFinal > 0)
            System.out.println(usuario.getNombre() + ", se te ha cobrado la tarifa de " +
                               nombreServicio + " para " + 
                               tipoDeContrato.getContrato() + ". Total: $" + 
                               tipoDeContrato.getCosto() + ". Buen día.");
        else {
            saldoFinal = usuario.consultarSaldo();
            System.out.println("Saldo insuficiente, " + usuario.getNombre() +
                               " se ha cancelado tu contrato de " + nombreServicio + 
                               " para " + tipoDeContrato.getContrato() + ".");
            usuario.removerContrato(this);
        }

        usuario.setSaldo(saldoFinal);
    }

    /**
     * Manda un mensaje personalizado al usuario que ha sido efectuado su pago o suscripción.
     */
    public void mandarMensajes() {
        if (this.usuario != "") {
            System.out.println(this.usuario + generadorAleatorioDeMensajes());
            this.usuario = "";
        }
    }

    /**
     * Método que verifica si un usuario aún puede usar los servicios dependiendo de su saldo.
     * @param saldoSuficiente Indica si el usuario tiene saldo positivo.
     * @param nombre          Nombre del usuario.
     */
    @Override
    public void actualizar(boolean saldoSuficiente, String nombre) {
        if (saldoSuficiente)
            this.usuario = nombre;
        else
            this.usuario = "";
    }

    /**
     * Método que genera un mensaje aleatorio.
     * @return mensaje generado aleatoriamente.
     */
    private String generadorAleatorioDeMensajes() {
        return mensajes.get(numeroAleatorio.nextInt(5));
    }
}
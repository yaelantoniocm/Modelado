package src.servicios;
import src.usuarios.Usuario;

/**
 * Clase que encapsula el algoritmo de cobrar.
 */
public class CobrarEstrategia implements ICobrarEstrategia {

    /**
     * Método que cobra al usuario dependiendo de su contrato.
     * @param usuario  Usuario al que se le va a realizar el cobro.
     * @param nombreDelServicio Nombre del servicio.
     */
    @Override
    public double cobrar(Usuario usuario, String nombreDelServicio) {
        Contrato tipoDeContrato = usuario.getContrato(nombreDelServicio);
        double saldoFinal = usuario.consultarSaldo() - tipoDeContrato.getCosto();
        return saldoFinal;
    }
}
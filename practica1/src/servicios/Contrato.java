package src.servicios;

/**
 * Enumeración de tipos de contratos.
 */
public enum Contrato {
    UNDISPOSITIVO("un dispositivo", 7), DOSDISPOSITIVOS("dos dispositivos", 10), 
    CUATRODISPOSITIVOS("cuatro dispositivos", 15), GRATIS("usuario normal", 0), 
    AMAZONNORMAL("amazon normal", 7), AMAZONPREMIUM("amazon premium", 13),
    SPOTIFYPREMIUM("spotify premium", 4), YOUTUBEPREMIUM("youtube premium", 6);
    
    private String contrato;
    private int costo;

    /**
     * Constructor de Contratos.
     * @param  contrato nombre del contrato por contratar.
     * @param  costo    costo del contrato.
     */
    private Contrato(String contrato, int costo) {
        this.contrato = contrato;
        this.costo = costo;
    }

    /**
     * Devuelve el tipo de contrato.
     * @return Regresa el contrato.
     */
    public String getContrato() {
        return this.contrato;
    }

    /**
     * Devuelve el costo que tiene el contrato.
     * @return Regresa el costo que tiene el contrato.
     */
    public int getCosto() {
        return this.costo;
    }
}
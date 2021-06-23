package src;
import src.servicios.*;
import src.usuarios.Usuario;
import java.util.ArrayList;

/**
 * Clase que realiza la simulación.
 */
public class Simulacion {

    private static Servicio netflix;
    private static Servicio spotify;
    private static Servicio youtube;
    private static Servicio amazon;

    static Usuario alicia = new Usuario("Alicia", 500);
    static Usuario bob = new Usuario("Bob", 40);
    static Usuario cesar = new Usuario("César", 40);
    static Usuario diego = new Usuario("Diego", 80);
    static Usuario erika = new Usuario("Erika", 300);

    /**
     * Método que cobra al usuario con todos los servicios disponibles.
     * @param usuario usuario a cobrar.
     */
    public static void cobrarUsuario(Usuario usuario) {
        ArrayList<Servicio> servicios = usuario.getServiciosContratados();
        if (servicios.contains(netflix))
            netflix.cobrar(usuario);
        if (servicios.contains(spotify))
            spotify.cobrar(usuario);
        if (servicios.contains(youtube))
            youtube.cobrar(usuario);
        if (servicios.contains(amazon))
            amazon.cobrar(usuario);
        mandarMensajes(usuario);
    }

    /**
     * Método que manda mensajes personalizados.
     * @param usuario Usuario al cual se le van a mandar los mensajes.
     */
    public static void mandarMensajes(Usuario usuario) {
        ArrayList<Servicio> servicios = usuario.getServiciosContratados();
        if (servicios.contains(netflix))
            netflix.mandarMensajes();
        if (servicios.contains(spotify))
            spotify.mandarMensajes();
        if (servicios.contains(youtube))
            youtube.mandarMensajes();
        if (servicios.contains(amazon))
            amazon.mandarMensajes();
        System.out.println();
    }

    /**
     * Método que inicializa todos los servicios.
     */
    public static void construirServicios() {
        ArrayList<String> mensajesNetflix = new ArrayList<String>();
        mensajesNetflix.add(", te sugerimos que veas Star Wars episodio XIII.");
        mensajesNetflix.add(", te sugerimos que veas Pulp Fiction.");
        mensajesNetflix.add(", te sugerimos que veas One punch man.");
        mensajesNetflix.add(", te sugerimos que veas el nuevo documental de History Channel, 'la vida de Dave Mustaine'.");
        mensajesNetflix.add(", te sugerimos que veas la nueva temporada de Daredevil, sólo en Netflix.");
        mensajesNetflix.add(", te sugerimos que veas la nueva temporada de 'La casa de papel', sólo en Netflix.");

        netflix = new Servicio("Netflix", mensajesNetflix);

        ArrayList<String> mensajesSpotify = new ArrayList<String>();
        mensajesSpotify.add(", no te pierdas de la discografía completa de Arch Enemy, sólo en Spotify.");
        mensajesSpotify.add(", no te pierdas de la discografía completa de Slipknot, sólo en Spotify.");
        mensajesSpotify.add(", te sugerimos que escuches el nuevo solo de Jimi Hendrix.");
        mensajesSpotify.add(", muy pronto tendremos el albúm de Metallica, ¡no te lo pierdas!");
        mensajesSpotify.add(", te sugerimos que escuches la nueva canción de Megadeth, '1000 times goodbye'.");
        mensajesSpotify.add(", te sugerimos que escuches el nuevo albúm Slipknot, 'We Are Not Your Kind'.");
        mensajesSpotify.add(", te sugerimos que escuches el viejo albúm que rompió récords de Slipknot, 'Slipknot'.");

        spotify = new Servicio("Spotify", mensajesSpotify);

        ArrayList<String> mensajesYoutube = new ArrayList<String>();
        mensajesYoutube.add(", no te pierdas del streaming de tu YouTuber favorito.");
        mensajesYoutube.add(", te sugerimos que veas a PewDiePie.");
        mensajesYoutube.add(", Khan Academy acaba de subir un video.");
        mensajesYoutube.add(", te sugerimos que veas el canal de 3Blue1Brown.");
        mensajesYoutube.add(", te sugerimos que veas el nuevo teaser de la película Star Wars: Episodio IX");
        mensajesYoutube.add(", te sugerimos que veas a ElRichMC.");
        mensajesYoutube.add(", te sugerimos que veas el canal de Derivando.");

        youtube = new Servicio("YouTube", mensajesYoutube);

        ArrayList<String> mensajesAmazon = new ArrayList<String>();
        mensajesAmazon.add(", no te pierdas la serie 'Mr.Robot', sólo en Amazon.");
        mensajesAmazon.add(", un artículo de tu lista de deseos está en descuento.");
        mensajesAmazon.add(", aprovecha las ofertas que hay actualmente.");
        mensajesAmazon.add(", conoce a la familia 'echo'.");
        mensajesAmazon.add(", por $3 te llevas una sucripción de Twitch prime por 2 meses.");
        mensajesAmazon.add(", haz tu súper en Amazon.");
        mensajesAmazon.add(", disfruta de envíos rápidos.");

        amazon = new Servicio("Amazon", mensajesAmazon);
    }

    /**
     * Método que realiza la simulación.
     * @param []args
     */
    public static void main(String []args) {
        construirServicios();

        System.out.println("Día 1");
        System.out.println();

        alicia.contratarServicio(netflix, Contrato.CUATRODISPOSITIVOS);
        alicia.contratarServicio(spotify, Contrato.SPOTIFYPREMIUM);
        alicia.contratarServicio(youtube, Contrato.YOUTUBEPREMIUM);
        alicia.contratarServicio(amazon, Contrato.AMAZONPREMIUM);

        mandarMensajes(alicia);

        bob.contratarServicio(netflix, Contrato.CUATRODISPOSITIVOS);
        bob.contratarServicio(spotify, Contrato.SPOTIFYPREMIUM);
        bob.contratarServicio(youtube, Contrato.YOUTUBEPREMIUM);
        bob.contratarServicio(amazon, Contrato.AMAZONPREMIUM);

        mandarMensajes(bob);

        cesar.contratarServicio(spotify, Contrato.SPOTIFYPREMIUM);
        cesar.contratarServicio(youtube, Contrato.GRATIS);

        mandarMensajes(cesar);

        diego.contratarServicio(netflix, Contrato.DOSDISPOSITIVOS);
        diego.contratarServicio(amazon, Contrato.AMAZONPREMIUM);

        mandarMensajes(diego);

        erika.contratarServicio(netflix, Contrato.CUATRODISPOSITIVOS);
        erika.contratarServicio(spotify, Contrato.GRATIS);
        erika.contratarServicio(youtube, Contrato.GRATIS);

        mandarMensajes(erika);

        System.out.println();
        System.out.println("Día 2");
        System.out.println();

        cobrarUsuario(alicia);
        cobrarUsuario(bob);
        cobrarUsuario(diego);
        erika.cambiarContrato(spotify, Contrato.SPOTIFYPREMIUM);
        erika.cambiarContrato(youtube, Contrato.YOUTUBEPREMIUM);
        cobrarUsuario(erika);

        System.out.println();
        System.out.println("Día 3");
        System.out.println();

        cobrarUsuario(alicia);
        cobrarUsuario(bob);
        cobrarUsuario(diego);
        diego.contratarServicio(spotify, Contrato.GRATIS);
        erika.removerContrato(netflix);
        erika.cambiarContrato(amazon, Contrato.AMAZONPREMIUM);
        cobrarUsuario(erika);

        System.out.println();
        System.out.println("Día 4");
        System.out.println();

        cobrarUsuario(alicia);
        cobrarUsuario(bob);
        cobrarUsuario(diego);
        cobrarUsuario(erika);

        System.out.println();
        System.out.println("Día 5");
        System.out.println();

        cobrarUsuario(alicia);
        cobrarUsuario(bob);
        cobrarUsuario(diego);
        cobrarUsuario(erika);
    }
}
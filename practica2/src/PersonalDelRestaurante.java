package src;

import src.estados.*;
import src.comida.*;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Clase para el manejo del personal del restaurante.
 */
public class PersonalDelRestaurante {
    private Estados atender;
    private Estados cocinar;
    private Estados caminar;
    private Estados suspender;
    private Estados activarse;
    private Estados estadoActual;

    private Menu hamburguesas;
    private Menu hamburguesasGustoGerente;
    private Menu hamburguesasDeLujo;

    private ArrayList<Menu> menus;

    /**
     * Constructir de la clase PersonalDelRestaurante
     * @param  hamburguesas             menú de las hamburguesas.
     * @param  hamburguesasGustoGerente menú de las hamburguesas que dependen del gusto del gerente.
     * @param  hamburguesasDeLujo       menú de las hamburguesas de lujo.
     */
    public PersonalDelRestaurante(Menu hamburguesas, Menu hamburguesasGustoGerente, Menu hamburguesasDeLujo) {
        this.atender = new Atender(this);
        this.cocinar = new Cocinar(this);
        this.caminar = new Caminar(this);
        this.suspender = new Suspendido(this);
        this.activarse = new Activo(this);
        this.estadoActual = this.suspender;

        this.hamburguesas = hamburguesas;
        this.hamburguesasGustoGerente = hamburguesasGustoGerente;
        this.hamburguesasDeLujo = hamburguesasDeLujo;

        menus = new ArrayList<Menu>();

        menus.add(hamburguesas);
        menus.add(hamburguesasGustoGerente);
        menus.add(hamburguesasDeLujo);
    }

    /**
     * Método para hacer que el personal atienda.
     */
    public void atender() {
        estadoActual.atender();
    }

    /**
     * Método para hacer que el personal cocine.
     */
    public void cocinar(int id) {
        ItemMenu comidaSeleccionada = this.buscarComida(id);
        if (comidaSeleccionada == null){
            System.out.println("Introduzca un id válido.");
            this.estadoActual = activarse;
        } else {
            System.out.println("Ha seleccionado la siguiente comida: " + comidaSeleccionada.getNombre());
            estadoActual.cocinar();
            System.out.println("Poniendo pan");
            System.out.println("Poniendo mayonesa");
            System.out.println("Poniendo mostaza");
            if (!comidaSeleccionada.esVegatariana())
                System.out.println("Poniendo carne");
            if (!comidaSeleccionada.tieneQueso())
                System.out.println("Poniendo queso");
            System.out.println("Poniendo vegetales");
            System.out.println("Poniendo catsup");
            System.out.println("Poniendo pan");
            System.out.println("\nAquí está su " + comidaSeleccionada.getNombre() + ", " + "disfrutela.");

            this.estadoActual = this.suspender;
        }
    }

    /**
     * Método para hacder que el personal se suspenda.
     */
    public void suspender() {
        estadoActual.suspenderse();
    }

    /**
     * Método para hacer que el personal se active.
     */
    public void activar() {
        estadoActual.activarse();
    }

    /**
     * Método para hacer caminar a el personal.
     */
    public void caminar() {
        estadoActual.caminar();
    }

    /**
     * Devuelve el estado actual del personal.
     */
    public String getEstado() {
        return estadoActual.getClass().getSimpleName();
    }

    /**
     * Imprime el estado actual del personal.
     */
    public void imprimeEstado() {
        System.out.println("Estado del robot: " + 
                           estadoActual.getClass().getSimpleName());
    }

    /**
     * Asigna un nuevo estado.
     * @param nuevoEstado nuevo estado a asignar.
     */
    public void asignarEstado(Estados nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Devuelve el estado de atender.
     * @return estado de atender.
     */
    public Estados getEstadoAtender() {
        return atender;
    }

    /**
     * Devuelve el estado de cocinar.
     * @return estado de cocinar.
     */
    public Estados getEstadoCocinar() {
        return cocinar;
    }

    /**
     * Devuelve el estado de caminar
     * @return estado de caminar.
     */
    public Estados getEstadoCaminar() {
        return caminar;
    }

    /**
     * Devuelve el estado de suspender.
     * @return estado de suspender.
     */
    public Estados getEstadoSuspender() {
        return suspender;
    }

    /**
     * Devuelve el estado de activarse.
     * @return estado de activarse.
     */
    public Estados getEstadoActivarse() {
        return activarse;
    }

    /**
     * Imprime el menú.
     */
    public void imprimirMenu() {
        Iterator hamburguesasIterator = hamburguesas.crearIterador();
        Iterator hamburguesasGustoGerenteIterator = hamburguesasGustoGerente.crearIterador();
        Iterator hamburguesasDeLujoIterator = hamburguesasDeLujo.crearIterador();

        System.out.println("\n--- Hamburguesas ---" + "\n");
        imprimirItems(hamburguesasIterator);
        System.out.println("\n*** Hamburguesas de hoy ***\n");
        imprimirItems(hamburguesasGustoGerenteIterator);
        System.out.println("\n$$$ Hamburguesas de lujo $$$\n");
        imprimirItems(hamburguesasDeLujoIterator);
    }

    /**
     * Imprime los submenús dado un iterador.
     * @param iterator iterador para recorrer los submenús.
     */
    public void imprimirItems(Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu)iterator.next();
            System.out.println("Id: " + itemMenu.getId() + ": " + 
                               itemMenu.getNombre() + ", " +
                               itemMenu.getDescripcion());
        }
    }

    /**
     * Método que busca una comida dado su id.
     * @param  id id de la comida a buscar.
     * @return    comida encontrada.
     */
    public ItemMenu buscarComida(int id) {
        Iterator hamburguesasIterator = hamburguesas.crearIterador();
        Iterator hamburguesasGustoGerenteIterator = hamburguesasGustoGerente.crearIterador();
        Iterator hamburguesasDeLujoIterator = hamburguesasDeLujo.crearIterador();

        ItemMenu hamburguesaId = buscarComida(id, hamburguesasIterator);
        ItemMenu hamburguesaGerenteId = buscarComida(id, hamburguesasGustoGerenteIterator);
        ItemMenu hamburguesaLujoId = buscarComida(id, hamburguesasDeLujoIterator);

        if (hamburguesaId != null)
            return hamburguesaId;
        if (hamburguesaGerenteId != null)
            return hamburguesaGerenteId;
        if (hamburguesaLujoId != null)
            return hamburguesaLujoId;

        return null;
    }

    /**
     * Método que busca una comida dado su id.
     * @param  id       id de la comida a buscar.
     * @param  iterator iterador para recorrer los distintos menús.
     * @return          comida encontrada.
     */
    public ItemMenu buscarComida(int id, Iterator iterator) {
        while (iterator.hasNext()) {
            ItemMenu itemMenu = (ItemMenu)iterator.next();
            if (itemMenu.getId() == id)
                return itemMenu;
        }

        return null;
    }
}
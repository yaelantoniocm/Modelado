package src;

import java.util.Scanner;

import src.baguette.*;
import src.baguette.ingredientes.*;
import src.pizza.*;

/**
 * Clase que realiza la simulación.
 */
public class Simulacion {

    /**
     * Método para imprimir el ticket del baguette.
     * @param comida baguette a imprimir su ticket.
     */
    private static void imprimirTicket(Comida comida) {
        System.out.println("Precio total: " + comida.getPrecio()
                           + "; Ingredientes: " + comida.getIngredientes() + ".");
    }

    /**
     * Método para poner ingredientes al baguette.
     * @param  baguette Baguette a poner ingredientes.
     * @return          Baguette con ingredientes.
     */
    private static Comida ponerIngredientes(Comida baguette) {
        Scanner scanner = new Scanner(System.in);
        int contadorPollo = 0, contadorPepperoni = 0, contadorJamon = 0, contadorLechuga = 0, 
            contadorJitomate = 0, contadorCebolla = 0, contadorMostaza = 0, contadorCatsup = 0, 
            contadorMayonesa = 0;

        while(true) {
            System.out.println("Seleccione el número correspondiente al " +
                               "ingrediente deseado:");
            System.out.println("1.- Pollo");
            System.out.println("2.- Pepperoni");
            System.out.println("3.- Jamón");
            System.out.println("4.- Lechuga");
            System.out.println("5.- Jitomate");
            System.out.println("6.- Cebolla");
            System.out.println("7.- Mostaza");
            System.out.println("8.- Catsup");
            System.out.println("9.- Mayonesa");
            System.out.println("En caso de ya haber escogido sus ingredientes," + 
                               " presione el número 0.");

            try {
                int opcion = scanner.nextInt();
                if (opcion == 1) {
                    if (contadorPollo < 3) {
                        baguette = new ConPollo(baguette);
                        contadorPollo += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de pollo.");
                }
                if (opcion == 2){
                    if (contadorPepperoni < 3) {
                        baguette = new ConPepperoni(baguette);
                        contadorPepperoni += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de pepperoni.");
                }
                if (opcion == 3){
                    if (contadorJamon < 3) {
                        baguette = new ConJamon(baguette);
                        contadorJamon += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de jamón.");
                }
                if (opcion == 4){
                    if (contadorLechuga < 3) {
                        baguette = new ConLechuga(baguette);
                        contadorLechuga += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de lechuga.");                    
                }
                if (opcion == 5){
                    if (contadorJitomate < 3) {
                        baguette = new ConJitomate(baguette);
                        contadorJitomate += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de jitomate.");
                }
                if (opcion == 6){
                    if (contadorCebolla < 3) {
                        baguette = new ConCebolla(baguette);
                        contadorCebolla += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de cebolla.");
                }
                if (opcion == 7){
                    if (contadorMostaza < 3) {
                        baguette = new ConMostaza(baguette);
                        contadorMostaza += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de mostaza.");
                }
                if (opcion == 8){
                    if (contadorCatsup < 3) {
                        baguette = new ConCatsup(baguette);
                        contadorCatsup += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de catsup.");
                }
                if (opcion == 9){
                    if (contadorMayonesa < 3) {
                        baguette = new ConMayonesa(baguette);
                        contadorMayonesa += 1;
                    } else
                        System.out.println("Sólo puedes pedir un máximo de 3 piezas de mayonesa.");
                }
                if (opcion == 0)
                    break;
                if (opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && 
                    opcion != 5 && opcion != 6 && opcion != 7 && opcion != 8 && opcion != 9)
                    System.out.println("Introduzca un número válido.");
            } catch(Exception e) {
                System.out.println("¡Introduce solamente números!");

                return ponerIngredientes(baguette);
            }
        }

        return baguette;
    }

    /**
     * Método para escoger el pan para el baguette.
     * @return Tipo del pan del baguette.
     */
    private static Comida elegirPan() {
        Scanner scanner = new Scanner(System.in);
        Comida baguette;

        while(true) {
            System.out.println("Seleccione el número correspondiente al tipo de pan deseado:");
            System.out.println("1.- Pan de trigo.");
            System.out.println("2.- Pan germinado.");
            System.out.println("3.- Pan integral.");
            System.out.println("4.- Pan con ajo.");
            System.out.println("5.- Pan de centeno.");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        baguette = new PanDeTrigo();
                        return baguette;
                    case 2:
                        baguette = new PanGerminado();
                        return baguette;
                    case 3:
                        baguette = new PanIntegral();
                        return baguette;
                    case 4:
                        baguette = new PanConAjo();
                        return baguette;
                    case 5:
                        baguette = new PanDeCenteno();
                        return baguette;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return elegirPan();
            }
        }
    }

    /**
     * Método para que se pueda escoger una pizza.
     * @return Pizza escogida de la lista.
     */
    private static Pizza obtenerPizza() {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza;

        while(true) {
            System.out.println("Seleccione el número correspondiente a la pizza deseada:");
            System.out.println("1.- Pizza con queso chedar, jamón y masa delgada.       Precio: $71.6");
            System.out.println("2.- Pizza con queso manchego, salchicha y masa gruesa.  Precio: $73.3");
            System.out.println("3.- Pizza con queso chedar, pollo y masa gruesa.        Precio: $84.6");
            System.out.println("4.- Pizza con queso manchego, jamón y masa gruesa.      Precio: $78.6");
            System.out.println("5.- Pizza con queso manchego, pollo y masa delgada.     Precio: $87.5");

            try {
                switch(scanner.nextInt()) {
                    case 1:
                        pizza = new Pizza1();
                        return pizza;
                    case 2:
                        pizza = new Pizza2();
                        return pizza;
                    case 3:
                        pizza = new Pizza3();
                        return pizza;
                    case 4:
                        pizza = new Pizza4();
                        return pizza;
                    case 5:
                        pizza = new Pizza5();
                        return pizza;
                    default:
                        System.out.println("Seleccione un número válido.");
                }
            } catch(Exception e) {
                System.out.println("Introduce solamente números.");

                return obtenerPizza();
            }
        }
    }

    /**
     * Método que realiza la simulación.
     * @param []args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué comida desea que se prepare? Seleccione la opción que desea usando el número correspondiente.");
        System.out.println("1.- Baguette");
        System.out.println("2.- Pizza");

        try {
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                Comida baguette = elegirPan();
                baguette = ponerIngredientes(baguette);
                imprimirTicket(baguette);
            } else if (opcion == 2) {
                Pizza pizza = obtenerPizza();
                Comida pizzaAdaptada = new AdaptadorPizza(pizza);
                imprimirTicket(pizzaAdaptada);
            } else {
                System.out.println("Seleccione una opción válida.");
                main(args);
            }
        } catch(Exception e) {
            System.out.println("Introducir únicamente números.");
            main(args);
        }
    }
}
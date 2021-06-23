package src;

import src.comida.*;
import src.estados.*;
import java.util.Scanner;
import java.util.NoSuchElementException;

/**
 * Clase para hacer la simulación del programa.
 */
public class Simulacion {
    private static Hamburguesas hamburguesas = new Hamburguesas();
    private static HamburguesasAlGustoDelGerente hamburguesasGerencia = new HamburguesasAlGustoDelGerente();
    private static HamburguesasEspeciales hamburguesasDeLujo = new HamburguesasEspeciales();

    private static PersonalDelRestaurante robot = new PersonalDelRestaurante(hamburguesas, hamburguesasGerencia, hamburguesasDeLujo);
    
    public static void main(String []args) {
        boolean seguir = true;

        while(seguir) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("\n-+-+ Bienvenido al restaurante McBurguesas +-+-");
            System.out.println("º El estado actual del robot es: " + robot.getEstado() + ". º");
            System.out.println("\n¿Qué desea hacer?\n");
            System.out.println("Opción 1: Activar al robot.");
            System.out.println("Opción 2: Suspender al robot.");
            System.out.println("Opción 3: Solicitar que el robot te tome la orden.");
            System.out.println("Opción 4: Poner a cocinar al robot.");
            System.out.println("Opción 5: Poner a caminar al robot.");
            System.out.println("Opción 6: Salir");

            try {
                int opcion = entrada.nextInt();
                
                if (opcion == 1)
                    robot.activar();
                else if (opcion == 2)
                    robot.suspender();
                else if (opcion == 3)
                    robot.atender();
                else if (opcion == 4)
                    System.out.println("¡Primero dime qué comida quieres!");
                else if (opcion == 5)
                    robot.caminar();
                else if (opcion == 6) {
                    System.out.println("¡Esperamos que vuelvas pronto!");
                    seguir = false;
                } else {
                    System.out.println("\n¡Introduce un número válido!\n");
                }
            } catch(NoSuchElementException nsee) {
                System.out.println("\n¡Introduce un número!\n");
            }
        }
    }
}
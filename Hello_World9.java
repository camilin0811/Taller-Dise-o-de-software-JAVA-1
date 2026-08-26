// como noveno ejercicio vamos a crear un programa que nos imprima en pantalla una cara feliz en ASCII sin usar el método main, usando un bloque estático.

/*
 * Este programa imprime una cara feliz en ASCII
 * sin usar el método main, usando un bloque estático.
 */
public class Hello_World9 {

    // Bloque estático: se ejecuta al cargar la clase
    static {
        System.out.println("  *******  ");
        System.out.println(" *       * ");
        System.out.println("*  O   O  *");
        System.out.println("*    ^    *");
        System.out.println("*  \\___/  *");
        System.out.println(" *       * ");
        System.out.println("  *******  ");

        // Termina el programa antes de que la JVM busque main
        System.exit(0);
    }
}
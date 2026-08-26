// como sexto ejercicio.

/*1. System.out — salida estándar

System.out.println("Esto es un mensaje normal");
Se usa para la salida normal del programa.

2. System.err — salida de error

System.err.println("Esto es un mensaje de error");
Se usa para mostrar errores o advertencias. En la consola se ve igual, pero internamente es un flujo separado (por eso los IDEs suelen mostrarlo en rojo), y permite redirigir errores por separado de la salida normal.

3. System.in — entrada estándar

No tiene println() porque no es de salida, sino de entrada (sirve para leer datos del teclado, normalmente con Scanner):
Scanner sc = new Scanner(System.in);

Ejemplo comparando out y err:*/

public class Hello_World6 {

    public static void main(String[] args) {

        // Salida normal
        System.out.println("Edad: 24 años");

        // Salida de error (por ejemplo, si un dato fuera inválido)
        System.err.println("Esto es un mensaje de error");
    }
}  
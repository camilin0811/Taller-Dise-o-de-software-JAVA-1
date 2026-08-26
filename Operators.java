public class Operators {
    public static void main(String[] args) {

        // 1. crea una variable con el resultado de cada operacion aritmetica
        int suma = 5 + 3;
        int resta = 5 - 3;
        int multiplicacion = 5 * 3;
        int division = 5 / 3;
        int modulo = 5 % 3;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        // 2. crea una variable para cada tipo de operacion de asignacion
        int asignacion = 10;          // =
        asignacion += 5;              // suma y asigna -> 15
        int sumaAsig = asignacion;

        asignacion -= 3;              // resta y asigna -> 12
        int restaAsig = asignacion;

        asignacion *= 2;              // multiplica y asigna -> 24
        int multAsig = asignacion;

        asignacion /= 4;              // divide y asigna -> 6
        int divAsig = asignacion;

        asignacion %= 4;              // modulo y asigna -> 2
        int modAsig = asignacion;

        System.out.println("\n--- Operadores de asignacion ---");
        System.out.println("+=: " + sumaAsig);
        System.out.println("-=: " + restaAsig);
        System.out.println("*=: " + multAsig);
        System.out.println("/=: " + divAsig);
        System.out.println("%=: " + modAsig);

        // 3. imprime 3 comparaciones verdaderas con diferentes operadores de comparacion
        int numA = 5;
        int numB = 5;

        System.out.println("\n--- Comparaciones verdaderas ---");
        System.out.println("5 > 3: " + (5 > 3));
        System.out.println("numA == numB: " + (numA == numB));
        System.out.println("3 <= 5: " + (3 <= 5));

        // 4. imprime 3 comparaciones falsas con diferentes operadores de comparacion
        System.out.println("\n--- Comparaciones falsas ---");
        System.out.println("5 < 3: " + (5 < 3));
        System.out.println("numA != numB: " + (numA != numB));
        System.out.println("5 >= 10: " + (5 >= 10));

        // 5. utiliza el operador logico de and (&&) y or (||)
        boolean esMayorDeEdad = true;
        boolean tienePermiso = false;

        System.out.println("\n--- Operadores logicos ---");
        System.out.println("AND (&&): " + (esMayorDeEdad && tienePermiso));
        System.out.println("OR (||): " + (esMayorDeEdad || tienePermiso));

        // 6. combina ambos comparadores logicos
        int edad = 20;
        boolean tieneCarnet = true;
        boolean puedeConducir = (edad >= 18 && tieneCarnet) || edad >= 25;
        System.out.println("\n--- Combinacion de AND y OR ---");
        System.out.println("Puede conducir: " + puedeConducir);

        // 7. anade alguna negacion (!)
        boolean estaLloviendo = false;
        System.out.println("\n--- Negacion ---");
        System.out.println("No esta lloviendo: " + (!estaLloviendo));
        System.out.println("No puede conducir: " + (!puedeConducir));
    }
}

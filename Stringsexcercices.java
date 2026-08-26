public class Stringsexcercices {
    public static void main(String[] args) {

        // 1. concatena dos cadenas de texto
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("1. Concatenacion: " + nombreCompleto);

        // 2. muestra la longitud de una cadena de texto
        int longitud = nombreCompleto.length();
        System.out.println("2. Longitud: " + longitud);

        // 3. muestra el primer y ultimo caracter de un string
        char primerCaracter = nombreCompleto.charAt(0);
        char ultimoCaracter = nombreCompleto.charAt(nombreCompleto.length() - 1);
        System.out.println("3. Primer caracter: " + primerCaracter);
        System.out.println("3. Ultimo caracter: " + ultimoCaracter);

        // 4. convierte a mayusculas y minusculas un string
        String enMayusculas = nombreCompleto.toUpperCase();
        String enMinusculas = nombreCompleto.toLowerCase();
        System.out.println("4. Mayusculas: " + enMayusculas);
        System.out.println("4. Minusculas: " + enMinusculas);

        // 5. comprueba si una cadena de texto contiene una palabra concreta
        boolean contienePalabra = nombreCompleto.contains("Perez");
        System.out.println("5. Contiene 'Perez': " + contienePalabra);

        // 6. formatea un string con un entero
        int edad = 25;
        String textoFormateado = String.format("%s tiene %d anios", nombreCompleto, edad);
        System.out.println("6. Formateado: " + textoFormateado);

        // 7. elimina los espacios en blanco al principio y al final del string
        String conEspacios = "   Hola Mundo   ";
        String sinEspacios = conEspacios.trim();
        System.out.println("7. Sin espacios (trim): [" + sinEspacios + "]");

        // 8. sustituye todos los espacios en blanco de un string
        String textoConEspacios = "Este es un texto con espacios";
        String textoSinEspacios = textoConEspacios.replace(" ", "_");
        System.out.println("8. Espacios sustituidos: " + textoSinEspacios);

        // 9. comprueba si dos strings son iguales
        String textoA = "Java";
        String textoB = "Java";
        String textoC = "java";
        boolean sonIguales = textoA.equals(textoB);
        boolean sonIgualesIgnorandoMayus = textoA.equalsIgnoreCase(textoC);
        System.out.println("9. '" + textoA + "' es igual a '" + textoB + "': " + sonIguales);
        System.out.println("9. '" + textoA + "' es igual a '" + textoC + "' (ignorando mayus): " + sonIgualesIgnorandoMayus);
    }
}

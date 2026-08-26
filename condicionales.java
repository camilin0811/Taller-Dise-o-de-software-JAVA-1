public class condicionales {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // 1. establece la edad de un usuario y muestra si puede votar (mayor o igual a 18)
    static void ejercicio1() {
        int edad = 20;
        System.out.println("--- Ejercicio 1: Voto ---");
        if (edad >= 18) {
            System.out.println("Tiene " + edad + " anios, puede votar.");
        } else {
            System.out.println("Tiene " + edad + " anios, no puede votar.");
        }
    }

    // 2. declara dos numeros y muestra cual es mayor o si son iguales
    static void ejercicio2() {
        int numero1 = 15;
        int numero2 = 20;
        System.out.println("--- Ejercicio 2: Comparar numeros ---");
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }

    // 3. declara un numero, verifica si es positivo, negativo o cero
    static void ejercicio3() {
        int numero = -5;
        System.out.println("--- Ejercicio 3: Positivo, negativo o cero ---");
        if (numero > 0) {
            System.out.println(numero + " es positivo");
        } else if (numero < 0) {
            System.out.println(numero + " es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }

    // 4. determina si un numero es par o impar
    static void ejercicio4() {
        int numero = 7;
        System.out.println("--- Ejercicio 4: Par o impar ---");
        if (numero % 2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
    }

    // 5. verifica si un numero esta en el rango de 1 a 100
    static void ejercicio5() {
        int numero = 50;
        System.out.println("--- Ejercicio 5: Rango 1-100 ---");
        if (numero >= 1 && numero <= 100) {
            System.out.println(numero + " esta dentro del rango de 1 a 100");
        } else {
            System.out.println(numero + " esta fuera del rango de 1 a 100");
        }
    }

    // 6. declara una variable con el dia de la semana (1-7) y muestra su nombre con switch
    static void ejercicio6() {
        int dia = 3;
        System.out.println("--- Ejercicio 6: Dia de la semana ---");
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }

    // 7. simula un sistema de notas: sobresaliente, aprobado, suspenso segun la nota (0-100)
    static void ejercicio7() {
        int nota = 85;
        System.out.println("--- Ejercicio 7: Sistema de notas ---");
        if (nota >= 90) {
            System.out.println("Nota " + nota + ": Sobresaliente");
        } else if (nota >= 60) {
            System.out.println("Nota " + nota + ": Aprobado");
        } else {
            System.out.println("Nota " + nota + ": Suspenso");
        }
    }

    // 8. determina si puedes entrar al cine: al menos 15 anios o ir acompanado
    static void ejercicio8() {
        int edad = 12;
        boolean vaAcompanado = true;
        System.out.println("--- Ejercicio 8: Entrada al cine ---");
        if (edad >= 15 || vaAcompanado) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("No puede entrar al cine");
        }
    }

    // 9. determina si una letra es vocal o consonante (char)
    static void ejercicio9() {
        char letra = 'e';
        System.out.println("--- Ejercicio 9: Vocal o consonante ---");
        char letraMinuscula = Character.toLowerCase(letra);
        if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i'
                || letraMinuscula == 'o' || letraMinuscula == 'u') {
            System.out.println(letra + " es una vocal");
        } else {
            System.out.println(letra + " es una consonante");
        }
    }

    // 10. usa 3 variables a, b, c y muestra cual es el mayor de las 3
    static void ejercicio10() {
        int a = 8;
        int b = 15;
        int c = 12;
        System.out.println("--- Ejercicio 10: Mayor de 3 numeros ---");
        int mayor;
        if (a >= b && a >= c) {
            mayor = a;
        } else if (b >= a && b >= c) {
            mayor = b;
        } else {
            mayor = c;
        }
        System.out.println("El mayor de " + a + ", " + b + " y " + c + " es " + mayor);
    }
}

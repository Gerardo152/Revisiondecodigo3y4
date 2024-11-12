package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
        
        // Crear el objeto Scanner para leer la entrada
        // Anteriormente el Scanner estaba fuera del método, lo cual no es correcto.
        Scanner s = new Scanner(System.in);
        
        // Turno del jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine().toLowerCase();  // Convertir a minúsculas para evitar problemas con mayúsculas y minúsculas
        
        // Turno del jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine().toLowerCase();  // Convertir a minúsculas
        
        // Comparar las jugadas
        // El problema original: Se usaba "==" para comparar cadenas, lo cual no funciona correctamente en Java.
        // Se debe usar .equals() para comparar el contenido de las cadenas, no sus referencias.
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;  // Asumimos que el jugador 2 gana inicialmente
            switch(j1) {
                case "piedra":
                    // El problema original: Se usaba "==" para comparar cadenas. También faltaba el "break" después de cada caso.
                    if (j2.equals("tijeras")) {
                        g = 1;  // El jugador 1 gana
                    }
                    break;  // Añadir break para evitar que el código siga ejecutando casos innecesarios
                
                case "papel":
                    if (j2.equals("piedra")) {
                        g = 1;  // El jugador 1 gana
                    }
                    break;  // Añadir break para evitar que el código siga ejecutando casos innecesarios
                
                case "tijeras":
                    if (j2.equals("papel")) {
                        g = 1;  // El jugador 1 gana
                    }
                    break;  // Añadir break para evitar que el código siga ejecutando casos innecesarios
                
                // El problema original: Faltaba un caso para manejar entradas inválidas, o no hacer nada si se ingresaba algo fuera de "piedra", "papel" o "tijeras".
                default:
                    System.out.println("Entrada no válida.");
                    return; // Salir del programa si la entrada es inválida
            }
            System.out.println("Gana el jugador " + g);
        }
        
        // Cerrar el scanner para liberar recursos
        // El problema original: No se cerraba el Scanner al final del programa, lo que puede generar fugas de recursos.
        s.close();
    }
}

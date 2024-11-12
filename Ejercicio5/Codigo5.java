package com.bakgen.exceptions;

import java.util.Scanner;  // Se importa la libreria

public class Codigo5 {
//Creamos el metodo main
	
	public static void main (String [] args) { 
    Scanner s = new Scanner(System.in); // Seagrego el obejto scanner
    System.out.println("Introduzca un número: "); // Agrregamos comillas
   int ni = s.nextInt();    // Cambiamos el tipo de variable de Strign a int
    int c = ni;   
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      }  // Cambiamos la llave que cierra para que se cierre el bucle
	  ni /= 10;
    
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");
    } else {
      System.out.println("El " + c + " no es un número afortunado."); //Agregamos una t
    }
    
  }
    s.close(); 
}
	
}

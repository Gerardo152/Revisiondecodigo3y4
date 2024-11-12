
import java.util.Scanner;

public class Codigo6 {

public  static void main(String[] args) {// encapsulamos el programa en un metodo main
 Scanner scanner = new Scanner(System.in);
   int[] n = new int[20]; // corregimos la declaracion del array

   for (int i = 0; i < 20; i++) {  //agregamos un simbolo + para declarar el incremento de i
     n[i] = (int)(Math.random() * 381) + 20;
     System.out.print(n[i] + " "); //se agrego .out al metodo de salida
   }
   
   System.out.println("\n¿Qué números quiere resaltar? ");// faltaba una n para el salto de linea
   System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
   int opcion = scanner.nextInt(); // faltaba un parentesis de cierre
int multiplo = (opcion == 1) ? 5:  7; // se corrigió la sintaxis del operador ternario

	    for  (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      }else {  								// se cerr+o el bloque if
	        System.out.print(e + " ");				//se cambió System.in por system.out
	      }
	    }scanner.close();
	    }
	  

	}
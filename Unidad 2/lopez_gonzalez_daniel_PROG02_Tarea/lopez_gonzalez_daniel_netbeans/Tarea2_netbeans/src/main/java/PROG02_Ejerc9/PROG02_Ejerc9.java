package PROG02_Ejerc9;

import java.util.Scanner;

public class PROG02_Ejerc9 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduce un número entero positivo: "); //solicitamos un numero entero positivo
     int n = sc.nextInt(); //almacenamos el numero en n
     
     if (n <= 0) { //comprobamos que el numero es positivo
     System.out.println("El número entero tiene que ser positivo");
     
     }
     
     /*utilizamos un bucle for en el que inicializamos en base al numero introducido,
     el bucle debe continuar mientras el número sea mayor o igual a cero
     y realizamos un decremento de -2*/
     
     for (int i = n; i >= 0; i = i - 2) { 
         System.out.println("Vuelta: " + i);

     }  
   }
}

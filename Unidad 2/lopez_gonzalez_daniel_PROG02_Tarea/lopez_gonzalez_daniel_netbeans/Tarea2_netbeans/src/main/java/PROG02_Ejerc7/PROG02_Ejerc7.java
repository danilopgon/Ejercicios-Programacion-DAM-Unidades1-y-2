package PROG02_Ejerc7;

import java.util.Scanner;


public class PROG02_Ejerc7 {
    public static void main(String[] args) {
      /*declaramos la variable para almacenar el año*/
      int bisiesto;
      /*pedimos un año al usuario*/
      Scanner sc = new Scanner(System.in);
      System.out.println("Introduce un año para comprobar si es bisiesto: ");
      bisiesto = sc.nextInt();
      
        if (bisiesto % 4 == 0 && bisiesto % 100 != 0) { //comprobamos si el año es bisiesto
            System.out.println("El año " + bisiesto + " es bisiesto.");
        } else if (bisiesto % 4 == 0 && bisiesto % 100 == 0 && bisiesto % 400 != 0) { //comprobamos si el año es divisible entre 4 y 100
            System.out.println("El año " + bisiesto + " no es bisiesto.");
        } else if (bisiesto % 4 == 0 && bisiesto % 100 == 0 && bisiesto % 400 == 0) { //comprobamos las excepciones a la regla anterior: si un número es divisible entre 100 y 400 es bisiesto
            System.out.println("El año " + bisiesto + " es bisiesto.");
        } else if (bisiesto % 4 != 0){ //comprobamos si el año no es bisiesto
            System.out.println("El año " + bisiesto + " no es bisiesto.");
        
        }
          
    }
   
}

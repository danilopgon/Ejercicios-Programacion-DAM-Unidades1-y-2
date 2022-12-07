package PROG02_Ejerc5;

import java.util.Scanner;

public class PROG02_Ejerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        /*declaramos los coeficientes para a, b, c, las soluciones y el discriminante*/
        double a, b, c, x1, x2, dis;
        //Pedimos los coeficientes
        System.out.println("Introduce (a)");
        a = sc.nextDouble();
        System.out.println("Introduce (b)");
        b = sc.nextDouble();
        System.out.println("Introduce (c)");
        c = sc.nextDouble();
        //calculamos el discriminante mediante b^2 - 4ac
        dis = (Math.pow(b, 2) - 4 * a * c);
        //en función del resultado podemos adivinar el número de soluciones y resolver
        if (dis < 0) { //si el discriminante es menor a 0 no tiene soluciones reales
            System.out.println("No hay soluciones reales");
            
        } else if (dis == 0){ //el discriminante es igual a cero y tiene una única solución
            x1 = (-b + Math.sqrt(dis)) / (2*a);
            System.out.println("La solución es: " + x1);
            
        } else if (dis > 0){ // el discriminante es positivo, tenemos dos soluciones
            x1 = (-b + Math.sqrt(dis)) / (2*a);
            x2 = (-b - Math.sqrt(dis)) / (2*a);
            System.out.println("Solución 1: " + x1);
            System.out.println("Solución 2: " + x2);
               
        }            
    }
}

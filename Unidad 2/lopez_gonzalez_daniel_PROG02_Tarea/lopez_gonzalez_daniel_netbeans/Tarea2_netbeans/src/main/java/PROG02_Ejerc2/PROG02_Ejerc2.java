package PROG02_Ejerc2;

import java.util.Scanner;


public class PROG02_Ejerc2 {
    public static void main(String[] args) {
        int edad; //declaramos la variable donde almacenaremos la edad
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe tu edad: "); // pedimos al usuario que indique su edad
        edad = sc.nextInt(); // almacenamos el dato en la variable
        //utilizaremos una anidación de condicionales para comprobar la edad de manera excluyente
        if (edad > 18) { // comprobamos si el valor introducido es mayor a 18
            System.out.println("Eres un adulto."); //dentro de cada una de las llaves escribimos el respectivo mensaje a imprimir
        } else if (edad >= 13 && edad <= 18){ // comprobamos si el valor es igual o mayor a 13 e igual o menor a 18
           System.out.println("Eres un adolescente."); 
        } else if (edad >= 5 && edad <= 12) { // comprobamos si el valor es igual o mayor a 5 e igual o menor a 12
            System.out.println("Eres un niño.");
        } else if (edad >= 0 && edad <= 4) { // comprobamos si el valor es igual o mayor a 0 e igual o menor a 4
            System.out.println("Eres un bebe, ¿qué hace un bebe usando un ordenador?");
        } 
        
    }
}

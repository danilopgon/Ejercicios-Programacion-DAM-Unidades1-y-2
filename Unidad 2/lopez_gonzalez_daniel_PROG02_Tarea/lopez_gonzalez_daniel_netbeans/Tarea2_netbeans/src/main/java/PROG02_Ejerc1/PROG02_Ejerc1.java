package PROG02_Ejerc1;

import java.util.Scanner;


public class PROG02_Ejerc1 {
     public static void main(String[] args) {
     /* declaramos las variables donde guardaremos los kilometros recorridos 
     y la cantidad de litros gastados*/
     double kilometros, litros;
     System.out.println("Escriba la cantidad de kilometros recorridos: "); // solicitamos al usuario el número de km
     Scanner sc =  new Scanner (System.in); //creamos un nuevo scanner
     kilometros = sc.nextInt(); //asignamos a kilometros el valor introducido
     System.out.println("Escriba la cantidad de litros consumidos: "); // solicitamos al usuario los litros gastados
     litros = sc.nextInt(); //asignamos a litros el valor introducido
     double consumo  = litros / kilometros; //realizamos el calculo, dividiendo litros entre kilometros
     System.out.println("El consumo de combustible por kilometro es: " + consumo); // mostramos el resultado
     
       
    }
}

package PROG02_Ejerc3;

import java.util.Scanner;

public class PROG02_Ejerc3 {
    public static void main(String[] args) {
        int milisegundos, minutos, horas, dias; //declaramos las variables donde almacenaremos los datos
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba una cantidad de milisegundos"); //pedimos al usuario que escriba la cantidad
        milisegundos = sc.nextInt();
        /*realizamos las conversiones de tiempo*/
        minutos = milisegundos/60000;
        horas = minutos/60;
        dias = horas/24; 
        /*imprimimos los resultados*/
        System.out.println("La cantidad de milisegundos contiene " + minutos + " minutos.");
        System.out.println(horas + " horas.");
        System.out.println("Y son " + dias + " días");
    }

}

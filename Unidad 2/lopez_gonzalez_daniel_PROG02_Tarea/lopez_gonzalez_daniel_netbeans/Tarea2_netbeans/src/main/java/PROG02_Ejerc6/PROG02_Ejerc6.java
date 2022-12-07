package PROG02_Ejerc6;

import java.text.DecimalFormat;
import java.util.Scanner;


public class PROG02_Ejerc6 {
    public static void main(String[] args) {
    /*declaramos las variables para almacenar los alumnos matriculados*/
    int alumProg, alumEnt, alumBases;  
    
    /*recogemos el numero de alumnos por pantalla*/
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce el número de alumnos matriculados en Programación: ");
    alumProg = sc.nextInt();
    System.out.println("Introduce el número de alumnos matriculados en Entornos de Desarrollo: ");
    alumEnt = sc.nextInt();
    System.out.println("Introduce el número de alumnos matriculados en Bases de Datos: ");
    alumBases = sc.nextInt();
    /*sumamos el total de los alumnos*/
    double total = alumProg + alumEnt + alumBases;
    
    /*calculamos el porcentaje de alumnos matriculados en cada uno de los modulos*/
    double porcenProg = alumProg*100/total;
    double porcenEnt = alumEnt*100/total;
    double porcenBases = alumBases*100/total;
    
    /*mostramos el porcentaje de alumnos matriculados*/
    DecimalFormat decimales = new DecimalFormat("0.0"); //especificamos que queremos usar un decimal
    System.out.println("Numero de alumnos de Entornos: " + alumEnt + " porcentaje: " + decimales.format(porcenEnt)+ "%");
    System.out.println("Numero de alumnos de Programación: " + alumProg + " porcentaje: " + decimales.format(porcenProg) + "%");
    System.out.println("Numero de alumnos de Bases de Datos: " + alumBases + " porcentaje: " + decimales.format(porcenBases) + "%");
    }
}
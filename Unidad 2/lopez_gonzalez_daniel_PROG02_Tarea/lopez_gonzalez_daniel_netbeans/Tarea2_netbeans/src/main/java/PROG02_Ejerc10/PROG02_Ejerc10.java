package PROG02_Ejerc10;

public class PROG02_Ejerc10 {
    public static void main(String[] args) {
       for (int tablaMul = 1; tablaMul <= 10; tablaMul++){ //utilizamos el loop externo para pasar por cada una de las tablas
           System.out.println("Tabla de multiplicar para el " + tablaMul); //imprimimos la tabla en la que estamos actualmente
           for (int i = 1; i <= 10; i++) { //utilizamos el loop interno para realizar todas las multiplicaciones de cada tabla
            System.out.println(tablaMul + " X " + i + " = " + tablaMul * i); //calculamos e imprimimos cada una de las multiplicaciones
           }     
       }
    }
}

package PROG02_Ejerc4;



public class PROG02_Ejerc4 {
    enum RazasPerro{ //creamos un tipo enumerado y escribimos las razas como constantes
    
        MASTIN, TERRIER, BULLDOG, PEKINES, CANICHE, GALGO;
    }
    public static void main(String[] args) {
        //creamos una variable de tiempo enum y les asignamos un valor
        RazasPerro var1 = RazasPerro.CANICHE;
        RazasPerro var2 = RazasPerro.TERRIER;
        //comparamos ambas variables
        boolean comparativa = var1 == var2;
        //imprimimos el resultado de la comparativa
        System.out.println("El resultado de la comparativa es " + comparativa);
        //comprobamos que posicion ocupa un valor en el enumerado
        System.out.println("El caniche ocupa la posición en enum " + var1.ordinal());
        System.out.println("El terrier ocupa la posición en enum " + var2.ordinal());
        //mostramos la cantidad de valores que contiene enum
        System.out.println("El enum contiene " + (RazasPerro.values().length) + " razas de perro.");  
        
    }
    
}

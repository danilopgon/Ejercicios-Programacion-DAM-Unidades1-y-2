package PROG02_Ejerc8;

public class PROG02_Ejerc8 {
    public static void main(String[] args) {
        float x = (float) 4.5;
        float y = (float) 3.0;
        int i = 2;
        System.out.println("------- Conversiones entre enteros y coma flotante -------");
        int j = (int) (i*x); // convertimos de manera explicita a int con cast
        System.out.println("Producto de int por float: j= i*x = " + j);
        double dx = 2.0;
        double dz = dx*y;
        System.out.println("Producto de float por double: dz=dx * y = " + dz);
        System.out.println("------- Operaciones con byte --------");
        byte bx = 5;
        byte by = 2;
        byte bz = (byte) (bx - by);
        System.out.println("byte: " + bx + " - " + by + " = " + bz);
        bx = -128; //al hacer este calculo sobrepasamos el rango de byte
        by = 1;
        bz = (byte) (bx - by); // convertimos de manera explicita a byte con cast
        System.out.println("byte" + bx + " - " + by + " = " + bz);
        int conversion = (bx - by); //tenemos que usar una variable intermedia int para poder convertir desde byte
        System.out.println("(int)(" + bx + " - "  + by +  ") = " + conversion);
        System.out.println("------- Operaciones con short -------");
        short sx = 5;
        short sy = 2;
        short sz = (short) (sx - sy);
        System.out.println("short: " + sx + " - " + sy + " = " + sz);
        sx = 32767;
        sy = 1;
        sz = (short) (sx + sy);
        System.out.println("short: " + sx + " - " + sy + " = " + sz);
        System.out.println("------ Operaciones con char -------");
        char cx = '\u000F';
        char cy = '\u0001';
        int z = (char) (cx - cy);
        System.out.println("char: " + cx + " - " + cy + " = " + z);
        z = ((int) cx) - 1;
        System.out.println("char (0x000f) -1 = " + z);
        cx = '\uFFFF';
        z = cx;
        System.out.println("(int)( ) = " + z);
        sx = (short) cx;
        System.out.println("(short)( ) = " + sx);
        sx = -32768;
        cx = (char) sx;
        z = (int) sx;
        System.out.println(z + " short-char-int = " + -z);
        sx = -1;
        cx = (char) sx;
        z = cx;        
        System.out.println(sx + " short-char-int = " + z);
        
    } 
}

import com.sun.jdi.ByteValue;

import java.util.Scanner;

/**
 * tipos Primitivos
 * byte
 * short
 * char
 * int
 * long
 * double
 * float
 * boolean
 *
 * Classe Wrappers
 * * Byte
 * * Short
 * * Character
 * * Integer
 * * Long
 * * Double
 * * Float
 * * Boolean
 * programa para conversao do primitivo para wrappers
 */
public class PrimitivoWrappers {
    public static void main(String[] args) {
        int numero = 158000;
        System.out.println(numero);
        short numero2 = (short) numero;
        System.out.println(numero2);
    }
}

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
        //autoboxing
        Long numero = Long.valueOf(12345);
        System.out.println(numero);
        //Boxing
        Long numero2 = 12345L;
        System.out.println(numero2);

    }
}

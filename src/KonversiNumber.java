public class KonversiNumber {

    byte iniByte = 10;

    // Widening Casting
    // byte -> short -> int -> long -> float -> double
    short iniShort = (short) iniByte;
    int iniInt = (int) iniShort;

    // Narrowing Casting
    // double -> float -> long -> int -> short -> byte
    int iniInt2 = 1000;
    byte iniByte2 = (byte) iniInt2; /*Number Overflow*/
}

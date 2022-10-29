public class NonPrimitiveDataType {
    public static void main(String[] args) {
        // Representasi diawali dengan huruf besar
        // Data non primitif bisa memiliki method dan function tersendiri
        // Data non primitif default faluenya null

        Integer iniInteger = 20;
        Double iniDouble = 1.0;
        String iniString = "Ini String";
        Long iniLong = 1_000_000L;
        String defaultNull = null;

        System.out.println(iniLong);
        System.out.println(defaultNull);

        // Casting to Non-Primitive Data Type
        int primitiveInt = 30;
        Integer nonPrimitiveInt = primitiveInt;

        // Casting From Non-Primitive to Primitive Data Type;
        short primitiveShort = nonPrimitiveInt.shortValue();



    }
}

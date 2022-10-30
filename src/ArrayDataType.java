public class ArrayDataType {
    public static void main(String[] args) {
        String[] arrayString = new String[3];
        arrayString[0] = "Muhamad";
        arrayString[1] = "Nur";
        arrayString[2] = "Baihaqi";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        // Array Initializer

        Integer[] arrayInt = new Integer[]{
            10, 20, 30, 40, 50
        };

        int[] arrayInt2 = {
            24, 25, 26, 27
        };

        // Array Length
        System.out.println("Panjang Array: " + arrayString.length);
        arrayInt[3] = null;
        System.out.println(arrayInt.length);

        // Array of Array
        String[][] countries = {
            {"ID", "Indonesia"},
            {"CA", "Canada"},
            {"SG", "Singapore"},
            {"US", "United States of America"}
        };

        System.out.println(countries[1][1]);

    }
}

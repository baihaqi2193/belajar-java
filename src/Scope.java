public class Scope {
    public static void main(String[] args) {
        // System.out.println(i); // Error karena beda blok
    }

    static void scopeDemo(){
        int i = 10;
        System.out.println(i);
    }
}

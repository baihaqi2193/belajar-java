public class Method {
    public static void main(String[] args){
        sayHelloWorld();
        sayHelloWorld();
        printNTimes(12, "Haqi");
        System.out.println(sum(12, 12));
    }

    private static void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    private static void printNTimes(int n, String str){
        for (int i = 1; i <= n; i++){
            System.out.println(str + "("+ i +")");
        }
    }

    // void : Tidak mengembalikan value
    // untuk membuat method mengembalikan value, kita bisa mengganti void menjadi tipe data
    // return yang kita inginkan

    private static Integer sum(int a, int b) {
        return  a + b;
    }
}

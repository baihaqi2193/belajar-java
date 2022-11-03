public class Recursive {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    static  Integer factorial(int num){
        if(num == 1){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    };
}
